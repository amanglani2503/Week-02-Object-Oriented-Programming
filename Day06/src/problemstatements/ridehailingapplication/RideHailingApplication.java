package problemstatements.ridehailingapplication;

public class RideHailingApplication {
    public static void main(String[] args) {
        // Polymorphism to handle different vehicle types
        Vehicle car = new Car("CAR123", "Alice", 15.0);
        Vehicle bike = new Bike("BIKE456", "Bob", 8.0);
        Vehicle auto = new Auto("AUTO789", "Charlie", 10.0);

        // Display details and calculate fares dynamically
        System.out.println("Car Details:");
        System.out.println(car.getVehicleDetails());
        System.out.println("Fare for 10 km: " + car.calculateFare(10));
        System.out.println();

        System.out.println("Bike Details:");
        System.out.println(bike.getVehicleDetails());
        System.out.println("Fare for 10 km: " + bike.calculateFare(10));
        System.out.println();

        System.out.println("Auto Details:");
        System.out.println(auto.getVehicleDetails());
        System.out.println("Fare for 10 km: " + auto.calculateFare(10));
        System.out.println();

        // GPS functionality demonstration
        GPS carGPS = (GPS) car;
        System.out.println(carGPS.getCurrentLocation());
        carGPS.updateLocation();

        GPS bikeGPS = (GPS) bike;
        System.out.println(bikeGPS.getCurrentLocation());
        bikeGPS.updateLocation();

        GPS autoGPS = (GPS) auto;
        System.out.println(autoGPS.getCurrentLocation());
        autoGPS.updateLocation();
    }
}
