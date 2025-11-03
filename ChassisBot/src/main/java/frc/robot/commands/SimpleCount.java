package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CommandSwerveDrivetrain;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class SimpleCount extends Command {
  private int counter;

  /** Creates a new Jump. */
  public SimpleCount(CommandSwerveDrivetrain drivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Hello! This is from SimpleCount!");
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
  public void end(boolean interrupted) {
    if (interrupted) {
      System.out.println("Goodbye! I am done counting up, but I did not finish. :(");
    } else {
      System.out.println("Goodbye! I am done counting and finished! :)");
    }
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (counter == 100);
  }
}
