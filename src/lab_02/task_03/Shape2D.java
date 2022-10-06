/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_03;

/**
 * This super class is an 2D shape object.
 * It has method to calculate the area of a 2D shaped object.
 *
 * It holds a area instance and its given getter and setter.
 */
public class Shape2D {
    private double area;

    /**
     * Constructor of the Shape2D Class.
     */
    public Shape2D() {}

    /**
     * Calculate the area of a 2D shaped object and return the result as double.
     * @return the area of an 2D object shape as double.
     */
    public double calculateArea() {
        return 0;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}