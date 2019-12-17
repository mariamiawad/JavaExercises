package exam1;

import java.util.Scanner;

public class Exam1_Question7 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int length = inputScanner.nextInt();
		boolean[][] array = new boolean[length][length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (isPrime(i) && isPrime(j)) {
					array[i][j] = true;
				} else {
					array[i][j] = false;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;

	}
}
