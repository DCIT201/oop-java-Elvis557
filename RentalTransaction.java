public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int days;

    public RentalTransaction(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
    }

    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(days);
    }

    @Override
    public String toString() {
        return "Customer: " + customer.getName() + ", Vehicle: " + vehicle.getModel() +
               ", Days: " + days + ", Total Cost: " + calculateTotalCost();
    }
}
