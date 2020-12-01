package codeforces;

import java.util.Scanner;

public class FibonacciArmy {
	public static int fibonacciArmy(int n) {
		if (n <= 1) {
			return 1;
		}

		return fibonacciArmy(n - 1) + fibonacciArmy(n - 2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(fibonacciArmy(n));

	}
}
