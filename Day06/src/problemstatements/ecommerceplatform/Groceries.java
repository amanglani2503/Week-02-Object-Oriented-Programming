package problemstatements.ecommerceplatform;

// Groceries class extending Product
class Groceries extends Product implements Taxable {
    private double discountRate;

    public Groceries(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;  // 5% tax for groceries
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate for Groceries: 5%");
        System.out.println("Tax Amount: $" + calculateTax());
    }
}