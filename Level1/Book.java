import java.util.Scanner;

public class Book {
    String authorOfBook;
    String titleOfBook;
    double priceOfBook;

    // Constructor to initialize variables
    public Book(String author, String title, double price){
        this.authorOfBook = author;
        this.titleOfBook = title;
        this.priceOfBook = price;
    }

    // Method to display details of the books
    private void displayBookDetails(){
        System.out.println("Book Name : " + this.titleOfBook);
        System.out.println("Book Title : " + this.titleOfBook);
        System.out.println("Price : $" + this.priceOfBook);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking as Input Details of book
        System.out.print("Enter Title of the Book : ");
        String title = sc.nextLine();

        System.out.print("Enter Author Book : ");
        String author = sc.nextLine();

        System.out.print("Enter Price of Book : ");
        double price = sc.nextDouble();

        // Creating object and passing parameters
        Book book1 = new Book(author, title, price);
        book1.displayBookDetails();

        sc.close();
    }
}
