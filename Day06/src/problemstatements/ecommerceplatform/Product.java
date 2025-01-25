package problemstatements.ecommerceplatform;

// Abstract class Product
abstract class Product implements Taxable {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    // Method to calculate final price (price + tax - discount)
    public double calculateFinalPrice() {
        double tax = calculateTax();
        double discount = calculateDiscount();
        return price + tax - discount;
    }

    // Abstract method to be implemented by the Taxable interface
    public abstract double calculateTax();

}