import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        // Using parameterized constructor
        System.out.println("\nEnter book details:");
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Book userBook = new Book(title, author, price);
        System.out.println("\nBook Details:");
        userBook.displayDetails();
    
		sc.close();
	}
}
