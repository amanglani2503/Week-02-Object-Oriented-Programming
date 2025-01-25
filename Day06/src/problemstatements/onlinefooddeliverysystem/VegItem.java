package problemstatements.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable{
    private static double discountOnVegFood = 4;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getQuantity() * getPrice();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() - (calculateTotalPrice() * discountOnVegFood) / 100;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount percentage is " + discountOnVegFood + "%");
        System.out.println("Discount amount : " + ((calculateTotalPrice() * discountOnVegFood) / 100));
        System.out.println("Discounted bill is : " + applyDiscount());
    }
}
