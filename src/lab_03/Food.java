/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 12 2022
 * Version: 1.0
 */
package lab_03;

/**
 * This class implements the Payment interface with its given methods.
 * With this Class you can create a Food Object with type and cost.
 * It has the overridden method calculateCost, which can calculate the cost of a food object.
 * With its getter and setter you can get or set type and cost.
 */
public class Food implements Payment{
    private String type;
    private int cost;

    /**
     * Constructor of the Food Class.
     */
    public Food() {}

    @Override
    public int calculateCost() {
        return 0;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    public void setType(String type) {
        type = type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
