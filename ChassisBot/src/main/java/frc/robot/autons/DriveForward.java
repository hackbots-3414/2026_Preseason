// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.autons;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CommandSwerveDrivetrain;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class DriveForward extends Command {

  private CommandSwerveDrivetrain drivetrain;
  private Pose2d initialPosition;
  private double targetDistance;

  /** Creates a new DriveForward. */
  public DriveForward(CommandSwerveDrivetrain drivetrain){
    addRequirements(drivetrain);

    this.drivetrain = drivetrain;

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    initialPosition = drivetrain.getPose();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  /**
   * @return true when the robot has reached the target distance
   */
  @Override
  public boolean isFinished() {
    if targetDistance 
    return true;
  }
}
