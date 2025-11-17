// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.autons;

import com.ctre.phoenix6.swerve.SwerveRequest;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CommandSwerveDrivetrain;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class DriveForward extends Command {

  private CommandSwerveDrivetrain drivetrain;
  private Pose2d finalPosition;

  /** Creates a new DriveForward. 
   * @param drivetrain
   * @param finalPosition relative to starting position
  */
  public DriveForward(CommandSwerveDrivetrain drivetrain, Pose2d finalPosition) { 
    addRequirements(drivetrain);

    this.drivetrain = drivetrain;
    this.finalPosition = finalPosition;

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    finalPosition = finalPosition.plus(new Transform2d(drivetrain.getPose().getMeasureX().magnitude(), drivetrain.getPose().getMeasureY().magnitude(), new Rotation2d(0)));
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivetrain.setControl(new SwerveRequest.ApplyRobotSpeeds().withSpeeds(
      new ChassisSpeeds(computeChassisSpeed(computeRemainingDistanceX()),
       computeChassisSpeed(computeRemainingDistanceY()), 
       0)));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivetrain.setControl(new SwerveRequest.ApplyRobotSpeeds().withSpeeds(new ChassisSpeeds(0, 0, 0)));
  }

  /**
   * @return true when the robot has reached the target distance
   */
  @Override
  public boolean isFinished() {
    return Math.abs(computeRemainingDistanceX()) <= 0.3 && Math.abs(computeRemainingDistanceY()) <= 0.3;
  }

  private double computeRemainingDistanceX() {
    return finalPosition.minus(drivetrain.getPose()).getMeasureX().magnitude();
  }

  private double computeRemainingDistanceY(){
    return finalPosition.minus(drivetrain.getPose()).getMeasureY().magnitude();
  }

  private double computeChassisSpeed(double remainingDistance){
    if( Math.abs(remainingDistance) <= 0.3){
      return 0;
    }

    return 0.5 * Math.signum(remainingDistance);
    
  }
}