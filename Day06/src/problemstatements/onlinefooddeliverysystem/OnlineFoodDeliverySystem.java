package problemstatements.onlinefooddeliverysystem;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // creating order object and processing veg order
        FoodItem vegOrder = new VegItem("Chhole Bhature", 60.00, 2);

        vegOrder.getItemDetails();
        System.out.println("Total Price before discount : $" + vegOrder.calculateTotalPrice());

        if(vegOrder instanceof Discountable){
            Discountable discountableVegOrder = (Discountable) vegOrder;
            discountableVegOrder.getDiscountDetails();
        }
        System.out.println();

        // processing Non-Veg Order
        FoodItem nonVegOrder = new NonVegItem("Chicken Biryani", 160.00, 3);
        System.out.println("Total Price before discount : $" + nonVegOrder.calculateTotalPrice());

        if(nonVegOrder instanceof Discountable){
            Discountable discountableNonVegOrder = (Discountable) nonVegOrder;
            discountableNonVegOrder.getDiscountDetails();
        }
        System.out.println();
    }
}
