import java.util.Scanner;

public class ComputeCDValue {

	public ComputeCDValue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter amount");
		double amount = inputScanner.nextDouble();
		System.out.println("Enter annual percentage yield");
		double annualPercentageYield = inputScanner.nextDouble();
		System.out.println("Enter months");
		int months = inputScanner.nextInt();
		double rate = annualPercentageYield/(months*100.0);
		double sum = amount + amount * rate;
		for (int i = 1; i < months; i++) {
			System.out.printf("%.3f",sum);
			System.out.println();
			sum = sum + sum*rate;
		}
	} 
}
