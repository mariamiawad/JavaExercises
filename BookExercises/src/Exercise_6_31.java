import java.util.Scanner;

public class Exercise_6_31 {

	public Exercise_6_31() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer:");
		long x = inputScanner.nextLong();
		System.out.println(sumOfDoubleEvenPlace(x));
		System.out.println(sumOfOddPlace(x));
		if(isValid(x)) {
		System.out.println(x+" is valid");
		}
		else {
			System.out.println(x+" is invalid");
		}
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		int sum = sumOfDoubleEvenPlace(number)+sumOfOddPlace(number);
		if(sum%10==0) {
			return true;
		}
		return false;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		String string = number + "";
		int sum = 0;
		int multiplier = 0;
		for (int i = string.length() - 2; i >= 0; i -= 2) {
			String s = string.charAt(i) + "";
			Integer integer = Integer.parseInt(s);
			multiplier = integer * 2;
			String string2 = multiplier + "";
			if (string2.length() > 1) {
				multiplier = getDigit(Integer.parseInt(string2));

			}
			sum += multiplier;

		}
		return sum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of the
	 * two digits
	 */
	public static int getDigit(int number) {
		String string = number + "";
		int digit = 0;
		for (int i = 0; i < string.length() - 1; i++) {
			String s1 = string.charAt(i) + "";
			String s2 = string.charAt(i + 1) + "";
			digit += Integer.parseInt(s1) + Integer.parseInt(s2);
		}
		return digit;
	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		String string = number + "";
		int sum = 0;
		int multiplier = 0;
		for (int i = string.length() - 1; i >= 0; i -= 2) {
			String string2 = string.charAt(i) + "";
			sum += Integer.parseInt(string2);

		}
		return sum;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return true;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		return 0;
	}

	/**
	 * Return the first k number of digits from number. If the number of digits in
	 * number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		return 0;
	}
}
