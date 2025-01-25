package problemstatements.vehicleRentalSystem;

// Main class to test the implementation
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle car = new Car("A1234", 50, "INS12345");
        Vehicle bike = new Bike("B5678", 20, "INS67890");
        Vehicle truck = new Truck("C91011", 100, "INS11223");

        // Creating a list of vehicles
        Vehicle[] vehicles = {car, bike, truck};

        // Iterating through the list to calculate rental and insurance costs
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Rate: $" + vehicle.getRentalRate());

            // Polymorphism: Dynamic method dispatch for rental cost calculation
            int rentalDays = 5; // Example: Renting for 5 days
            System.out.println("Rental Cost for " + rentalDays + " days: $" + vehicle.calculateRentalCost(rentalDays));

            // Polymorphism: Dynamic method dispatch for insurance details
            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                insurableVehicle.getInsuranceDetails();
            }
        }
    }
}