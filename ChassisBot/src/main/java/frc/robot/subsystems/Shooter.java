package frc.robot.subsystems;

import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
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

  private double getMotorSpeed() {
    return motor.getVelocity().getValueAsDouble();
  }

  public Command ready() {
    // Set the motor output to 10
    // THEN, WAIT UNTIL motor speed is greater than 20.
    return Commands.sequence(
      this.runOnce(() -> setMotorOutput(10)),
      Commands.waitUntil(() -> getMotorSpeed() > 20))
      
      .finallyDo(interrupted -> {
        if (interrupted) {
          motor.stopMotor();
        }
      });
  }
}
