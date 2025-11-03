// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CommandSwerveDrivetrain;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class ComplexCount extends Command {
  private int counter = 100;
  /** Creates a new DriveCommand. */
  public ComplexCount(CommandSwerveDrivetrain drivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Hello from ComplexCount!");
    counter = 100;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    System.out.println("The number is " + counter);
    counter --;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    if (interrupted) {
      System.out.println("Goodbye! I'm finished - but I didn't count down all the way.");
    } else {
      System.out.println("Goodbye! I have counted down to zero.");
    }
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (counter == 0);
  }
}
