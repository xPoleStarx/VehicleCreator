class Sivic extends Car {

    // A constructor to create a Sivic car with a base price of 50000 TL and no optional features
    public Sivic() {
        super(50000, false, false, false, false); // Call the superclass constructor
    }

    // A method to return a string representation of the Sivic car model
    public String toString() {
        String s = "Sivic"; // Start with the model name
        if (abs || musicSystem || airBag || sunRoof) { // If any optional feature is selected, add "with"
            s += " with";
        }
        if (abs) { // Add "ABS" if ABS is selected
            s += " ABS";
        }
        if (musicSystem) { // Add ", Music System" if music system is selected
            s += ", Music System";
        }
        if (airBag) { // Add ", Air Bag" if air bag is selected
            s += ", Air Bag";
        }
        if (sunRoof) { // Add ", Sunroof" if sun roof is selected
            s += ", Sunroof";
        }
        s += " having a total price of " + getTotalPrice() + " TL"; // Add the total price at the end
        return s; // Return the string representation
    }
}