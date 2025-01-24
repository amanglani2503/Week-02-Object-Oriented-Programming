package MultilevelInheritance;

// Superclass MultilevelInheritance.Course
class Course {
    protected String courseName;
    protected int duration;  // Duration in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("MultilevelInheritance.Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass MultilevelInheritance.OnlineCourse (extends MultilevelInheritance.Course)
class OnlineCourse extends Course {
    private String platform;  // Platform hosting the course (e.g., Udemy, Coursera)
    private boolean isRecorded;  // Whether the course is recorded for later viewing

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // Calling the superclass displayInfo() method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass MultilevelInheritance.PaidOnlineCourse (extends MultilevelInheritance.OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    private double fee;  // MultilevelInheritance.Course fee
    private double discount;  // Discount on the course fee

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the superclass displayInfo() method
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Fee: $" + (fee - (fee * discount / 100)));
    }
}

// Main Class
public class EducationalCourseSystem {
    public static void main(String[] args) {
        // Create a MultilevelInheritance.PaidOnlineCourse object (inherits from MultilevelInheritance.OnlineCourse and MultilevelInheritance.Course)
        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Programming",
                30,
                "Udemy",
                true,
                199.99,
                20
        );

        // Display the course information
        course.displayInfo();
    }
}
