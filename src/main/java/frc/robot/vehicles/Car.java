package frc.robot.vehicles;

public class Car {
    private double currSpeed = 0;
    private boolean broken = false;
    public Car() {}
    public double getCurrSpeed() {
        return currSpeed;
    }
    public void setCurrentSpeed(double currSpeed) {
        this.currSpeed = currSpeed;
    }
    public void drive() {
        // ! means not, inverting any true or false. 
        // so, this tests if our car's broken value evaluates to not true
        if (!broken) { 
            // a += is just a streamlined way of doing currSpeed = currSpeed + 5;
            currSpeed += 5; 
        }
    }
    public void brake() {
        currSpeed -= 5;
    }
    public void crash() {
        broken = true;
    }
    public void repair() {
        broken = false;
    }
}
