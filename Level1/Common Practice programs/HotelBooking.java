import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayDetails() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights : " + nights);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using the default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayDetails();

        // Using the parameterized constructor
        System.out.println("\nEnter booking details:");
        System.out.print("Guest Name : ");
        String guestName = sc.nextLine();
        System.out.print("Room Type : ");
        String roomType = sc.nextLine();
        System.out.print("Number of Nights : ");
        int nights = sc.nextInt();

        HotelBooking customBooking = new HotelBooking(guestName, roomType, nights);
        System.out.println("\nCustom Booking:");
        customBooking.displayDetails();

        // Using the copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("\nCopied Booking:");
        copiedBooking.displayDetails();
    }
}
