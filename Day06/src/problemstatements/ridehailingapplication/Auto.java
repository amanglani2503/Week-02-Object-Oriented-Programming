package problemstatements.ridehailingapplication;

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return "Auto is at location P.";
    }

    @Override
    public void updateLocation() {
        System.out.println("Auto location updated to location Q.");
    }
}