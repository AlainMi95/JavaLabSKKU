/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 26 2022
 * Version: 1.0
 */
package midterm;

/**
 * This class symbolises a Station.
 * With this Class you can create a Station Object for an eg. bus or train.
 * With its getter and setter you can get or set fare per station or amount of stations.
 */
public class Station {
    private double farePerStation;
    private int nStations;

    /**
     * Constructor of the Station Class.
     */
    public Station() {}

    public double getFarePerStation() {
        return farePerStation;
    }

    public void setFarePerStation(double farePerStation) {
        this.farePerStation = farePerStation;
    }

    public int getnStations() {
        return nStations;
    }

    public void setnStations(int nStations) {
        this.nStations = nStations;
    }
}
