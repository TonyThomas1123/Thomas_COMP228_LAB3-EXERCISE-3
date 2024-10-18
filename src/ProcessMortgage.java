import java.util.Scanner;

public class ProcessMortgage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mortgage[] mortgages = new Mortgage[3];

        // Get the current prime rate//
        System.out.print("Enter the current prime interest rate: ");
        double primeRate = scanner.nextDouble();

        // Loop to create 3 mortgages//
        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("Enter details for mortgage " + (i + 1));

            // Prompt user for type of mortgage //
            System.out.print("Enter mortgage type (1 for Business, 2 for Personal): ");
            int type = scanner.nextInt();

            // Collect general mortgage info//
            System.out.print("Enter mortgage number: ");
            String mortgageNumber = scanner.next();

            System.out.print("Enter customer name: ");
            String customerName = scanner.next();

            System.out.print("Enter mortgage amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter term (1 for short-term, 3 for medium-term, 5 for long-term): ");
            int term = scanner.nextInt();

            // Create appropriate mortgage based on user input//
            if (type == 1) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else if (type == 2) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else {
                System.out.println("Invalid mortgage type. Skipping.");
            }
        }

        // Display all mortgages//
        System.out.println("\nAll Mortgages:");
        for (Mortgage mortgage : mortgages) {
            if (mortgage != null) {
                System.out.println(mortgage.getMortgageInfo());
            }
        }

        scanner.close();
    }
}
//Program Ends//
