/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_01;

/**
 * With this Class you can create an Employee Object with name, salary, tax and insurance.
 * It has an increaseSalary method to increase the salary of an Employee, based on a percentage.
 * With its getter and setter you can get or set name, salary, tax or insurance.
 */
public class Employee {

    private String name;
    private double salary;
    private double tax;
    private double insurance;

    /**
     * Constructor of the Employee Class.
     * @param name of the Employee String
     * @param salary of the Employee as double
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * This method increases the salary of an Employee with a given percentage.
     * @param increasePercentage the percentage of the increase of the salary.
     */
    public void increaseSalary(double increasePercentage) {
        this.salary += (salary/100)*increasePercentage;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getTax() {
        return tax;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }
}