import java.time.Year;
import java.util.Scanner;

public class NumberOfDaysInYear {

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = inputScanner.nextInt();

		System.out.println(numberOfDaysInAYear(year));
	}

	public static int numberOfDaysInAYear(int year) {
		if (Year.isLeap(year)) {
			return 366;
		} else {
			return 365;
		}
	}
}
