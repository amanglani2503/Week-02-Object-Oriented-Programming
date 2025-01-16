import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize items
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add an item to the cart
    static CartItem[] addItem(CartItem[] cart, String itemName, double price, int quantity, int index) {
        if (index < cart.length) {
            cart[index] = new CartItem(itemName, price, quantity);
        } else {
            System.out.println("Cart is full, cannot add more items.");
        }
        return cart;
    }

    // Method to remove an item from the cart by its name
    static int removeItem(CartItem[] cart, String itemName, int index) {
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (cart[i].itemName.equals(itemName)) {
                found = true;
                for (int j = i; j < index - 1; j++) {
                    cart[j] = cart[j + 1]; // Shift items to remove the item
                }
                cart[index - 1] = null; // Nullify the last item
                index--; // Decrement the index after removal
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in the cart.");
        }
        return index;
    }

    // Method to calculate the total cost of the cart
    static double totalCost(CartItem[] cart, int index) {
        double total = 0;
        for (int i = 0; i < index; i++) {
            if (cart[i] != null) { // Check if the cart item is not null
                total += cart[i].price * cart[i].quantity;
            }
        }
        return total;
    }

    // Method to display the items in the cart
    static void displayCart(CartItem[] cart, int index) {
        System.out.println("Cart Contents:");
        if (index == 0) {
            System.out.println("Your cart is empty.");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.println(cart[i].itemName + " - " + cart[i].quantity + " pcs, Price per Piece: $" + cart[i].price);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem[] cart = new CartItem[5];
        int index = 0;

        while (true) {
            // Display menu for user choice
            System.out.println("\nChoose an option:");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. View total cost");
            System.out.println("4. Display cart");
            System.out.println("5. Exit");

            System.out.print("\nEnter Your Choice : ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    // Adding item to the cart
                    System.out.print("Enter item name : ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter item price : ");
                    double price = sc.nextDouble();
                    System.out.print("Enter item quantity : ");
                    int quantity = sc.nextInt();
                    sc.nextLine(); // Consume the newline

                    cart = addItem(cart, itemName, price, quantity, index);
                    index++; // Increment index after adding an item
                    break;

                case 2:
                    // Removing item from the cart
                    System.out.print("Enter item name to remove : ");
                    String itemToRemove = sc.nextLine();
                    index = removeItem(cart, itemToRemove, index); // Update index after removal
                    break;

                case 3:
                    // Displaying total cost
                    System.out.println("Total Cost : $" + totalCost(cart, index));
                    break;

                case 4:
                    // Displaying the cart
                    displayCart(cart, index);
                    break;

                case 5:
                    // Exiting the program
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
