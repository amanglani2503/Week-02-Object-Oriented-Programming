package problemstatements.bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        // creating objects of customers
        SavingsAccount amitAccount = new SavingsAccount(101, "Amit Kakkar", 102200, 43);
        CurrentAccount ashishAccount = new CurrentAccount(104, "Ashish Kumar", 230000, 32);

//     Calculating interest on Accounts
        amitAccount.calculateInterest();
        ashishAccount.calculateInterest();

        // applying for loan
        amitAccount.applyForLoan(450);
        System.out.println();
        ashishAccount.applyForLoan(782);
    }
}
