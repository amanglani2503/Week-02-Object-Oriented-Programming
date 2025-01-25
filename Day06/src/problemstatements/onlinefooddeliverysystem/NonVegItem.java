package problemstatements.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable{
    private static double discountOnNonVegFood = 2.5;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

//    @Override
//    public void getItemDetails() {
//        super.getItemDetails();
//    }

    @Override
    public double calculateTotalPrice() {
        return getQuantity() * getPrice();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() - (calculateTotalPrice() * discountOnNonVegFood) / 100;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount percentage is " + discountOnNonVegFood + "%");
        System.out.println("Discount amount : " + ((calculateTotalPrice() * discountOnNonVegFood) / 100));
        System.out.println("Discounted bill is : " + applyDiscount());
    }
}
