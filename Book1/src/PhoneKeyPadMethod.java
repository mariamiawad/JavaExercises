import java.util.Scanner;

public class PhoneKeyPadMethod {

	public PhoneKeyPadMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String number = inputScanner.nextLine();
		String string = "";
		for (int i = 0; i < number.length(); i++) {
			if (Character.isDigit(number.charAt(i))) {
				string += number.charAt(i) + "";
			} else if (Character.isLetter(number.charAt(i))) {
				if(getNumber(number.toUpperCase().charAt(i)) != -1){
				string += getNumber(number.toUpperCase().charAt(i)) + "";
				}
			} else {
				string += number.charAt(i) + "";
			}
		}
		System.out.println(string);

	}

	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C') {
			return 2;
		} else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F') {
			return 3;
		} else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I') {
			return 4;
		} else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L') {
			return 5;
		} else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O') {
			return 6;
		} else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R'
				|| uppercaseLetter == 'S') {
			return 7;
		} else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V') {
			return 8;
		} else if (uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y'
				|| uppercaseLetter == 'Z') {
			return 9;
		}
		return -1;
	}
}
