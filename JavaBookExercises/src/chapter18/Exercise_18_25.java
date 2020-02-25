package chapter18;

public class Exercise_18_25 {
	public static void main(String[] args) {
		displayPermutation("abc");
	}
	public static void displayPermutation(String s) {
		displayPermutation("", s);
	}
	public static void displayPermutation(String s1, String s2) {
		if (s2.length()<=0) {
			System.out.println(s1);
		}
		for (int i = 0; i < s2.length(); i++) {
			String s = s1 + s2.charAt(i);
			String string = s2.substring(0, i) + s2.substring( i+1);
			displayPermutation(s, string);
		}
	}
}
