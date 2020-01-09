package exam03;

import java.util.Scanner;

public class Exam03_Question01 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String s = inputScanner.nextLine();
		String t = inputScanner.nextLine();
		System.out.println(rearange(s, t));
	}

	public static boolean rearange(String s, String t) {
		if (s.length() != t.length()) {
			return false;

		}
		int j = 0;
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == t.charAt(j)) {
				j++;
			}
		}
		s2 = t.substring(0, j);
		String s3 = t.substring(j, t.length());
		String all = s3+s2;
		if ((all).equals(s)) {
			return true;
		}
		return false;
	}
}
