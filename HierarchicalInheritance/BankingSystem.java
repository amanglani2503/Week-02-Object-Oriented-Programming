package HierarchicalInheritance;

// Base class BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Balance: " + this.balance);
    }

    // Method to be overridden in subclasses
    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }

    // Display account details method to be overridden in subclasses
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        displayBalance();
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
        System.out.println("Interest Rate: " + this.interestRate + "%");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + this.interestRate + "%");
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
        System.out.println("Withdrawal Limit: " + this.withdrawalLimit);
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit: " + this.withdrawalLimit);
    }
}

// Subclass FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        System.out.println("Deposit Term: " + this.depositTerm + " years");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Deposit Term: " + this.depositTerm + " years");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA12345", 10000.00, 3.5);
        BankAccount checking = new CheckingAccount("CA67890", 5000.00, 2000.00);
        BankAccount fixedDeposit = new FixedDepositAccount("FDA11223", 100000.00, 5);

        System.out.println("Savings Account Details:");
        savings.displayAccountDetails();
        System.out.println();

        System.out.println("Checking Account Details:");
        checking.displayAccountDetails();
        System.out.println();

        System.out.println("Fixed Deposit Account Details:");
        fixedDeposit.displayAccountDetails();
    }
}
