/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 26 2022
 * Version: 1.0
 */
package midterm;

/**
 * This class extends the PublicTransport class.
 * With this Class you can create a Bus Object.
 * It has the overridden method calculatePayment, which can calculate the cost of a Bus ride.
 * With its getter and setter you can get or set Station.
 */
public class Bus extends PublicTransport{

    private Station station;

    /**
     * Constructor of the Bus Class.
     */
    public Bus() {}

    @Override
    public void calculatePayment() {
        super.calculatePayment();
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }
}
