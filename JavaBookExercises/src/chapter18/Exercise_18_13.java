package chapter18;

import java.util.Scanner;

public class Exercise_18_13 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int[] numbers = new int[8];
		for (int i = 0; i < 8; i++) {
			numbers[i] = inputScanner.nextInt();
		}
		System.out.println(getMax(numbers, 0, 0));
	}
	private static int getMax(int [] numbers, int number, int size) {
		if (size>=numbers.length) {
			return number;
		}
		if (number < numbers[size]) {
			number = numbers[size];
		}
		return getMax(numbers, number, size+1);
	}
}
