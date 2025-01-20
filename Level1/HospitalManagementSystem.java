// Class to represent the Patient
class Patient {
    // Static variable shared across all patients
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    // Final variable for a unique patient ID
    private final String patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to initialize instance variables
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increment total patients
    }

    // Static method to display total patients admitted
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("\n\nPatient Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Ailment: " + this.ailment);
        System.out.println("Patient ID: " + this.patientID);
    }
}

// Main program class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Display the hospital name
        System.out.println("Hospital Name: " + Patient.hospitalName);

        // Creating patient objects
        Patient patient1 = new Patient("Alice Johnson", 30, "Fever", "P001");
        Patient patient2 = new Patient("Bob Smith", 45, "Cold", "P002");

        // Display total patients admitted
        Patient.getTotalPatients();

        // Checking instances using instanceof and then displaying details
        if (patient1 instanceof Patient) {
            System.out.println("patient1 is an instance of Patient.");
            patient1.displayPatientDetails();
        } else {
            System.out.println("patient1 is not an instance of Patient.");
        }

        if (patient2 instanceof Patient) {
            System.out.println("patient2 is an instance of Patient.");
            patient2.displayPatientDetails();
        } else {
            System.out.println("patient2 is not an instance of Patient.");
        }
    }
}
