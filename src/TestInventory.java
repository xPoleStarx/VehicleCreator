public class TestInventory {
    public static void main(String[] args){
        Inventory inventory = new Inventory(); // Create an empty inventory
        Car car = new Sivic(); // Create a Sivic car with no optional features
        car.setAbs(true); // Set ABS feature to true
        car.setMusicSystem(true); // Set music system feature to true
        car.setAirBag(true); // Set airbag feature to true
        inventory.add(car); // Add the car to the inventory

        car = new Sivic(); // Create another Sivic car with no optional features
        car.setAbs(true); // Set ABS feature to true
        car.setSunRoof(true); // Set sunroof feature to true
        inventory.add(car); // Add the car to the inventory
        car = new Sity(); // Create a Sity car with no optional features
        car.setMusicSystem(true); // Set music system feature to true
        car.setSunRoof(true); // Set sunroof feature to true
        inventory.add(car); // Add the car to the inventory

        Motorbike mBike = new Racer(); // Create a Racer motorbike with no optional features
        mBike.setAbs(true); // Set ABS feature to true
        mBike.setSeatHeating(true);// Set seat heating feature to true
        inventory.add(mBike); // Add the motorbike to the inventory
        
        mBike = new Scooter();// Create a Scooter motorbike with no optional features
        mBike.setSeatHeating(true);// Set seat heating feature to true
        inventory.add(mBike); // Add the motorbike to the inventory
        //print the inventory
        System.out.println(inventory);
    }
}