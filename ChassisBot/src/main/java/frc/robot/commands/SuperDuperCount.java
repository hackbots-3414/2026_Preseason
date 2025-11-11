package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class SuperDuperCount extends Command {
  private int counter = 0;
  private boolean reachedHundred = false;
  private boolean reachedZero = false;
  private boolean reachedTwoHundred = false;
  private boolean reachedFifty = false;

  /** Creates a new SuperDuperCount. */
  public SuperDuperCount() {
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    counter = 0;
    reachedHundred = false;
    reachedZero = false;
    reachedTwoHundred = false;
    reachedFifty = false;
    System.out.println("Hey everybody! I am SuperDuperCount and I am here to count!");
    System.out.println("I will count to 100 by 1, and by then, I will count down by 2s all the way back to 0!");
    System.out.println("And then after that, I will go up by 4s to 200 then down by 10 to 50!");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (reachedHundred == true) {
      if (reachedZero == true) {
        if (reachedTwoHundred == true) {
          counter = counter - 10;
          System.out.println("Decreasing counter by 10, the value is now " + counter);
          if (counter == 50) {
            counter = 50;
            reachedFifty = true;
          }
        } else {
          counter = counter + 4;
          System.out.println("Increasing counter by 4, the value is now " + counter);
          if (counter == 200) {
            reachedTwoHundred = true;
            counter = 200;
            System.out.println(" I have reached 200 or higher, I am going to count back down again!");
          }
        }
      } else {
        counter = counter - 2;
        System.out.println("Decreasing counter by 2, the value is now " + counter);
        if (counter == 0); {
          reachedZero = true;
          counter = 0;
          System.out.println("I have reached 0 or lower, time to go count back up!");
        }
      }
    } else {
      counter = counter + 1;
      System.out.println("Increasing counter by 1, the value is now " + counter);
      if (counter == 100) {
        reachedHundred = true;
        counter = 100;
        System.out.println("I have reached 100 or higher on the counter, I am now going to count down!");
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
      if (reachedZero == true) {
        if (reachedTwoHundred == true) {
          if (reachedFifty == true) {
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}
