import java.util.Scanner;

public class BinaryFormatWithException {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a binary number: ");
		String binary = input.nextLine();
		if(isBinary(binary)) {
			System.out.println(Integer.parseInt(binary, 2));
		}
		else {
			throw new BinaryFormatException();
		}
	}

	public static boolean isBinary(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!='1'&& s.charAt(i)!='0') {
				return false;
				
			}
		}
		return true;

	}

}

class BinaryFormatException extends IllegalArgumentException {

	public BinaryFormatException() {
		super("Not a binary number");

	}
}