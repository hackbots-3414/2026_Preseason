package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class ReverseCount extends Command {
  private int counter = 100;

  /** Creates a new ComplexCount. */
  public ReverseCount() {
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("I am ReverseCount");
    System.out.println("I count down from 100 to 0");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    counter --;
    System.out.println(counter + " left.");
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    if (interrupted) {
      System.out.println("I was interrupted :(");
    counter = 100;
    System.out.println("The next time you run me, I will restart from" + counter);
    } else {
      System.out.println("Goodbye, task completed successfully");
    counter = 100;
    System.out.println("The next time you run me, I will restart from " + counter);
    }
    initialize();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (counter == 0);
  }
}
