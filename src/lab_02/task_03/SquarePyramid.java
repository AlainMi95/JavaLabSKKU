/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_03;

/**
 * This class mimics a Square Pyramid shaped object and extends the Shape3D.
 * It overrides the calculateVolume function to calculate the volume for a Square Pyramid.
 *
 * It holds an edge, height and square instance and its given getter and setter (not the for the square).
 */
public class SquarePyramid extends Shape3D{
    private double edge;
    private double height;
    private Square square;

    /**
     * Constructor of the Square Pyramid Class.
     * @param edge of the Square Pyramid as double
     * @param height of the Square Pyramid as double
     * @param square to calculate the volume
     */
    public SquarePyramid(double edge, double height, Square square) {
        this.edge = edge;
        this.height = height;
        this.square = square;
    }

    @Override
    public double calculateVolume() {
        return square.calculateArea()*(height/3);
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public double getEdge() {
        return edge;
    }

    public double getHeight() {
        return height;
    }

    public Square getSquare() {
        return square;
    }
}