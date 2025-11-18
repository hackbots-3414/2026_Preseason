package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class NormalCount extends Command {
  private int numberCounter = 0;

  /** Creates a new Jump. */
  public NormalCount() {
  }
  
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Oh hello there! This message is from the SimpleCount command!");
    System.out.println("I count numbers all the way up to 100 in a simple manner!");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    numberCounter = numberCounter + 1;
    System.out.println("The new value for numberCounter is " + numberCounter);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    if (interrupted) {
      System.out.println("Someone interrupted me, so I could not finish counting :(");
      numberCounter = 0;
      System.out.println("Next time you run me, I will restart from " + numberCounter + "!");
    } else{
      System.out.println("It's break time! Goodbye people :)");
    numberCounter = 0;
    System.out.println("Next time you run me, I will restart from " + numberCounter + "!");
    }
    initialize();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (numberCounter >= 100);
  }
}
