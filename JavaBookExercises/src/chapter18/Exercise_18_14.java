package chapter18;

import java.util.Scanner;

public class Exercise_18_14 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String string = inputScanner.next();
		Character[] characters = string.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
		System.out.println(getNumberOfUperCaseLetters(characters, 0));
	}

	private static int getNumberOfUperCaseLetters(Character[] characters, int i) {
			if (i>= characters.length) {
				return 0;
			}
			
			else if (Character.isUpperCase(characters[i].charValue()) ) {
				return 1 + getNumberOfUperCaseLetters(characters, i+1);
			}
			else {
				return getNumberOfUperCaseLetters(characters, i+1);
			}
		
	}
}
