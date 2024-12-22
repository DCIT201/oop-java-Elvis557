import static jdk.jfr.FlightRecorder.isAvailable;

public class Truck extends Vehicle {
    private double maxLoadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double maxLoadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public double getMaxLoadCapacity() { return maxLoadCapacity; }
    public void setMaxLoadCapacity(double capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive.");
        this.maxLoadCapacity = capacity;
    }

    @Override
    public double calculateRentalcost(int days) {
        return 0;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate() * 1.2; // Higher cost multiplier for trucks
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}