class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a person using the parameterized constructor
        Person person1 = new Person("Alice", 25);
        System.out.println("Original Person:");
        person1.displayDetails();

        // Creating a person using the copy constructor
        Person person2 = new Person(person1);
        System.out.println("\nCloned Person:");
        person2.displayDetails();
    }
}
