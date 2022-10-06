/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_03;

import java.util.Scanner;

/**
 * Main class of the Assignment 2 Task 3 Java Lab SKKU.
 * The user are given 3 options to choose from. Either calculate the volume of Square Pyramid, Cone or Cylinder.
 * After the user has chosen he needs to enter the values for the calculation.
 * Then the volume will be calculated and printed out.
 *
 * This class holds 2 instances main and scanner.
 */
public class Main {

    private static Main MAIN;
    private static Scanner SCANNER;

    /**
     * Main method of Assignment 2 Task 2 Java Lab SKKU.
     * This method starts the application.
     * @param args
     */
    public static void main(String[]args) {
        MAIN = new Main();
        SCANNER = new Scanner(System.in);

        System.out.println("=== Welcome to TEACH MATH ===");
        System.out.println("1. Calculate volume of Square Pyramid.");
        System.out.println("2. Calculate volume of Cone.");
        System.out.println("3. Calculate volume of Cylinder.");

        MAIN.executeAreaOrVolumeCalculationBasedOnUserInput();
    }

    private void executeAreaOrVolumeCalculationBasedOnUserInput() {
        System.out.print("Enter your choice: ");

        switch(SCANNER.nextInt()){      //switch case to calculate the right volume based on the user input.
            case 1:
                System.out.print("Enter edge of Square Pyramid: ");
                double edgeUserInput = SCANNER.nextDouble();

                System.out.print("Enter height of Square Pyramid: ");
                double heightUserInput = SCANNER.nextDouble();

                Square square = new Square(edgeUserInput);

                SquarePyramid squarePyramid = new SquarePyramid(edgeUserInput, heightUserInput, square);
                System.out.print("Volume of Square Pyramid: "+squarePyramid.calculateVolume());
                break;
            case 2:
                System.out.print("Enter radius of Cone: ");
                double coneRadiusUserInput = SCANNER.nextDouble();

                System.out.print("Enter height of Cone: ");
                double coneHeightUserInput = SCANNER.nextDouble();

                Circle circleForCone = new Circle(coneRadiusUserInput);

                Cone cone = new Cone(coneRadiusUserInput, coneHeightUserInput, circleForCone);
                System.out.print("Volume of Cone: "+cone.calculateVolume());
                break;
            case 3:
                System.out.print("Enter radius of cylinder: ");
                double cylinderRadiusUserInput = SCANNER.nextDouble();

                System.out.print("Enter height of cylinder: ");
                double cylinderHeightUSerInput = SCANNER.nextDouble();

                Circle circleForCylinder = new Circle(cylinderRadiusUserInput);

                Cylinder cylinder = new Cylinder(cylinderRadiusUserInput, cylinderHeightUSerInput, circleForCylinder);
                System.out.println("Volume of Cylinder: "+cylinder.calculateVolume());
                break;
        }
    }
}