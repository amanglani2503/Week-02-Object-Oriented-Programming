import java.util.Scanner;

public class Circle {
    double radiusOfCircle;
    double areaOfCircle;
    double circumferenceOfCircle;

    public Circle(double radius){
        this.radiusOfCircle = radius;
    }

    private void calculateArea(){
        this.areaOfCircle =  Math.PI * this.radiusOfCircle * this.radiusOfCircle;
    }

    private void displayArea(){
        System.out.println("Area of Circle : " + this.areaOfCircle);
    }

    private void calculateCircumference(){
        this.circumferenceOfCircle = 2 * Math.PI * this.radiusOfCircle;
    }

    private void displayCircumference(){
        System.out.println("Circumferece of Circle : " + this.circumferenceOfCircle);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Radius as input
        System.out.print("Enter radius of Circle : ");
        double radius = sc.nextDouble();

        // creating object
        Circle circle1 = new Circle(radius);

        // Calling the method to calculate area of circle
        circle1.calculateArea();
        circle1.calculateCircumference();
        circle1.displayArea();
        circle1.displayCircumference();

        sc.close();
    }
}
