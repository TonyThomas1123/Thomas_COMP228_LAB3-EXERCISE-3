public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(String mortgageNumber, String customerName, double amount, double primeRate, int term) {
        // Set interest rate to 2% over prime rate
        super(mortgageNumber, customerName, amount, primeRate + 2.0, term);
    }

    @Override
    public String getMortgageInfo() {
        return "Personal Mortgage [Mortgage Number: " + mortgageNumber +
                ", Customer: " + customerName +
                ", Amount: $" + amount +
                ", Interest Rate: " + interestRate + "%" +
                ", Term: " + term + " years" +
                ", Total Owed: $" + calculateTotalOwed() + "]";
    }
}
//Program Ends//