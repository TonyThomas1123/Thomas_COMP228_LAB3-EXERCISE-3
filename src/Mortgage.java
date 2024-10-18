public abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber;
    protected String customerName;
    protected double amount;
    protected double interestRate;
    protected int term;

    public Mortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;

        // Need to make sure that mortgage amount doesn't exceed the maximum limit//
        if (amount > MAX_MORTGAGE_AMOUNT) {
            this.amount = MAX_MORTGAGE_AMOUNT;
        } else {
            this.amount = amount;
        }

        this.interestRate = interestRate;

        // Ensure the term is valid (1, 3, or 5 years)//
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;  // Default to short term if invalid
        } else {
            this.term = term;
        }
    }

    // Abstract method to display mortgage details//
    public abstract String getMortgageInfo();

    // To calculate total amount (principal + interest)//
    public double calculateTotalOwed() {
        return amount + (amount * (interestRate / 100) * term);
    }
}
//Program Ends//
