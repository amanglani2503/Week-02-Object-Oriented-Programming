package problemstatements.ridehailingapplication;

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return "Car is at location A.";
    }

    @Override
    public void updateLocation() {
        System.out.println("Car location updated to location B.");
    }
}