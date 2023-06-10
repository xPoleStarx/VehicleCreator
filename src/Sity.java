class Sity extends Car {

    // A constructor to create a Sity car with a base price of 40000 TL and no optional features
    public Sity() {
        super(40000, false, false, false, false); // Call the superclass constructor
    }

    // A method to return a string representation of the Sity car model
    public String toString() {
        String s = "Sity"; // Start with the model name
        if (abs || musicSystem || airBag || sunRoof) { // If any optional feature is selected, add "with"
            s += " with";
        }
        if (abs) { // Add "ABS" if ABS is selected
            s += " ABS";
        }
        if (musicSystem) { // Add ", Music System" if music system is selected
            s += ", Music System";
        }
        if (airBag) { // Add ", AirBag" if airbag is selected
            s += ", Air Bag";
        }
        if (sunRoof) { // Add ", Sunroof" if sunroof is selected
            s += ", Sunroof";
        }
        s += " having a total price of " + getTotalPrice() + " TL"; // Add the total price at the end
        return s; // Return the string representation
    }
}