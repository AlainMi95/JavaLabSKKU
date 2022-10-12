/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 12 2022
 * Version: 1.0
 */
package lab_03;

/**
 * This class extends the Food class.
 * With this Class you can create an Extra Object.
 * It has the overridden method calculateCost, which can calculate the cost of an Extra object.
 */
public class Extra extends Food{

    /**
     * Constructor of the Extra Class.
     */
    public Extra() {}

    @Override
    public int calculateCost() {
        return this.getCost();
    }
}
