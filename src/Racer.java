public class Racer extends Motorbike {
    public Racer() {
        basePrice = 60000;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public void setSeatHeating(boolean seatHeating) {
        this.seatHeating = seatHeating;
    }

    @Override
    public String toString() {
        return super.toString() + " with ABS and Seat Heating optionals";
    }
}