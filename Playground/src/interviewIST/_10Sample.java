package interviewIST;

import java.util.Scanner;

public class _10Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter decimal number: ");
		int decimal = sc.nextInt();
		String strHexadecimal = "";
		while (decimal != 0) {
			int hexNumber = decimal % 16;
			char charHex;
			if (hexNumber <= 9 && hexNumber >= 0) {
				charHex = (char) (hexNumber + '0');
			} else {
				charHex = (char) (hexNumber - 10 + 'A');
			}
			strHexadecimal = charHex + strHexadecimal;
			decimal = decimal / 16;
		}
		System.out.println("Hexadecimal number: " + strHexadecimal);
		sc.close();
	}
}
