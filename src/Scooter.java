class Scooter extends Motorbike {

    // A constructor to create a Scooter motorbike with a base price of 20000 TL and no optional features
    public Scooter() {
        super(20000, false, false); // Call the superclass constructor
    }

    // A method to return a string representation of the Scooter motorbike model
    public String toString() {
        String s = "Scooter"; // Start with the model name
        if (abs || seatHeating) { // If any optional feature is selected, add "with"
            s += " with";
        }
        if (abs) { // Add "ABS" if ABS is selected
            s += " ABS";
        }
        if (seatHeating) { // Add ", Seat Heating" if seat heating is selected
            s += ", Seat Heating";
        }
        s += " having a total price of " + getTotalPrice() + " TL"; // Add the total price at the end
        return s; // Return the string representation
    }
}