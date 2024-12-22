import static jdk.jfr.FlightRecorder.isAvailable;

public class Car extends Vehicle{
    private boolean hasGPS;

    public Car(String vehicleID, String modelID, double baseRentalRate, boolean hasGPS){
        super(vehicleID, modelID, baseRentalRate);
        this.hasGPS = hasGPS;
    }
    public boolean hasGPS(){
        return hasGPS;
    }

    public void setGPS(boolean hasGPS ){
        this.hasGPS = hasGPS;
    }

    @Override
    public double calculateRentalcost(int days) {
        return 0;
    }

    @Override
    public double calculateRentalCost(int days){
        double cost = days * getBaseRentalRate();
        return hasGPS? cost + 50: cost;

    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

}
