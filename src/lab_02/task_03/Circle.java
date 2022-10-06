/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_03;

/**
 * This class mimics a Circle shaped object and extends the Shape2D.
 * It overrides the calculateArea function to calculate the area for a circle.
 *
 * It holds a radius instance and its given getter and setter.
 */
public class Circle extends Shape2D{
    private double radius;

    /**
     * Constructor of the Circle Class.
     * @param radius of the circle as double
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
