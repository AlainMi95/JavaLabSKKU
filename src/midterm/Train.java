/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 26 2022
 * Version: 1.0
 */
package midterm;

/**
 * This class extends the PublicTransport class.
 * With this Class you can create a Train Object.
 * It has the overridden method calculatePayment, which can calculate the cost of a Train ride.
 * With its getter and setter you can get or set Station.
 */
public class Train extends PublicTransport{

    private Station station;

    /**
     * Constructor of the Train Class.
     */
    public Train() {}

    @Override
    public void calculatePayment() {
        if(station.getnStations()<5) {
            setTotalFare(getBaseFare());
        }else {
            double fair = getBaseFare()+(station.getnStations()-5)* station.getFarePerStation();
            setTotalFare(fair);
        }
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }
}
