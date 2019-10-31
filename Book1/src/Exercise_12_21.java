import java.io.File;

import java.util.Scanner;

public class Exercise_12_21 {

	public Exercise_12_21() {

	}

	public static void main(String[] args) {
		File file = new File("C:\\Users\\maria\\eclipse-workspace\\Book1\\src\\12.21\\SortedStrings.txt");
		boolean flag = true;
		try {
			Scanner inputScanner = new Scanner(file);
			String string = inputScanner.nextLine();
			string = string.toLowerCase();
			String [] strings = string.split(" ");
			string = "";
			for (int i = 0; i < strings.length; i++) {
				string += strings[i];
			}
			Character char1 = string.charAt(0);
			for (int i = 1; i <string.length(); i++) {
				Character char2 = string.charAt(i);
				if (char1.compareTo(char2)>0) {
					System.out.println(char1 + " " +char2);
					flag = false;
					break;
				}
				char1 = char2;
			}
			if(flag) {
				System.out.println("Strings are Sorted");
			}
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
