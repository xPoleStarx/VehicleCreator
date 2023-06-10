abstract class Vehicle {
    // A field to store the base price of the vehicle
    protected int basePrice;

    // A constructor to set the base price of the vehicle
    public Vehicle(int basePrice) {
        this.basePrice = basePrice;
    }

    // An abstract method to get the total price of the vehicle
    public abstract int getTotalPrice();

    // A method to return a string representation of the vehicle
    public String toString() {
        return "Vehicle with a total price of " + getTotalPrice() + " TL";
    }
}