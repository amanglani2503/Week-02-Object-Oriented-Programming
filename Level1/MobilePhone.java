import java.util.Scanner;

class MobilePhone {

    private String brand;
    private String model;
    private double price;

    // Constructor - initializes attributes of an object
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for the first phone
        System.out.println("Enter details for Phone 1:");
        System.out.print("Enter Brand: ");
        String brand1 = sc.nextLine();

        System.out.print("Enter Model: ");
        String model1 = sc.nextLine();

        System.out.print("Enter Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        // Taking input from the user for the second phone
        System.out.println("\nEnter details for Phone 2:");
        System.out.print("Enter Brand: ");
        String brand2 = sc.nextLine();

        System.out.print("Enter Model: ");
        String model2 = sc.nextLine();

        System.out.print("Enter Price: ");
        double price2 = sc.nextDouble();

        // Creating MobilePhone objects
        MobilePhone phone1 = new MobilePhone(brand1, model1, price1);
        MobilePhone phone2 = new MobilePhone(brand2, model2, price2);

        // Displaying phone details
        System.out.println("\nPhone 1 Details:");
        phone1.displayDetails();

        System.out.println("\nPhone 2 Details:");
        phone2.displayDetails();

        sc.close();
    }
}
