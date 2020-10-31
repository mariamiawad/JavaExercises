package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyorGirl {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Character> set = new HashSet<Character>();
		char[] chars = scanner.next().toCharArray();
		for (int i = 0; i < chars.length; i++) {
			set.add(chars[i]);
		}
		if (set.size() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
	}

}
