class Book {
    public String ISBN;     // Public: accessible anywhere
    protected String title; // Protected: accessible within the package and subclasses
    private String author;  // Private: accessible only within this class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Methods to access and modify the author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass to demonstrate protected and public access
class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("123-456-789", "Java Programming", "John Doe");
        EBook eBook = new EBook("987-654-321", "Advanced Java", "Jane Smith");

        System.out.println("Book Author: " + book.getAuthor());
        book.setAuthor("Alice Johnson");
        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println("\nEBook Details:");
        eBook.displayEBookDetails();
    }
}
