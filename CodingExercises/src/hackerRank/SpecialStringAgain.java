package hackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpecialStringAgain {
	static long substrCount(int n, String s) {
		long count = s.length();
		for (int i = 0; i < s.length(); i++) {
			int minIndex = -1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if (minIndex == -1 || (j - minIndex == minIndex - i)) {
						count++;

					}
				} else {
					if (minIndex == -1) {
						minIndex = j;
					} else {
						break;

					}
				}

			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(substrCount(1, "abcbaba"));
	}
}
