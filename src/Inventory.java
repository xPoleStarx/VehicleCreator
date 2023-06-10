import java.util.ArrayList;

class Inventory {
    // A field to store a list of vehicles in the inventory
    private ArrayList<Vehicle> vehicles;

    // A constructor to create an empty inventory
    public Inventory() {
        vehicles = new ArrayList<Vehicle>(); // Initialize the list of vehicles
    }

    // A method to add a vehicle to the inventory
    public void add(Vehicle vehicle) {
        vehicles.add(vehicle); // Add the vehicle to the list
    }

    // A method to return a string representation of the inventory
    public String toString() {
        String s = ""; // Start with an empty string
        int carCount = 0; // A variable to count the number of cars in the inventory
        int motorbikeCount = 0; // A variable to count the number of motorbikes in the inventory
        int totalPrice = 0; // A variable to store the total price of all vehicles in the inventory
        for (Vehicle vehicle : vehicles) { // Loop through each vehicle in the list
            s += vehicle + "\n"; // Add the string representation of the vehicle and a new line to the string
            if (vehicle instanceof Car) { // If the vehicle is a car, increment the car count
                carCount++;
            }
            if (vehicle instanceof Motorbike) { // If the vehicle is a motorbike, increment the motorbike count
                motorbikeCount++;
            }
            totalPrice += vehicle.getTotalPrice(); // Add the total price of the vehicle to the total price
        }
        s += "TOTAL : " + vehicles.size() + " Vehicles including " + carCount + " Cars and " + motorbikeCount + " Motorbikes having a total price of " + totalPrice + " TL"; // Add the summary information to the string
        return s; // Return the string representation
    }
}