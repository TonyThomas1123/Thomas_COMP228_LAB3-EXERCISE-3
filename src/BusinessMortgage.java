public class BusinessMortgage extends Mortgage {

    public BusinessMortgage(String mortgageNumber, String customerName, double amount, double primeRate, int term) {
        // Set interest rate to 1% over prime rate
        super(mortgageNumber, customerName, amount, primeRate + 1.0, term);
    }

    @Override
    public String getMortgageInfo() {
        return "Business Mortgage [Mortgage Number: " + mortgageNumber +
                ", Customer: " + customerName +
                ", Amount: $" + amount +
                ", Interest Rate: " + interestRate + "%" +
                ", Term: " + term + " years" +
                ", Total Owed: $" + calculateTotalOwed() + "]";
    }
}
//Program Ends//
