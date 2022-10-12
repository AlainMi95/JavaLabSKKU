/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 12 2022
 * Version: 1.0
 */
package lab_03;

import java.util.ArrayList;

/**
 * This class extends the Food class.
 * With this Class you can create a Burger Object with Cheese and ingredients.
 * It has the overridden method calculateCost, which can calculate the cost of a Burger object.
 * With its getter and setter you can get or set cheese and ingredients.
 */
public class Burger extends Food{
    Cheese cheese = new Cheese();
    private ArrayList<Ingredients> ingredients = new ArrayList<Ingredients>();

    @Override
    public int calculateCost() {
        int totalCost = 0;

        totalCost += this.getCost();
        totalCost += cheese.getCost();

        for (Ingredients ingredient:ingredients) {
            totalCost += ingredient.getCost();
        }
        return totalCost;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
}
