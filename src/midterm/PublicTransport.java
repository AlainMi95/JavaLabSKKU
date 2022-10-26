/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 26 2022
 * Version: 1.0
 */
package midterm;

/**
 * This class implements the Payable interface with its given methods.
 * With this Class you can create a PublicTransport Object.
 * It has the overridden method calculatePayment, which can calculate the cost of a transport.
 * With its getter and setter you can get or set model, baseFare and totalFare.
 */
public class PublicTransport implements Payable{
    private String model;
    private double baseFare;
    private double totalFare;

    /**
     * Constructor of the PublicTransport Class.
     */
    public PublicTransport() {}

    @Override
    public void calculatePayment() {

    }

    public String getModel() {
        return model;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }
}
