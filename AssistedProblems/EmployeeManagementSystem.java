package AssistedProblems;

class Employee{
    public String name;
    protected int id;
    protected double salary;

    protected void displayDetails(){
        System.out.println("Displaying Employee Details - ");
    }
}

class Manager extends Employee{
    public int teamSize;

    public void setter(String name, int id, double salary, int teamSize){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.teamSize = teamSize;
    }

    @Override
    protected void displayDetails(){
        System.out.println("    Name : " + this.name);
        System.out.println("    Id : " + this.id);
        System.out.println("    Salary : " + this.salary);
        System.out.println("    TeamSize : " + this.teamSize + "\n");
    }
}

class Developer extends Employee{
    public String programmingLanguage;

    public void setter(String name, int id, double salary, String programmingLanguage){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    protected void displayDetails(){
        System.out.println("    Name : " + this.name);
        System.out.println("    Id : " + this.id);
        System.out.println("    Salary : " + this.salary);
        System.out.println("    Programming Language : " + this.programmingLanguage + "\n");
    }
}

class Intern extends Employee{
    public String certificationName;

    public void setter(String name, int id, double salary, String certificationName){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.certificationName = certificationName;
    }

    @Override
    protected void displayDetails(){
        System.out.println("    Name : " + this.name);
        System.out.println("    Id : " + this.id);
        System.out.println("    Salary : " + this.salary);
        System.out.println("    Certification Done : " + this.certificationName + "\n");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating manager object
        Manager manager  = new Manager();
        manager.setter("Amit", 101, 100000.00, 15);

        // Creating Developer object
        Developer developer = new Developer();
        developer.setter("Atharva", 102, 60000.00, "Java");

        // Creating Intern object
        Intern intern =  new Intern();
        intern.setter("Ashish", 103, 20000.00, "Azure Fundamentals");

        // displaying details of employees
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
