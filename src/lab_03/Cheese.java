/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 12 2022
 * Version: 1.0
 */
package lab_03;

/**
 * This class extends the Food class.
 * With this Class you can create a Cheese Object.
 * It has the overridden method calculateCost, which can calculate the cost of a Cheese object.
 */
public class Cheese extends Food{

    /**
     * Constructor of the Cheese Class.
     */
    public Cheese() {}

    @Override
    public int calculateCost() {
        return this.getCost();
    }
}
