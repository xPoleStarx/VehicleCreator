public class Scooter extends Motorbike {
    public Scooter() {
        basePrice = 20000;
    }

    public void setSeatHeating(boolean seatHeating) {
        this.seatHeating = seatHeating;
    }

    @Override
    public String toString() {
        return super.toString() + " with Seat Heating optional";
    }
}