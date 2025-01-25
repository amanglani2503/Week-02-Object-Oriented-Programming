package problemstatements.ecommerceplatform;

class Electronics extends Product implements Taxable {
    private double discountRate;

    public Electronics(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;  // 18% tax for electronics
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate for Electronics: 18%");
        System.out.println("Tax Amount: $" + calculateTax());
    }
}