import java.util.Scanner;

public class CurrencyExchange {

	public CurrencyExchange() {
		// 
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the exchange rate from dollars to RMB:");
		double rate = inputScanner.nextDouble();
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
		int convertFrom = inputScanner.nextInt();
		if(convertFrom ==0) {
			System.out.println("Enter the dollar amount:");
		}
		else if(convertFrom ==1) {
			System.out.println("Enter the RMB amount:");
		}
		double amount = inputScanner.nextDouble();
		double result = amount * rate;
		System.out.println("$" + amount +" = "+ result +" yuan");
	}
}
