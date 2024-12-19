public class Truck extends Vehicle {
    private double maxLoadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double maxLoadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public double getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (maxLoadCapacity * 0.1); // Additional cost based on load
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
