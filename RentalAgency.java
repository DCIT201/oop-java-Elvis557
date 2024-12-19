import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void processRental(Customer customer, String vehicleId, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailable()) {
                vehicle.rent(customer, days);
                System.out.println("Rental processed: " + new RentalTransaction(customer, vehicle, days));
                return;
            }
        }
        System.out.println("Vehicle not available.");
    }

    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && !vehicle.isAvailable()) {
                vehicle.returnVehicle();
                System.out.println("Vehicle returned: " + vehicleId);
                return;
            }
        }
        System.out.println("Vehicle not found or already available.");
    }
}
