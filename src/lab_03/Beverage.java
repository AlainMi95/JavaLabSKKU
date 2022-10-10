package lab_03;

public class Beverage extends Food{
    private boolean ice;

    @Override
    public int calculateCost() {
        return super.calculateCost();
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }
}
