import java.util.Scanner;

public class LoanAmortizationSchedule {

	public LoanAmortizationSchedule() {
		// TODO Auto-generated constructor stub
	}
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
				System.out.println("Annual Interest Rate: ");
				int annualInterestRate = input.nextInt();

				// Enter loan amount
				
				double monthlyInterestRate = (annualInterestRate*1.0) / 1200;
				double monthlyPayment = loanAmount * monthlyInterestRate
						/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
				
				double totalPayment = monthlyPayment * numberOfYears * 12;
				System.out.print("Monthly Payment ");
				System.out.printf("%.3f",monthlyPayment);
				System.out.println();
				System.out.print("Total payment " );
				System.out.printf("%.3f",totalPayment);
				System.out.println();
				double balance = loanAmount;
				System.out.println("Interest Principal Balance");
				for (int i = 1; i <=numberOfYears*12; i++) {
					double monthlyIntrest = monthlyInterestRate * balance;
					double principal = monthlyPayment - monthlyIntrest; 
					balance = balance -principal;
					System.out.printf(" %d ",i);
					System.out.printf( " %.3f ",monthlyIntrest);
					System.out.printf(" %.3f ",principal);
					System.out.printf(" %.3f ",balance);
					System.out.println();
				
				}
				
			
	}

}
