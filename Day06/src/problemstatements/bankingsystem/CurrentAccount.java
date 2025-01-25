package problemstatements.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable{
    public static double rateOfInterest = 0.1;

    // constructor to initialize an account
    public CurrentAccount(int accountNumber, String holderName, double initialBalance, int age){
        super(accountNumber, holderName, initialBalance, age);
    }

    // method to calculate Interest
    @Override
    public void calculateInterest(){
        double calculatedInterest = getBalance() * rateOfInterest;
        System.out.println("Calculated Interest for " + getName() + " is $" + calculatedInterest);
    }

    // implemented apply for loan method
    @Override
    public void applyForLoan(int creditScore){
        System.out.println(getName() + " applied for loan !");
        if(calculateLoanEligibility(creditScore)){      // checking if eligible for loan
            System.out.println("Eligible for Loan !!");
        }
        else{
            System.out.println("Not eligible for Loan !!");
        }
    }


    // method that checks eligibility for loan
    @Override
    public boolean calculateLoanEligibility(int creditScore){
        if(getAge() >= 18 && creditScore < 600) {
            System.out.println("Eligibility check passed");
            return true;
        }
        return false;
    }
}