package frc.robot.subsystems;

<<<<<<< HEAD
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
=======
import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

  private final TalonFX motor = new TalonFX(5);

>>>>>>> 8bb0578317d1731920bc446499a656f2c59eac38
  /** Creates a new Shooter. */
  public Shooter() {
    super();
  }

  @Override
  public void periodic() {
<<<<<<< HEAD
    // This method will be called once per scheduler run
    System.out.println("message");
=======
  }

  private void setMotorOutput(double voltage) {
    motor.setControl(new VoltageOut(voltage));
  }

  public void ready() {
    setMotorOutput(10);
>>>>>>> 8bb0578317d1731920bc446499a656f2c59eac38
  }
}
