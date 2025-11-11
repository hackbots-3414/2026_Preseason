// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class SwitchCount extends Command {
  private int counter = 0;
  private int checker = 0;
  private int counter2 = 0;

  /** Creates a new SwitchCount. */
  public SwitchCount() {
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (counter2 == 5) {
      if (checker == 0) {
        counter = counter + 1;
        System.out.println("The new value is " + counter);
        if (counter == 10) {
          checker = checker + 1;
        }
      } else {
        if (checker == 1) {
          counter = counter - 1;
          System.out.println("The new value is " + counter);
          if (counter == 0) {
            checker = checker - 1;
          }
        }
      }
      counter2 = 0;
    } else {
      counter2 = counter2 + 1;
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    if (interrupted) {
      System.out.println("I was interrupted and could not finish");
    } else {
      System.out.println("If this somehow is said, I finished my task from an error in the code");
    }
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (checker == 2) {
      return true;
    } else {
      return false;
    }
  }
}
