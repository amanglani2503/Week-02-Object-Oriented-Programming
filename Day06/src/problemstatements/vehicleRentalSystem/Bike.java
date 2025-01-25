package problemstatements.vehicleRentalSystem;

// Subclass Bike
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;  // Rental cost = daily rate * days
    }

    @Override
    public double calculateInsurance() {
        return 0.02 * getRentalRate();  // 2% of rental rate for insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: $" + calculateInsurance());
    }
}