import java.util.Scanner;

public class BinaryNumberFormatException {

	public BinaryNumberFormatException() {
		// 
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String binaryString = inputScanner.next();
		bin2Dec(binaryString);
	}

	public static void bin2Dec(String binaryString)throws NumberFormatException {

		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
				throw new NumberFormatException();
			}

		}

		System.out.println(Integer.parseInt(binaryString, 2));
	}
}
