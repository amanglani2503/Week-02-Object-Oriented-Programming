package HierarchicalInheritance;

// Base class Person
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden in subclasses
    public void displayRole() {
        System.out.println("Person");
    }
}

// Subclass Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Teacher");
        System.out.println("Subject: " + this.subject);
    }
}

// Subclass Student
class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Student");
        System.out.println("Grade: " + this.grade);
    }
}

// Subclass Staff
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Staff");
        System.out.println("Department: " + this.department);
    }
}

public class SchoolSystemRoles {
    public static void main(String[] args) {
        Person teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Person student = new Student("Alice", 15, "10th Grade");
        Person staff = new Staff("John", 50, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
