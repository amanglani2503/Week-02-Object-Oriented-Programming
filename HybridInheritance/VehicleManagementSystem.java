package HybridInheritance;

// Superclass Vehicle
class Vehicle {
    protected String model;
    protected int maxSpeed;

    // Constructor to initialize model and maxSpeed
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Model: " + this.model);
        System.out.println("Max Speed: " + this.maxSpeed + " km/h");
    }
}

// Interface Refuelable defining refuel() method
interface Refuelable {
    void refuel();
}

// Subclass ElectricVehicle extends Vehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    // Constructor to initialize ElectricVehicle properties
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle...");
    }

    // Overriding displayDetails method to include batteryCapacity
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + this.batteryCapacity + " kWh");
    }
}

// Subclass PetrolVehicle extends Vehicle implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankCapacity; // in liters

    // Constructor to initialize PetrolVehicle properties
    public PetrolVehicle(String model, int maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implementing refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    // Overriding displayDetails method to include fuelTankCapacity
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Tank Capacity: " + this.fuelTankCapacity + " liters");
    }
}

// Main class to run the Vehicle Management System
public class VehicleManagementSystem {
    public static void main(String[] args) {

        // Creating an ElectricVehicle object
        ElectricVehicle electricVehiclev = new ElectricVehicle("Tesla Model 3", 250, 75);
        electricVehiclev.displayDetails(); // Displaying details of Electric Vehicle
        electricVehiclev.charge();         // Charging the Electric Vehicle

        // Creating a PetrolVehicle object
        PetrolVehicle petrolVehicle = new PetrolVehicle("Toyota Corolla", 180, 50);
        petrolVehicle.displayDetails(); // Displaying details of Petrol Vehicle
        petrolVehicle.refuel();         // Refueling the Petrol Vehicle
    }
}
