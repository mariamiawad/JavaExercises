package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam02_Question03 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		String string = "";
		char[] chars = new char[n];
		for (int i = 0; i < chars.length; i++) {
			string += (char) (i + 'a');
		}
		getPermutation(string, 0, string.length() - 1);

	}

	private static void getPermutation(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				getPermutation(str, l + 1, r);
				str = swap(str, l, i);
			}
		}

	}

	private static String swap(String a, int j, int i) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);

	}

}
