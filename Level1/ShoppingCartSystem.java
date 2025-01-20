// Class to represent the Product
class Product {
    // Static variable shared across all products
    static double discount = 10.0; // 10% discount by default

    // Final variable for a unique identifier
    private final String productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize instance variables
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Details:");
        System.out.println("Name: " + this.productName);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Discount: " + discount + "%");
    }

    // Method to calculate total price after applying discount
    public double calculateTotalPrice() {
        return this.price * this.quantity * (1 - discount / 100);
    }
}


public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 50000, 2, "P001");
        Product product2 = new Product("Smartphone", 15000, 3, "P002");

        // Checking instances using instanceof in the main method
        if (product1 instanceof Product) {
            System.out.println("\nproduct1 is an instance of Product");
            product1.displayProductDetails();
            System.out.println("Total price for product1: " + product1.calculateTotalPrice());
        } else {
            System.out.println("\nproduct1 is not an instance of Product");
        }

        if (product2 instanceof Product) {
            System.out.println("\nproduct2 is an instance of Product");
            product2.displayProductDetails();
            System.out.println("Total price for product2: " + product2.calculateTotalPrice());
        } else {
            System.out.println("\nproduct2 is not an instance of Product");
		}
		
        // Updating discount using static method
        Product.updateDiscount(15.0); // 15% discount

        // Display updated discount
        System.out.println("\nAfter updating the discount:");
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
