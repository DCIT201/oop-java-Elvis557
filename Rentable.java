public interface Rentable {
    <Customer> void rent(Customer customer, int days);
    void returnVehicle();
}
