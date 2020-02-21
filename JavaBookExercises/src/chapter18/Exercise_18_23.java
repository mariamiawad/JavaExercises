package chapter18;

import java.util.Scanner;

public class Exercise_18_23 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String binaryString = inputScanner.next();
//		binaryString = reverseString(binaryString, "");
		System.out.println(bin2Dec(binaryString));
	}

	public static int bin2Dec(String binInput) {
		if (binInput.length() <= 0)
			return 0;
		return Integer.parseInt(binInput.substring(0, 1)) * (int) Math.pow(2, binInput.length() - 1)
				+ bin2Dec(binInput.substring(1));
	}

}
