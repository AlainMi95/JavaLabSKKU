package lab_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Main MAIN = new Main();
    private static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        MAIN.printWelcomeScreen();
        int burgerType = MAIN.getUserIntInput();
        MAIN.printCheeseSelectionScreen();
        int cheeseType = MAIN.getUserIntInput();

        boolean skip = false;
        ArrayList al = new ArrayList();
        while(!skip){
            MAIN.printIngredientsSelectionScreen();
            int ingredient = MAIN.getUserIntInput();
            if(ingredient ==0){
                skip = true;
            }else {
                al.add(ingredient);
            }
        }



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

    private int getUserIntInput() {
        return SCANNER.nextInt();
    }
}
