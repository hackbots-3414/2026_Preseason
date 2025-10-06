// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

/**
 * From geometry, we know a Square is a special kind of Rectangle where the
 * height and width are equal.
 * 
 * In Java, we can model this by "extending" a parent class, Rectangle in this
 * case. Doing so means we inherit all of the parent's methods and fields and
 * do not need to rewrite them here unless we wish to change their behavior.
 * 
 * Is it better for Square to extend Rectangle or Rectangle to extend Square?
 * 
 * If Square were the base class, it would have a single double for sideLength,
 * and the area() and perimeter() methods would only know about the one
 * variable. Rectangle would need to contain a field, otherSideLength, and
 * then override the area() and perimeter() methods to use the sideLength from
 * Square and otherSideLength from itself.
 * 
 * With Rectangle as the base class, Rectangle has 2 fields for height and
 * width, and its area() and perimeter() methods are aware of both. Square then
 * overrides the setWidth() and setHeight() methods to ensure width and height
 * are forced to the same values.
 * 
 * You be the judge as to which is more efficient.
 */
public class Square extends Rectangle {

    /**
     * We'll supply a default constructor because they are handy and in this case,
     * harmless.
     */
    public Square() {
        // we do want the parent to initialize its fields. We can make that happen with
        // a call to super(), where the "super" keyword indicates the parent, and the
        // parentheses indicate it is a constructor call.
        super();
    }

    /**
     * A Square is a Rectangle, but we want to emphasize all sides are the same
     * length. We can do this by supplying a constructor that takes only 1
     * parameter.
     * 
     * Because we will not supply a two parameter of type double constructor, we
     * effectively make the parent's Rectangle(double, double) constructor invisble
     * outside this class.
     * 
     * @param sideLength
     */
    public Square(double sideLength) {
        // while we're hiding the parent's 2 double constructor, we still want to call
        // it to ensure the height and width fields get set properly.
        super(sideLength, sideLength);
    }

    /**
     * While a Square "isa" Rectangle, we do need to change the behavior of
     * setHeight().
     * On this class, it should set both the height and width of the parent
     * Rectangle.
     * The fancy name in object-oriented programming for this is "polymorphism".
     */
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    /**
     * Since width and height are the same in a Square, we can point setWidth() to
     * setHeight() and only write the code once.
     */
    @Override
    public void setWidth(double width) {
        setHeight(width);
    }

}
