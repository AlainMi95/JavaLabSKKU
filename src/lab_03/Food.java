package lab_03;

public class Food implements Payment{
    private String Type;
    private int cost;

    @Override
    public int calculateCost() {
        return 0;
    }

    public String getType() {
        return Type;
    }

    public int getCost() {
        return cost;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
