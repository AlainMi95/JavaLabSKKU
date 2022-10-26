/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 26 2022
 * Version: 1.0
 */
package midterm;

/**
 * This class extends the PublicTransport class.
 * With this Class you can create a Taxi Object.
 * It has the overridden method calculatePayment, which can calculate the cost of a Taxi ride.
 * With its getter and setter you can get or set fare per km and distance.
 */
public class Taxi extends PublicTransport{
    private double farePerKm;
    private double distance;

    /**
     * Constructor of the Taxi Class.
     */
    public Taxi() {}

    @Override
    public void calculatePayment() {
        super.calculatePayment();
    }

    public double getFarePerKm() {
        return farePerKm;
    }

    public void setFarePerKm(double farePerKm) {
        this.farePerKm = farePerKm;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
