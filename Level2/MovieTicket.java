import java.util.Scanner;

class MovieTicket {

    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the attributes of the Ticket
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for booking details
        System.out.print("Enter the movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter the seat number: ");
        String seatNumber = sc.nextLine();

        System.out.print("Enter the ticket price: ");
        double price = sc.nextDouble();

        // Creating a MovieTicket object and booking a ticket
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.bookTicket(movieName, seatNumber, price);

        // Displaying ticket details
        System.out.println("\nTicket Details:");
        ticket.displayDetails();

        sc.close();
    }
}
