import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Main;

public class ButtonTest {

    // Assuming Joystick is from WPILib (used in FRC)
    private static CommandXboxController joystick = new Joystick(0); // 0 is the port number

    public static void main(String[] args) {
        while (true) {
            if (joystick.getRawButton(0)) {
                turnIntakeOn();
            } else {
                turnIntakeOff();
            }

            // Add a short delay to avoid excessive CPU usage
            try {
                Thread.sleep(20); // 20 ms delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void turnIntakeOn() {
        System.out.println("Intake ON");
        // Add actual motor control code here
    }

    public static void turnIntakeOff() {
        System.out.println("Intake OFF");
        // Add actual motor control code here
    }
}
