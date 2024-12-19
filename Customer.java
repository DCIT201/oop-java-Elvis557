import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<String> rentalHistory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRentalHistory(String vehicleId) {
        rentalHistory.add(vehicleId);
    }

    public List<String> getRentalHistory() {
        return rentalHistory;
    }
}
