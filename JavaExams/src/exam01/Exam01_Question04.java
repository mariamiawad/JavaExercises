package exam01;

import java.util.Scanner;

public class Exam01_Question04 {
	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);
		int decimal = inputScanner.nextInt();
		int base = inputScanner.nextInt();
		String string = "";
		int remainder = 0;
		int i = decimal;
		while (i > 0) {

			remainder = i % base;
			i = i / base;
			if (base > 10) {
				switch (remainder) {
				case 10:
					string += "A";
					break;
				case 11:
					string += "B";
					break;
				case 12:
					string += "C";
					break;
				case 13:
					string += "D";
					break;
				case 14:
					string += "E";
					break;
				case 15:
					string += "F";
					break;
				default:
					string += remainder;
				}
			} else {
				string += remainder;
			}
		}
		String binary = "";
		for (int j = string.length() - 1; j >= 0; j--) {
			binary += string.charAt(j);
		}
		System.out.println(binary);

	}
}
