package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */
  public Shooter() {
    super();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    System.out.println("message");
  }
}
