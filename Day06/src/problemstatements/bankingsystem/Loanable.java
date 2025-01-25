package problemstatements.bankingsystem;

interface Loanable {
    public void applyForLoan(int creditScore);
    public boolean calculateLoanEligibility(int creditScore);
}
