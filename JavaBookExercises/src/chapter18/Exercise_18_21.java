package chapter18;

import java.util.Scanner;

public class Exercise_18_21 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String string = inputScanner.next();
		System.out.println(dec2Bin(Integer.valueOf(string)));
	}

	public static String dec2Bin(int value) {

		if (value == 0) {
			return "0";
		}

		return value % 2 + 10 * Integer.valueOf(dec2Bin(value / 2)) + "";

	}

}
