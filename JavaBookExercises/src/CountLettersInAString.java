import java.util.Scanner;

public class CountLettersInAString {

	public CountLettersInAString() {
		// 
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter string");
		String s = inputScanner.next();
		System.out.println(countLetters(s));
	}
	public static int countLetters(String s) {
		return s.length();
	}
}
