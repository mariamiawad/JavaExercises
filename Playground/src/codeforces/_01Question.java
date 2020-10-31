package codeforces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1426/A
public class _01Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			if (n == 1 || n == 2) {
				System.out.println("1");
			} else {
				int a = (int) Math.ceil((((double)(n - 2) / x))) + 1;

				System.out.println(a);
			}
		}
	}
}
