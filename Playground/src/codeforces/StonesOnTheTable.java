package codeforces;

import java.util.Scanner;

public class StonesOnTheTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String string =scanner.next();
		char[] chars = string.toCharArray();
		int count = 0;
		for (int i = 0; i <chars.length-1; i++) {
			char c = chars[i];
			if (c == chars[i+1]) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
