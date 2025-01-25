package problemstatements.ecommerceplatform;

// Clothing class extending Product
public class Clothing extends Product implements Taxable {
    private double discountRate;

    public Clothing(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;  // 12% tax for clothing
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate for Clothing: 12%");
        System.out.println("Tax Amount: $" + calculateTax());
    }
}