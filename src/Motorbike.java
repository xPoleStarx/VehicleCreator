public abstract class Motorbike extends Vehicle {
    protected boolean abs;
    protected boolean seatHeating;

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public void setSeatHeating(boolean seatHeating) {
        this.seatHeating = seatHeating;
    }

    @Override
    public int calculatePrice() {
        int totalPrice = super.calculatePrice();
        if (abs) {
            totalPrice += 5000;
        }
        if (seatHeating) {
            totalPrice += 2000;
        }
        return totalPrice;
    }
}
