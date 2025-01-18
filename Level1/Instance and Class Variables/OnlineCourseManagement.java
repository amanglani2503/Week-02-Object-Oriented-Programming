class Course {
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;
    private static String instituteName = "Tech Institute"; // Class variable

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 12, 300.0);
        Course c2 = new Course("Web Development", 10, 250.0);

        System.out.println("Course 1 Details:");
        c1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        c2.displayCourseDetails();

        System.out.println("\nUpdating Institute Name...");
        Course.updateInstituteName("Global Academy");

        System.out.println("\nUpdated Course Details:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
