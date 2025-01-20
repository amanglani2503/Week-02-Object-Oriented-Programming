// Class to represent the Employee
class Employee {
    // Static variable shared across all employees
    static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0;

    // Final variable for a unique identifier
    private final int id;

    // Instance variables
    private String name;
    private String designation;

    // Constructor using 'this' to initialize instance variables
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Incrementing total employees
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Designation: " + this.designation);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Displaying the company name
        System.out.println("Company Name: " + Employee.companyName);

        // Creating employee objects
        Employee emp1 = new Employee("Alice Johnson", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob Smith", 102, "Project Manager");
		
		// displaying total number of employees
		Employee.displayTotalEmployees();
	
        // Checking instances using instanceof in the main method
        if (emp1 instanceof Employee) {
            System.out.println("\nemp1 is an instance of Employee");
			emp1.displayEmployeeDetails();
            
        } else {
            System.out.println("\nemp1 is not an instance of Employee");
        }

        if (emp2 instanceof Employee) {
            System.out.println("\nemp2 is an instance of Employee");
			emp2.displayEmployeeDetails();            
        } else {
            System.out.println("\nemp2 is not an instance of Employee");
        }
    }
}
