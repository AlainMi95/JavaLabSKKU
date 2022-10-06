/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_03;

/**
 * This class mimics a Cylinder shaped object and extends the Shape3D.
 * It overrides the calculateVolume function to calculate the volume for a cylinder.
 *
 * It holds a radius, height and Circle instance and its given getter and setter (not the for the Circle).
 */
public class Cylinder extends Shape3D{
    private double radius;
    private double height;
    private Circle circle;

    /**
     * Constructor of the Cylinder Class.
     * @param radius of the cylinder as double
     * @param height of the cylinder as double
     * @param circle to calculate the volume
     */
    public Cylinder(double radius, double height, Circle circle) {
        this.radius = radius;
        this.height = height;
        this.circle = circle;
    }

    @Override
    public double calculateVolume() {
        return circle.calculateArea()*height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public Circle getCircle() {
        return circle;
    }
}