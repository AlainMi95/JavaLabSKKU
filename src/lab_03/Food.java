package lab_03;

public class Food implements Payment{
    private String Type;
    private double cost;

    @Override
    public int calculateCost() {
        return 0;
    }

    public String getType() {
        return Type;
    }

    public double getCost() {
        return cost;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
