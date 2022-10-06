/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_03;

/**
 * This class mimics a Square shaped object and extends the Shape2D.
 * It overrides the calculateArea function to calculate the area for a square.
 *
 * It holds an edge instance and its given getter and setter.
 */
public class Square extends Shape2D{
    private double edge;

    /**
     * Constructor of the Square Class.
     * @param edge of the square as double
     */
    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double calculateArea() {
        return Math.pow(edge, 2);
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }
}
