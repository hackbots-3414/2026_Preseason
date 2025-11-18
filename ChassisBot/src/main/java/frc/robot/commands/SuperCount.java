package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class SuperCount extends Command {
  private int counter = 0;
  private boolean reachedHundred = false;

  /** Creates a new SuperComplexCount. */
  public SuperCount() {
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    counter = 0;
    reachedHundred = false;
    System.out.println("Hey everybody! I am SuperCount and I am here to count!");
    System.out.println("I will count to 100 by 1, and by then, I will count down by 2s all the way back to 0!");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (reachedHundred == true) {
      counter = counter - 2;
      System.out.println("Decreasing counter by 2, the value is now " + counter);
    } else {
      counter = counter + 1;
      System.out.println("Increasing counter by 1, the value is now " + counter);
      if (counter >= 100) {
        reachedHundred = true;
        System.out.println("Reached 100 on the counter! :D");
        System.out.println("Now I am switching to subtraction instead of addition!");
      }
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    if (interrupted) {
      System.out.println("I was interrupted and could not finish my task... :(");
      System.out.println("Next time you run me, I will restart from the beginning! :)");
    } else {
      System.out.println("I finished my task successfully! :D");
      System.out.println("Next time you run me, I will restart from the beginning! :)");
    }
    initialize();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (reachedHundred == true) {
      if (counter == 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}
