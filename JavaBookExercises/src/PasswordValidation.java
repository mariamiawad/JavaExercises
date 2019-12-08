import java.util.Scanner;

public class PasswordValidation {

	public PasswordValidation() {
		// 
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter Password");
		String passowrd = inputScanner.next();
		String numRegex = ".*[0-9].*";
		String alphaRegex = ".*[A-Z].*";
		int count = 0;
		for (char c : passowrd.toCharArray()) {
			if (Character.isDigit(c)) {
				count++;
			}
		}
		for (int i = 0; i < passowrd.length(); i++) {

		}
		if (passowrd.matches(numRegex) && passowrd.matches(alphaRegex) && passowrd.length() >= 8 && count >= 2) {
			System.out.println("Passowrd is Valid");
		} else {
			System.out.println("Password is not Valid");
		}
	}

}
