import java.util.Scanner;

public class IntrestRate {
	public static void main(String[] args) {
// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Enter annual interest rate in percentage, e.g., 7.25%
		// Obtain monthly interest rate
		
		System.out.println("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		// Enter number of years
		System.out.println("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();

		// Enter loan amount
		

		// Calculate payment
		
		System.out.println("Interest Rate Monthly Payment Total Payment");
		for (double i = 5; i <=8.0; i=i+(1/8.0)) {
			double annualInterestRate = i;
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

			double totalPayment = monthlyPayment * numberOfYears * 12;
			
			System.out.printf("%.3f             ", i);
			System.out.printf("%.2f           "  , ((monthlyPayment * 100) / 100.0));
			System.out.printf("%.2f        " , ((totalPayment * 100) / 100.0));
			System.out.println();
		}
		
	}
}