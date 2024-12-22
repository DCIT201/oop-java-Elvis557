abstract class Vehicle {
    //private encapsulated fields
    private String vehicleID;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    //constructor
    public Vehicle(String vehicleID, String model, double baseRentalRate){
        this.vehicleID = vehicleID;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable; // default availability

    }

    public String getVehicleID(){
        return vehicleID;
    }
    public String getModel(){
        return  model;
    }
    public double getBaseRentalRate(){
        return baseRentalRate;
    }

    public void setBaseRentalRate(double rate){
        if(rate < 0) throw new IllegalArgumentException("Rate cannot be negative");
        this.baseRentalRate = rate;
    }

    public void setAvailability(boolean available){
        this.isAvailable = available;
    }

    //abstract methods
    public abstract double calculateRentalcost(int days);

    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();

    @Override
    public String toString(){
        return "Vehicle [ID=" + vehicleID + ", Model=" + model + ", Rate=" + baseRentalRate + "]";
    }
}
