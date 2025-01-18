class BankAccount {
    public String accountNumber; // Public: accessible anywhere
    protected String accountHolder; // Protected: accessible within the package and subclasses
    private double balance; // Private: accessible only within this class

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify balance
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

// Subclass to demonstrate access to public and protected members
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Alice", 1000.0);
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Bob", 2000.0);

        System.out.println("Initial Balance: $" + account.getBalance());
        account.deposit(500.0);
        account.withdraw(300.0);
        System.out.println("Updated Balance: $" + account.getBalance());

        System.out.println("\nSavings Account Details:");
        savingsAccount.displayAccountDetails();
    }
}
