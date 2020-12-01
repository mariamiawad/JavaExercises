package codeforces;

import java.util.Scanner;

public class IfAtFirstYouDontSucceed {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int total = scanner.nextInt();
		sum = a + b;
		int diff = sum - c;
		if (diff < total && c <= a && c <= b) {
			System.out.println(total - diff);
		} else {
			System.out.println(-1);
		}

	}
}
