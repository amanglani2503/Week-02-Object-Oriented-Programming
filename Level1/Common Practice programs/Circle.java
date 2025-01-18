import java.util.Scanner;

class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calling parameterized constructor with default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display radius and area
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayDetails();

        // Using parameterized constructor
        System.out.print("\nEnter radius for the circle: ");
        double userRadius = sc.nextDouble();
        Circle userCircle = new Circle(userRadius);

        System.out.println("\nUser-defined Circle:");
        userCircle.displayDetails();
    }
}
