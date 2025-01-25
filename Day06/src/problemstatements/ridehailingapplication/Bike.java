package problemstatements.ridehailingapplication;

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return "Bike is at location X.";
    }

    @Override
    public void updateLocation() {
        System.out.println("Bike location updated to location Y.");
    }
}