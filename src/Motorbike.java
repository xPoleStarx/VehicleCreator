abstract class Motorbike extends Vehicle {
    // A field to store the optional ABS feature
    protected boolean abs;

    // A field to store the optional seat heating feature
    protected boolean seatHeating;

    // A constructor to set the base price and the optional features of the motorbike
    public Motorbike(int basePrice, boolean abs, boolean seatHeating) {
        super(basePrice); // Call the superclass constructor
        this.abs = abs;
        this.seatHeating = seatHeating;
    }

    // A method to get the total price of the motorbike
    public int getTotalPrice() {
        int totalPrice = basePrice; // Start with the base price
        if (abs) { // Add 5000 TL if ABS is selected
            totalPrice += 5000;
        }
        if (seatHeating) { // Add 2000 TL if seat heating is selected
            totalPrice += 2000;
        }
        return totalPrice; // Return the total price
    }

    // A method to set the ABS feature of the motorbike
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    // A method to set the seat heating feature of the motorbike
    public void setSeatHeating(boolean seatHeating) {
        this.seatHeating = seatHeating;
    }
}