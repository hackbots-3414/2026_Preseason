// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

/**
 * Defines the operations (methods) you can perform upon a Shape.
 * 
 * An interface allows for many different implementations. In geometry, a Circle
 * is very different from a Rectangle, yet, we know that both are shapes.
 * 
 * Interestingly, all methods in an interface are assumed to be public
 * visibility - no need to state "public" at the beginning of every method.
 */
public interface Shape {
    /**
     * 
     * @return the perimeter of the Shape
     */
    double perimeter();

    /**
     * 
     * @return the area of the Shape
     */
    double area();
}
