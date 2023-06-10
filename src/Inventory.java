import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Vehicle> vehicles;

    public Inventory() {
        vehicles = new ArrayList<>();
    }

    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int totalVehicles = 0;
        int totalPrice = 0;

        for (Vehicle vehicle : vehicles) {
            totalVehicles++;
            totalPrice += vehicle.calculatePrice();
            sb.append(vehicle.toString()).append(" having a total price of ").append(vehicle.calculatePrice()).append(" TL\n");
        }

        sb.append("TOTAL : ").append(totalVehicles).append(" Vehicles including ").append(vehicles.stream().filter(v -> v instanceof Car).count()).append(" Cars and ").append(vehicles.stream().filter(v -> v instanceof Motorbike).count()).append(" Motorbikes having a total price of ").append(totalPrice).append(" TL");

        return sb.toString();
    }
}
