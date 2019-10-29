import java.util.Scanner;

public class CheckISBN10ForLoop {

	public CheckISBN10ForLoop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN");
		int[] integers = new int[9];
		for (int i = 0; i < 9; i++) {
			integers[i] = inputScanner.nextInt();
		}
		String string = "";

		int sum = 0;
		for (int i = 0; i < integers.length; i++) {
			sum += integers[i] * (i + 1);
		}
		int result = sum % 11;
		String resultString = "";
		if (result == 10) {
			resultString = "X";
		} else {
			resultString = result + "";
		}
		System.out.print("The ISBN-10 number is  ");
		for (int i = 0; i < integers.length; i++) {
			System.out.print(+ integers[i]);

		}
		System.out.println(resultString);
	}

}
