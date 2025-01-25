package problemstatements.hospitalpatientmanagement;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        //  handling different patient types
        InPatient inPatient = new InPatient(101, "Alice", 30, 5, 2000);
        OutPatient outPatient = new OutPatient(102, "Bob", 40, 500);

        // Displaingy InPatient details and bill
        System.out.println("InPatient Details:");
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Total Bill: " + inPatient.calculateBill());
        inPatient.setDiagnosis("Fever");
        inPatient.addRecord("Admitted for 5 days");
        System.out.println("InPatient Medical Records:");
        inPatient.viewRecords();
        System.out.println();

        // Displaying OutPatient details and bill
        System.out.println("OutPatient Details:");
        System.out.println(outPatient.getPatientDetails());
        System.out.println("Total Bill: " + outPatient.calculateBill());
        outPatient.setDiagnosis("Flu");
        outPatient.addRecord("Consulted Dr. John");
        System.out.println("OutPatient Medical Records:");
        outPatient.viewRecords();
    }
}
