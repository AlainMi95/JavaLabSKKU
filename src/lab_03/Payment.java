/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 12 2022
 * Version: 1.0
 */
package lab_03;

/**
 * Interface class for Assignment 3 Java Lab SKKU.
 * It's the interface to calculate payment for different objects.
 */
public interface Payment {

    /**
     * This method calculates the cost of a product or item.
     * @return the cost of a product as an int
     */
    int calculateCost();
}
