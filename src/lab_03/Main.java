/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 12 2022
 * Version: 1.0
 */
package lab_03;

import java.util.Scanner;

/**
 * Main class of the Assignment 3 Java Lab SKKU.
 * This is a Subway application to help the waiters.
 * The application can be used to place new orders and
 * calculate the cost of the menu.
 *
 * The customer can choose from different burgers, beverage
 * and extras.
 */
public class Main {
    private static Main MAIN = new Main();
    private static Scanner SCANNER = new Scanner(System.in);

    private Burger burger;
    private Cheese cheese;
    private Ingredients ingredients;
    private Extra extra;
    private Beverage beverage;

    private boolean skip = false;

    /**
     * Main method of Assignment 3 Java Lab SKKU.
     * This method starts the application.
     * @param args
     */
    public static void main(String[] args) {
        MAIN.runSubWayApp();
    }

    private void runSubWayApp() {
        printWelcomeScreen();
        int burgerNumber = getUserIntInput();
        if(burgerNumber == 0){System.exit(0);}
        burger = new Burger();
        burger.setCost(getBurgerCostByNumber(burgerNumber));
        burger.setType(getBurgerTypeAsStringByNumber(burgerNumber));

        printCheeseSelectionScreen();
        int cheeseNumber = getUserIntInput();
        cheese = new Cheese();
        cheese.setCost(getCheeseCostByNumber(cheeseNumber));
        cheese.setType(getCheeseTypeAsStringByNumber(cheeseNumber));
        burger.setCheese(cheese);


        while(!skip){
            printIngredientsSelectionScreen();
            int ingredientNumber = getUserIntInput();
            if(ingredientNumber == 0){
                skip = true;
            }else {
                ingredients = new Ingredients();
                ingredients.setCost(getIngredientCostByNumber(ingredientNumber));
                ingredients.setType(getIngredientTypeAsStringByNumber(ingredientNumber));
                burger.getIngredients().add(ingredients);
            }
        }

        printBeverageSelectionScreen();
        int beverageNumber = getUserIntInput();
        if(beverageNumber != 0) {
            beverage = new Beverage();
            beverage.setCost(getBeverageCostByNumber(beverageNumber));
            beverage.setType(getBeverageTypeAsStringByNumber(beverageNumber));

            printIceCelectionScreen();
            int iceOptionUserInput = getUserIntInput();

            if(iceOptionUserInput == 1) {
                beverage.setIce(true);
            }else {
                beverage.setIce(false);
            }
        }

        printExtraSelectionScreen();
        int extraNumber = getUserIntInput();
        if(extraNumber != 0) {
            extra = new Extra();
            extra.setCost(getExtraCostByNumber(extraNumber));
            extra.setType(getExtraTypeAsStringByNumber(extraNumber));
        }

        printCheck();
    }

    private void printWelcomeScreen() {
        System.out.println("========================");
        System.out.println("Welcome to SKKU-SUBWAY!");
        System.out.println("Choose burgers (sandwiches):");
        System.out.println("1. Egg Mayo - 4,000 won");
        System.out.println("2. Chicken Tikka - 5,000 won");
        System.out.println("3. Chicken Ham - 5,000 won");
        System.out.println("4. Roasted Chicken - 5,500 won");
        System.out.println("0. Cancel Order");
        System.out.print("Select Burger (1-5): ");
    }

    private void printCheeseSelectionScreen() {
        System.out.println("========================");
        System.out.println("Select Cheese Type: ");
        System.out.println("1. American Cheese - (+0 won)");
        System.out.println("2. Swiss - (+100 won)");
        System.out.println("3. Cheddar - (+0 won)");
        System.out.print("Select Cheese (1-3): ");
    }

    private void printIngredientsSelectionScreen() {
        System.out.println("========================");
        System.out.println("1. Lettuce - (+0 won)");
        System.out.println("2. Tomatoes - (+0 won)");
        System.out.println("3. Cucumbers - (+50 won)");
        System.out.println("4. Olives - (+50 won)");
        System.out.println("0. Skip");
        System.out.print("Select Ingredients (1-4): ");
    }

    private void printBeverageSelectionScreen() {
        System.out.println("========================");
        System.out.println("Select Beverages: ");
        System.out.println("1. Cola - 1,000 won");
        System.out.println("2. Fanta - 1,100 won");
        System.out.println("3. Chilsung Cider - 900 won");
        System.out.println("4. Zero Cola - 1,200 won");
        System.out.println("5. Coffee - 2,000 won");
        System.out.println("0. Skip");
        System.out.print("Select Beverage (1-5): ");
    }

    private void printIceCelectionScreen() {
        System.out.println("========================");
        System.out.print("With ice? (0 [no] or 1 [yes]):");

    }

    private void printExtraSelectionScreen() {
        System.out.println("========================");
        System.out.println("Select Extras:");
        System.out.println("1. Cookies - 1,500 won");
        System.out.println("2. French Fries - 1,300 won");
        System.out.println("3. Chips - 1,700 won");
        System.out.println("0. Skip");
        System.out.print("Select Extra (1-3): ");
    }

    private void printCheck(){
        System.out.println("========================");
        int burgerCost = burger.calculateCost();
        System.out.println("| Burger (with cheese and ingredients): "+burgerCost);

        int beverageCost = beverage.calculateCost();
        if(beverage.isIce()) {
            System.out.println("| Beverage (with ice): "+beverageCost);
        }else {
            System.out.println("| Beverage (without ice): "+beverageCost);
        }

        int extraCost = 0;
        if(extra != null) {
            extraCost = extra.calculateCost();
            System.out.println("| Extra: " + extraCost);
        }
        int totalCost = burgerCost+beverageCost+extraCost;
        System.out.println("| Total: "+totalCost);
    }

    private int getUserIntInput() {
        return SCANNER.nextInt();
    }

    private String getBurgerTypeAsStringByNumber(int burgerNumber) {
        switch (burgerNumber) {
            case 1: return "Egg Mayo";
            case 2: return "Chicken Tikka";
            case 3: return "Chicken Ham";
            case 4: return "Roasted Chicken";
        }
        return null;
    }

    private int getBurgerCostByNumber(int burgerNumber) {
        switch (burgerNumber) {
            case 1: return 4000;
            case 2:
            case 3: return 5000;
            case 4: return 5500;
        }
        return 0;
    }

    private String getCheeseTypeAsStringByNumber(int cheeseNumber) {
        switch (cheeseNumber) {
            case 1: return "American Cheese";
            case 2: return "Swiss";
            case 3: return "Cheddar";
        }
        return null;
    }

    private int getCheeseCostByNumber(int cheeseNumber) {
        switch (cheeseNumber) {
            case 1:
            case 3: return 0;
            case 2: return 100;
        }
        return 0;
    }

    private String getIngredientTypeAsStringByNumber(int ingredientNumber) {
        switch (ingredientNumber) {
            case 1: return "Lettuce";
            case 2: return "Tomatoes";
            case 3: return "Cucumber";
            case 4: return "Olives";
        }
        return null;
    }

    private int getIngredientCostByNumber(int ingredientNumber) {
        switch (ingredientNumber) {
            case 1:
            case 2: return 0;
            case 3:
            case 4: return 50;
        }
        return 0;
    }

    private String getBeverageTypeAsStringByNumber(int beverageNumber) {
        switch (beverageNumber) {
            case 1: return "Cola";
            case 2: return "Fanta";
            case 3: return "Chilsung Cider";
            case 4: return "Zero Cola";
            case 5: return "Coffee";
        }
        return null;
    }

    private int getBeverageCostByNumber(int beverageNumber) {
        switch (beverageNumber) {
            case 1: return 1000;
            case 2: return 1100;
            case 3: return 900;
            case 4: return 1200;
            case 5: return 2000;
        }
        return 0;
    }

    private String getExtraTypeAsStringByNumber(int extraNumber) {
        switch (extraNumber) {
            case 1: return "Cookies";
            case 2: return "French Fries";
            case 3: return "Chips";
        }
        return null;
    }

    private int getExtraCostByNumber(int extraNumber) {
        switch (extraNumber) {
            case 1: return 1500;
            case 2: return 1300;
            case 3: return 1700;
        }
        return 0;
    }
}
