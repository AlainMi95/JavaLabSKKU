package midterm;

public class PublicTransport implements Payable{
    private String model;
    private double baseFare;
    private double totalFare;

    public PublicTransport() {

    }

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
