/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_01;

import java.util.Scanner;

/**
 * Main class of the Assignment 2 Task 1 Java Lab SKKU.
 * This class creates two employees (with name and salary).
 * After that the employee information will be printed out.
 * Then the tax and insurance will be calculated and updated.
 * The employee information will be printed out again.
 * After that the salary will be increased and the information will be printed again.
 *
 * This class holds 2 instances TAX_PERCENTAGE and  INSURANCE_PERCENTAGE which can be changed if needed.
 */
public class Main {
    private static final double TAX_PERCENTAGE = 8.8;
    private static final double INSURANCE_PERCENTAGE = 6.5;

    /**
     * Main method of Assignment 2 Task 1 Java Lab SKKU.
     * This method starts the application.
     * @param args
     */
    public static void main(String[]args) {
        Main main = new Main();

        Employee firstEmployee = new Employee("John", 60000);
        Employee secondEmployee = new Employee("Mark", 90000);

        main.updateTaxAndInsuranceOfEmployee(firstEmployee);
        main.updateTaxAndInsuranceOfEmployee(secondEmployee);

        main.printEmployeeInformation(firstEmployee);
        main.printEmployeeInformation(secondEmployee);

        firstEmployee.increaseSalary(main.salaryIncreaseForEmployeeUserInput(firstEmployee));
        secondEmployee.increaseSalary(main.salaryIncreaseForEmployeeUserInput(secondEmployee));

        main.updateTaxAndInsuranceOfEmployee(firstEmployee);
        main.updateTaxAndInsuranceOfEmployee(secondEmployee);

        System.out.println("After Salary Increase");

        main.printEmployeeInformation(firstEmployee);
        main.printEmployeeInformation(secondEmployee);
    }

    private double calculateTax(double salary, double taxPercentage) {
        return (salary/100)*taxPercentage;
    }

    private double calculateInsurance(double salary, double insurancePercentage) {
        return (salary/100)*insurancePercentage;
    }

    private void printEmployeeInformation(Employee employee) {
        System.out.println("==============================");
        System.out.println("Employee Information");
        System.out.println("Name: "+employee.getName());
        System.out.println("Salary: "+employee.getSalary());
        System.out.println("Tax: "+employee.getTax());
        System.out.println("Insurance: "+employee.getInsurance());
    }

    private double salaryIncreaseForEmployeeUserInput(Employee employee) {
        System.out.println("==============================");
        System.out.print("Increase salary (in percentage) for "+employee.getName()+": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private void updateTaxAndInsuranceOfEmployee(Employee employee) {
        employee.setTax(calculateTax(employee.getSalary(), TAX_PERCENTAGE));
        employee.setInsurance(calculateInsurance(employee.getSalary(), INSURANCE_PERCENTAGE));
    }
}