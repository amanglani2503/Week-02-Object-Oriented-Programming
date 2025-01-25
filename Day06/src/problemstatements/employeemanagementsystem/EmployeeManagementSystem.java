package problemstatements.employeemanagementsystem;

// Main class to test the implementation
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employee objects
        Employee fullTimeEmployee = new FullTimeEmployee(1, "John", 5000, 1000);
        Employee partTimeEmployee = new PartTimeEmployee(2, "Jane", 2000, 120, 15);

        // Displaying employee details and calculating salary
        fullTimeEmployee.displayDetails();
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println();

        partTimeEmployee.displayDetails();
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());
        System.out.println();

        // Using polymorphism with Employee reference
        Employee[] employees = {fullTimeEmployee, partTimeEmployee};
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println();
        }

        // Assigning and displaying department details
        Department hrDepartment = new HRDepartment();
        hrDepartment.assignDepartment("Human Resources");
        hrDepartment.getDepartmentDetails();
    }
}