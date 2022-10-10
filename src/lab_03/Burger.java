package lab_03;

import java.util.ArrayList;

public class Burger extends Food{
    Cheese cheese = new Cheese();
    private ArrayList<Ingredients> ingredients = new ArrayList<Ingredients>();

    @Override
    public int calculateCost() {
        return super.calculateCost();
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}
