import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class ValidSSN {

	public ValidSSN() {
		// 
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a SSN:");
		String ssn = inputScanner.next();
		if (isValidSSN(ssn)) {
			System.out.println(ssn + " is a valid social security number");
		} else {
			System.out.println(ssn + " is not a valid social security number");
		}
	}

	public static boolean isValidSSN(String ssn) {

		return ssn.matches("\\d\\d\\d-\\d\\d-\\d\\d\\d\\d");

	}

}
