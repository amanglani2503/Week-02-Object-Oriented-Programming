package problemstatements.vehicleRentalSystem;

// Subclass Car
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;  // Rental cost = daily rate * days
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate();  // 5% of rental rate for insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: $" + calculateInsurance());
    }
}