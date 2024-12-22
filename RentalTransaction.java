public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;
    private double totalCost;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.totalCost = vehicle.calculateRentalCost(rentalDays);
    }

    @Override
    public String toString() {
        return "RentalTransaction [Customer=" + customer.getName() + ", Vehicle=" + vehicle.getModel() +
                ", Days=" + rentalDays + ", Cost=" + totalCost + "]";
    }
}
