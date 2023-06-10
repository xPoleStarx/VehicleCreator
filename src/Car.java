abstract class Car extends Vehicle {
    // A field to store the optional ABS feature
    protected boolean abs;

    // A field to store the optional music system feature
    protected boolean musicSystem;

    // A field to store the optional air bag feature
    protected boolean airBag;

    // A field to store the optional sun roof feature
    protected boolean sunRoof;

    // A constructor to set the base price and the optional features of the car
    public Car(int basePrice, boolean abs, boolean musicSystem, boolean airBag, boolean sunRoof) {
        super(basePrice); // Call the superclass constructor
        this.abs = abs;
        this.musicSystem = musicSystem;
        this.airBag = airBag;
        this.sunRoof = sunRoof;
    }

    // A method to get the total price of the car
    public int getTotalPrice() {
        int totalPrice = basePrice; // Start with the base price
        if (abs) { // Add 5000 TL if ABS is selected
            totalPrice += 5000;
        }
        if (musicSystem) { // Add 1000 TL if music system is selected
            totalPrice += 1000;
        }
        if (airBag) { // Add 3000 TL if air bag is selected
            totalPrice += 3000;
        }
        if (sunRoof) { // Add 2000 TL if sun roof is selected
            totalPrice += 2000;
        }
        return totalPrice; // Return the total price
    }

    // A method to set the ABS feature of the car
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    // A method to set the music system feature of the car
    public void setMusicSystem(boolean musicSystem) {
        this.musicSystem = musicSystem;
    }

    // A method to set the air bag feature of the car
    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    // A method to set the sun roof feature of the car
    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

}
