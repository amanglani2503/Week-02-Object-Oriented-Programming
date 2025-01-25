package problemstatements.ecommerceplatform;

// Main class to test the implementation
public class ECommerceSystem {
    public static void main(String[] args) {
        // Creating product objects
        Product laptop = new Electronics(1, "Laptop", 1000, 0.10);
        Product tshirt = new Clothing(2, "T-Shirt", 50, 0.15);
        Product apple = new Groceries(3, "Apple", 2, 0.05);

        // Creating a list of products
        Product[] products = {laptop, tshirt, apple};

        // Displaying details and calculating final price for each product
        for (Product product : products) {
            System.out.println("Product: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Discount: $" + product.calculateDiscount());
            product.getTaxDetails();  // Display tax details
            System.out.println("Final Price: $" + product.calculateFinalPrice());
            System.out.println();
        }
    }
}