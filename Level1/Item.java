import java.util.Scanner;

class Item {
    // Attributes
    private int itemCode;
    private String itemName;
    private double itemPrice;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + itemPrice);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return itemPrice * quantity;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Item Code: ");
        int itemCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        // Createing Item object
        Item item = new Item(itemCode, itemName, price);

        // Displaying the item details
        item.displayDetails();

        // Method to Calculate and display the total cost for a given quantity
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Total Cost for " + quantity + " items: $" + item.calculateTotalCost(quantity));

        sc.close();
    }
}
