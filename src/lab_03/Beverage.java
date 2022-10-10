package lab_03;

public class Beverage extends Food{
    private boolean ice;

    @Override
    public int calculateCost() {
        return this.getCost();
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }
}
