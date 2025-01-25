package problemstatements.vehicleRentalSystem;

// Subclass Truck
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;  // Rental cost = daily rate * days
    }

    @Override
    public double calculateInsurance() {
        return 0.10 * getRentalRate();  // 10% of rental rate for insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: $" + calculateInsurance());
    }
}