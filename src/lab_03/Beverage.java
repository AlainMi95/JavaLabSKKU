/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 12 2022
 * Version: 1.0
 */
package lab_03;

/**
 * This class extends the Food class.
 * With this Class you can create a Beverage Object with or without ice.
 * It has the overridden method calculateCost, which can calculate the cost of a Beverage object.
 * With its getter and setter you can get or set ice.
 */
public class Beverage extends Food{
    private boolean ice;

    @Override
    public int calculateCost() {
        return this.getCost();
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }
}
