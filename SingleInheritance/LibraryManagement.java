package SingleInheritance;

// Superclass Book
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // Call Book's displayInfo()
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main Class
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object (Book + Author info)
        Author author = new Author("Java Programming", 2021, "John Doe", "A software engineer with 10 years of experience.");

        // Display the book and author information
        author.displayInfo();
    }
}
