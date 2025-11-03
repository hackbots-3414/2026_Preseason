package frc.robot.subsystems;

import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

  private final TalonFX motor = new TalonFX(5);

  /** Creates a new Shooter. */
  public Shooter() {
    super();
  }

  @Override
  public void periodic() {
  }

  private void setMotorOutput(double voltage) {
    motor.setControl(new VoltageOut(voltage));
  }

  public void ready() {
    setMotorOutput(10);
  }
}
