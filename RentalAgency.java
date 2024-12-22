import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        fleet = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void processRental(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.setAvailability(false);
            RentalTransaction transaction = new RentalTransaction(customer, vehicle, days);
            transactions.add(transaction);
            customer.addRentalHistory(vehicle);
            System.out.println("Rental processed: " + transaction);
        } else {
            System.out.println("Vehicle not available for rental.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailability(true);
        System.out.println("Vehicle returned: " + vehicle.getModel());
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailableForRental()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }
}
