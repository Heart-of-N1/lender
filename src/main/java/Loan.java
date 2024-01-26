public class Loan {
    private int amount;
    private Stirng borrower;
    private boolean isPaid;
    prviate double interestRate;
    private String contactNumber;

    public Loan(int amount, Stirng borrower, double interestRate, String contactNumber) {
        this.amount = amount;
        this.borrower = borrower;
        this.interestRate = interestRate;
        this.contactNumber = contactNumber;
        this.isPaid = false;
    }

    //accessors.

    public int getAmount() {
        return amount;
    }
}
