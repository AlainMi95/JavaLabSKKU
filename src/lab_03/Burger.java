package lab_03;

import java.util.ArrayList;

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
