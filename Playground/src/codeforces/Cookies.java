package codeforces;

import java.util.Scanner;

public class Cookies {
	private int countCookies(int n, int[] cookies) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < cookies.length; i++) {
			sum += cookies[i];
		}
		for (int i = 0; i < cookies.length; i++) {
			sum -= cookies[i];
			if (sum % 2 == 0) {
				count++;
			}
			sum += cookies[i];
		}
		return count;
	}

	private int countCookies(int[] cookies) {
		int numberEven = 0;
		int numberOdd = 0;
		int sum = 0;
		for (int i = 0; i < cookies.length; i++) {
			sum += cookies[i];
			if (cookies[i] % 2 == 0) {
				numberEven++;
			} else {
				numberOdd++;
			}
		}
		if (sum % 2 == 0) {
			return numberEven; 
		}
		else {
			return numberOdd;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] cookies = new int[n];
		for (int i = 0; i < cookies.length; i++) {
			cookies[i] = scanner.nextInt();
		}
		Cookies cookie = new Cookies();
		System.out.println(cookie.countCookies(n, cookies));
		System.out.println(cookie.countCookies(cookies));
		scanner.close();

	}
}
