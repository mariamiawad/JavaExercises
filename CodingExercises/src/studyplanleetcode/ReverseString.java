package studyplanleetcode;

import java.util.Arrays;

public class ReverseString {
	public static void reverseString(char[] s) {
		for (int i = 0, j = s.length - 1; i < s.length / 2 && j >= s.length / 2; i++, j--) {
			char c = s[i];
			s[i] = s[j];
			s[j] = c;
		}
		System.out.println(Arrays.toString(s));
	}
	public static void main(String[] args) {
		char [] s = {'h','e','l','l','o'};
		reverseString(s);
	}
}
