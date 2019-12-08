package exam1;

import java.util.Scanner;

public class Exam1_Question3 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int decimal = inputScanner.nextInt();
		String string = "";
		int remainder = 0;
		int i = decimal;
		while (i > 0) {

			remainder = i % 2;
			i = i / 2;
			string += remainder;
		}
		String binary = "";
		for (int j = string.length() - 1; j >= 0; j--) {
			binary += string.charAt(j);
		}
		System.out.println(binary);
	}
}
