/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_03;

/**
 * This super class is an 3D shape object.
 * It has method to calculate the volume of a 3D shaped object.
 *
 * It holds a volume instance and its given getter and setter.
 */
public class Shape3D {

    private double volume;

    /**
     * Constructor of the Shape3D Class.
     */
    public Shape3D() {}

    /**
     * Calculate the volume of a 3D shaped object and return the result as double.
     * @return the volume of an 3D object shape as double.
     */
    public double calculateVolume() {
        return 0;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }
}