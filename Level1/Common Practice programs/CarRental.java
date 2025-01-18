import java.util.Scanner;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
        this.costPerDay = 50.0; // Default cost per day
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: $" + costPerDay);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using the default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental Details:");
        defaultRental.displayDetails();

        // Using the parameterized constructor
        System.out.println("\nEnter rental details:");
        System.out.print("Customer Name: ");
        String customerName = sc.nextLine();
        System.out.print("Car Model: ");
        String carModel = sc.nextLine();
        System.out.print("Rental Days: ");
        int rentalDays = sc.nextInt();
        System.out.print("Cost per Day: ");
        double costPerDay = sc.nextDouble();

        CarRental customRental = new CarRental(customerName, carModel, rentalDays, costPerDay);
        System.out.println("\nCustom Rental Details:");
        customRental.displayDetails();
    }
}
