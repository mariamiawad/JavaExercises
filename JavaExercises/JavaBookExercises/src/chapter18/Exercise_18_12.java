package chapter18;

import java.util.Scanner;

public class Exercise_18_12 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String value = inputScanner.nextLine();
		reverseDisplay(value, value.length()-1);
	}
	public static void reverseDisplay(String value, int high) {
		if (high< 0) {
			return;
		}
		System.out.print(value.charAt(high));
		reverseDisplay(value, high-1);
	}
}
