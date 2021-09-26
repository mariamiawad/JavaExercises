package chapter22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.crypto.Mac;

import edu.princeton.cs.algs4.In;

public class Exercise_22_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		System.out.println(getEndIndex(s));
		System.out.println(getStartIndex(s));
		String result = s.substring(getStartIndex(s), getEndIndex(s));
		System.out.println(result);
	}

	private static int getStartIndex(String s) {
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			for (int j = 1; j < s.length(); j++) {
				char b = s.charAt(j);
				if (a < b) {
					return i;
				}
			}
		}
		return 0;
	}

	private static int getEndIndex(String s) {
		int count = 1;
		int max = -1;
		int j = 1;
		for (int i = 0; i < s.length() && j < s.length(); i++) {
			char a = s.charAt(i);
			char b = s.charAt(j);
			if (a < b) {
				count++;
				j++;
				if (count > max) {
					max = count;
				}
			}
//			for (int j = i + 1; j < s.length(); j++) {
//				char b = s.charAt(j);
//				if (a < b) {
//					count++;
//					if (count > max) {
//						max = count;
//					}
//				}
//			}
		}
		return max;
	}

}

// welcome -> el
// Welcome -> Wel
// ab -> ab
