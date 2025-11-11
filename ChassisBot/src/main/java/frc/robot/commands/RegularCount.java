// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CommandSwerveDrivetrain;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
<<<<<<<< HEAD:ChassisBot/src/main/java/frc/robot/commands/DriveCommand.java
public class DriveCommand extends Command {
  /** Creates a new DriveCommand. */
  public DriveCommand(CommandSwerveDrivetrain drivetrain) {
========
public class RegularCount extends Command {
  private int counter;

  /** Creates a new Jump. */
  public RegularCount() {
>>>>>>>> fc82c48ed201a9a86c669e1f4b8970c552117813:ChassisBot/src/main/java/frc/robot/commands/RegularCount.java
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    counter = 0;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    counter ++;
    System.out.println("The next number is " + counter);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (counter == 100);
  }
}
