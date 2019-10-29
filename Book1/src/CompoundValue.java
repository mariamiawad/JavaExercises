import java.util.Scanner;

public class CompoundValue {

	public CompoundValue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter amount ");
		double amount = inputScanner.nextDouble();
		System.out.println("Enter annual Intrest Rate ");
		double annualIntrestRate = inputScanner.nextDouble();
		System.out.println("Enter months");
		int months = inputScanner.nextInt();
		double monthlyIntrestRate = (annualIntrestRate / 100) / months;
		double rate = 1.0 + monthlyIntrestRate;
		double sum = amount * rate;
		for (int i = 1; i < months; i++) {
			System.out.printf("%.3f", sum);
			System.out.println();
			sum = (sum + 100) * rate;
		}
	}
}
