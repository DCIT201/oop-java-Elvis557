public interface Rentable {
    void rent(Customer customer, int days);

    void returnVehicle();
}

@Override
public void rent(Customer customer, int days) {
    if (!isAvailable()) {
        throw new IllegalStateException("Vehicle is not available for rental");
    }
    setAvailable(false);
    System.out.println("Vehicle rented to " + customer.getName() + " for " + days + " days.");
}

@Override
public void returnVehicle() {
    setAvailable(true);
    System.out.println("Vehicle returned.");
}
