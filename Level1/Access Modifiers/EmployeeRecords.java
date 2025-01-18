class Employee {
    public int employeeID; // Public: accessible anywhere
    protected String department; // Protected: accessible within the package and subclasses
    private double salary; // Private: accessible only within this class

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }
}

// Subclass to demonstrate access to public and protected members
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "HR", 50000.0);
        Manager mgr = new Manager(102, "IT", 70000.0);

        System.out.println("Employee Salary: $" + emp.getSalary());
        emp.setSalary(55000.0);
        System.out.println("Updated Salary: $" + emp.getSalary());

        System.out.println("\nManager Details:");
        mgr.displayManagerDetails();
    }
}
