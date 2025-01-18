import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : $" + price);
        System.out.println("Availability : " + (isAvailable ? "Available" : "Not Available"));
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have successfully borrowed the book : " + title);
            isAvailable = false;
        } else {
            System.out.println("Sorry, the book is currently not available");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a sample book
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99, true);
        book.displayDetails();

        // Borrow the book
        System.out.println("\nDo you want to borrow the book? (yes/no) : ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            book.borrowBook();
        }

        // Display book details again
        System.out.println("\nUpdated Book Details : ");
        book.displayDetails();
    }
}
