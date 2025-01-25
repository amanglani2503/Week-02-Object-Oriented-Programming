package problemstatements.onlinefooddeliverysystem;

// Parent Food Class
abstract public class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // method to display item details
    public void getItemDetails(){
        System.out.println("Order Details :");
        System.out.println("    Item Name : " + this.itemName);
        System.out.println("    Price : " + this.price);
        System.out.println("    Quantity : " + this.quantity);
        System.out.println();   // for leaving a blank linking
    }

    // abstract method to calculate total price
    abstract double calculateTotalPrice();
}
