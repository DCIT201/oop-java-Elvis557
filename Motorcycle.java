import static jdk.jfr.FlightRecorder.isAvailable;

public class Motorcycle extends Vehicle {
    private boolean requiresHelmet;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean requiresHelmet) {
        super(vehicleId, model, baseRentalRate);
        this.requiresHelmet = requiresHelmet;
    }

    @Override
    public double calculateRentalcost(int days) {
        return 0;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate();
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}