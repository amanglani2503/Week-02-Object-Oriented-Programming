// Class to represent the Student
class Student {
    // Static variable shared across all students
    static String universityName = "XYZ University";
    private static int totalStudents = 0;

    // Final variable for a unique identifier
    private final String rollNumber;

    // Instance variables
    private String name;
    private String grade;

    // Constructor using 'this' to initialize instance variables
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment total students
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Grade: " + this.grade);
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + newGrade);
    }
}


public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Display the university name
        System.out.println("University Name: " + Student.universityName);

        // Creating student objects
        Student student1 = new Student("Alice Johnson", "R001", "A");
        Student student2 = new Student("Bob Smith", "R002", "B");

        // Display total students enrolled
        Student.displayTotalStudents();

        // Checking instances using instanceof in the main method
        if (student1 instanceof Student) {
            System.out.println("\nstudent1 is an instance of Student");
            student1.displayStudentDetails();
            student1.updateGrade("A+");
        } else {
            System.out.println("\nstudent1 is not an instance of Student.");
        }

        if (student2 instanceof Student) {
            System.out.println("\nstudent2 is an instance of Student.");
            student2.displayStudentDetails();
            student2.updateGrade("B+");
        } else {
            System.out.println("nstudent2 is not an instance of Student.");
        }
    }
}
