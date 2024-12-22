import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a rental agency
        RentalAgency rentalAgency = new RentalAgency();

        // Add vehicles to the fleet
        Car car1 = new Car("C001", "Toyota Corolla", 50.0, true);
        Motorcycle motorcycle1 = new Motorcycle("M001", "Yamaha R15", 30.0, true);
        Truck truck1 = new Truck("T001", "Ford F-150", 100.0, 5000);

        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(motorcycle1);
        rentalAgency.addVehicle(truck1);

        // Create customers
        Customer customer1 = new Customer("CU001", "John Doe");
        Customer customer2 = new Customer("CU002", "Jane Smith");

        // Display available vehicles
        System.out.println("Available vehicles for rental:");
        List<Vehicle> availableVehicles = rentalAgency.getAvailableVehicles();
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle);
        }

        System.out.println("\nProcessing rentals...");

        // Process rental transactions
        rentalAgency.processRental(customer1, car1, 5); // John rents a car for 5 days
        rentalAgency.processRental(customer2, truck1, 3); // Jane rents a truck for 3 days

        // Display available vehicles after rentals
        System.out.println("\nAvailable vehicles after rentals:");
        availableVehicles = rentalAgency.getAvailableVehicles();
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle);
        }

        // Returning a vehicle
        System.out.println("\nReturning vehicles...");
        rentalAgency.returnVehicle(car1); // John returns the car
        rentalAgency.returnVehicle(truck1); // Jane returns the truck

        // Display available vehicles after returns
        System.out.println("\nAvailable vehicles after returns:");
        availableVehicles = rentalAgency.getAvailableVehicles();
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle);
        }
    }
}
