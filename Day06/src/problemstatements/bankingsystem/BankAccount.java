package problemstatements.bankingsystem;

abstract public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;
    private int age;

    public BankAccount(int accountNumber, String holderName, double balance, int age){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.age = age;
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return holderName;
    }

    public int getAge(){
        return age;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount cannot be negative !");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    abstract public void calculateInterest();
}