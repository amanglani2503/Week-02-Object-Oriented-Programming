package HybridInheritance;

class Person {
    public String name;
    public int id;

    // Constructor initializing name and id fields
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method for displaying person's details
    public void displayDetails() {
        System.out.println("Person Details : ");
        System.out.println("    Name : " + this.name);
        System.out.println("    Id : " + this.id);
    }
}

// Defining Worker interface with a method for performing duties
interface Worker {
    abstract public void performDuties();
}

// Chef class extending Person and implementing Worker interface
class Chef extends Person implements Worker {

    // Constructor initializing name and id for Chef
    public Chef(String name, int id) {
        super(name, id);
    }

    // Overriding performDuties method to define specific duties for Chef
    @Override
    public void performDuties() {
        System.out.println("Duties of a chef are : ");
        System.out.println("    1. Create menu");
        System.out.println("    2. Cook Food");
    }
}

// Waiter class extending Person and implementing Worker interface
class Waiter extends Person implements Worker {

    // Constructor initializing name and id for Waiter
    public Waiter(String name, int id) {
        super(name, id);
    }

    // Overriding performDuties method to define specific duties for Waiter
    @Override
    public void performDuties() {
        System.out.println("Duties of a Worker are : ");
        System.out.println("    1. Serving Tables");
        System.out.println("    2. Taking Orders");
    }
}

// Main class where objects of Chef and Waiter are created and their methods are called
public class RestaurantManagementSystem {
    public static void main(String[] args) {

        // Creating a Chef object and displaying details and duties
        Chef chef = new Chef("Sanjeev Kapoor", 101);
        chef.displayDetails(); // Displaying details of Chef
        chef.performDuties();  // Performing duties of Chef

        // Creating a Waiter object and displaying details and duties
        Waiter waiter = new Waiter("Ankit", 201);
        waiter.displayDetails(); // Displaying details of Waiter
        waiter.performDuties();  // Performing duties of Waiter
    }
}
