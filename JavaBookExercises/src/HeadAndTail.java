import java.util.Scanner;

public class HeadAndTail {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter Number from 1 to 511");
		int number = inputScanner.nextInt();
		if (number < 0 || number > 511) {
			System.out.println("Invalid number");
			System.exit(1);
		}
		String binaryNumber = Integer.toBinaryString(number);
		String zeroString = "";
		for (int i = 0; i < (9 - binaryNumber.length()); i++) {
			zeroString += "0";
		}
		binaryNumber = zeroString + "" + binaryNumber;
		binaryNumber = binaryNumber.replaceAll("1", "T");
		binaryNumber = binaryNumber.replaceAll("0", "H");
		int k = 0;
		char[][] string = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(binaryNumber.charAt(k) + " ");
				k++;
			}
			System.out.println();
		}

	}

}
