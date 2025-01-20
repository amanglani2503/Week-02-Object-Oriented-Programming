// Class to represent the Book
class Book {
    // Static variable shared across all books
    static String libraryName = "City Library";

    // Final variable for a unique identifier
    private final String isbn;

    // Instance variables
    private String title;
    private String author;

    // Constructor using 'this' to initialize instance variables
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
    }
}

// Main program class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Displaying the library name
        Book.displayLibraryName();

        // Creating book objects
        Book book1 = new Book("1984", "George Orwell", "ISBN001");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002");
		
		// displaying details
		book1.displayBookDetails();
		book2.displayBookDetails();
		
        // Checking instances using instanceof in the main method
        if (book1 instanceof Book) {
            System.out.println("\nbook1 is an instance of Book");
            
        } else {
            System.out.println("\nbook1 is not an instance of Book");
        }

        if (book2 instanceof Book) {
            System.out.println("\nbook2 is an instance of Book");
        } else {
            System.out.println("\nbook2 is not an instance of Book");
        }
    }
}
