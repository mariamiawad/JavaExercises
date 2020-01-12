package chapter18;

import java.util.Scanner;

public class Exercise_18_17 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String string = inputScanner.nextLine();
		char ch = inputScanner.next().charAt(0);
		System.out.println(count(string.toCharArray(), ch));
	}

	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);

	}

	public static int count(char[] chars, char ch, int high) {
		if (high < 0) {
			return 0;
		}
		if (ch == chars[high]) {
			return 1 + count(chars, ch, high - 1);
		}

		return count(chars, ch, high - 1);

	}
}
