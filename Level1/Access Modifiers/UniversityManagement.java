class Student {
    public int rollNumber; // Public: accessible anywhere
    protected String name; // Protected: accessible within the package and subclasses
    private double CGPA;   // Private: accessible only within this class

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass to demonstrate protected access
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student student = new Student(101, "Alice", 9.2);
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 8.8);

        System.out.println("Student Details:");
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("CGPA: " + student.getCGPA());

        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayDetails();
    }
}
