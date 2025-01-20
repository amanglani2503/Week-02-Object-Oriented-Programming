class BankAccount {
    // Static variable shared across all accounts
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    // Final variable for a unique account number
    private final String accountNumber;

    // Instance variables
    private String accountHolderName;
    private double balance;

	// Constructor to initialize object
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; // Increment total accounts
    }

    // Static method to display total accounts
    public static void getTotalAccounts() {
        System.out.println("\nTotal Accounts: " + totalAccounts);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance + "\n");
    }
}


public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating bank account objects
        BankAccount account1 = new BankAccount("John Doe", "A001", 5000.0);
        BankAccount account2 = new BankAccount("Jane Smith", "A002", 3000.0);

        // Checking instances using instanceof in the main method
        if (account1 instanceof BankAccount) {
            System.out.println("account1 is an instance of BankAccount.");
            account1.displayAccountDetails();
        } else {
            System.out.println("account1 is not an instance of BankAccount.");
        }

        if (account2 instanceof BankAccount) {
            System.out.println("account2 is an instance of BankAccount.");
            account2.displayAccountDetails();
        } else {
            System.out.println("account2 is not an instance of BankAccount.");
        }

        // Displaying total accounts
        BankAccount.getTotalAccounts();
    }
}
