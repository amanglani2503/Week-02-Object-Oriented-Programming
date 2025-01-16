import java.util.Scanner;

public class EmployeeDetails {

        String EmployeeId;
        String EmployeeName;
        int EmployeeSalary;

        public EmployeeDetails(String employeeId, String employeeName, int employeeSalary) {
            EmployeeId = employeeId;
            EmployeeName = employeeName;
            EmployeeSalary = employeeSalary;
        }

        public void displayDetails(){
            System.out.println("Employee Id : " + this.EmployeeId + "\nEmployee Name : " + this.EmployeeName + "\nEmployee Salary : " + this.EmployeeSalary);
        }


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // Taking as input Employee Data
            System.out.print("Enter Employee Id : ");
            String EmployeeId = sc.nextLine();

            System.out.print("Enter Employee Name : ");
            String EmployeeName = sc.nextLine();

            System.out.print("Enter Employee Salary : ");
            int EmployeeSalary = sc.nextInt();

            EmployeeDetails Employee1 = new EmployeeDetails(EmployeeId, EmployeeName, EmployeeSalary);

            Employee1.displayDetails();

            sc.close();
        }
}