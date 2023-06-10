# Vehicle Inventory System :car: :motorcycle:

A Java program to manage an inventory of vehicles including cars and motorbikes. Each vehicle has a base price and optional features that can be added, such as ABS, music system, airbag, and sunroof for cars, and ABS and seat heating for motorbikes.

## Vehicle Classes

### Vehicle :car: :motorcycle:

- Abstract class representing a vehicle.
- Stores the base price of the vehicle.
- Defines an abstract method to calculate the total price of the vehicle.
- Provides a string representation of the vehicle.

### Car :car:

- Abstract class representing a car, extending the Vehicle class.
- Stores the optional features of a car (ABS, music system, airbag, sunroof).
- Implements the total price calculation based on the base price and selected optional features.
- Provides methods to set the optional features of the car.

#### Sivic :car:

- Concrete class representing a Sivic car model, extending the Car class.
- Sets the base price of 50,000 TL and no optional features.
- Overrides the string representation method to include the selected optional features.

#### Sity :car:

- Concrete class representing a Sity car model, extending the Car class.
- Sets the base price of 40,000 TL and no optional features.
- Overrides the string representation method to include the selected optional features.

### Motorbike :motorcycle:

- Abstract class representing a motorbike, extending the Vehicle class.
- Stores the optional features of a motorbike (ABS, seat heating).
- Implements the total price calculation based on the base price and selected optional features.
- Provides methods to set the optional features of the motorbike.

#### Racer :motorcycle:

- Concrete class representing a Racer motorbike model, extending the Motorbike class.
- Sets the base price of 60,000 TL and no optional features.
- Overrides the string representation method to include the selected optional features.

#### Scooter :motorcycle:

- Concrete class representing a Scooter motorbike model, extending the Motorbike class.
- Sets the base price of 20,000 TL and no optional features.
- Overrides the string representation method to include the selected optional features.

## Inventory Class :briefcase:

- Manages a collection of vehicles in an inventory.
- Allows adding vehicles to the inventory.
- Provides a string representation of the inventory, including the count of cars, motorbikes, and the total price of all vehicles.

## TestInventory Class :test_tube:

- A test class to demonstrate the usage of the Vehicle and Inventory classes.
- Creates instances of different vehicle models with various optional features.
- Adds vehicles to the inventory.
- Prints the inventory.

---

Feel free to customize and extend the code as per your requirements. Enjoy managing your vehicle inventory! :rocket:
