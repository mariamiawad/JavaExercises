package chapter10;

import java.util.Scanner;

public class Exercise_10_26 {
	/** Main method */
	public static void main(String[] args) {
		// Check number of strings passed
		Scanner inputScanner = new Scanner(System.in);
		String number = inputScanner.nextLine();
		number = number.strip();
		char [] c = number.toCharArray();
		String n1 = "";
		int i = 0;
		while (c[i]!='+' && c[i]!='-' && c[i]!='*' && c[i]!='/') {
			n1 +=c[i];	
			i++;
		}
		char operand = c[n1.length()];
		String n2 = number.substring(n1.length()+1, number.length());
		double number1 = Double.parseDouble(n1);
		double number2 = Double.parseDouble(n2);
		// The result of the operation
		double result = 0;

		// Determine the operator
		switch (operand) {
		case '+':
			result = number1 + number2;
			break;
		case '-':
			result = number1 - number2;
			break;
		case '.':
			result = number1 * number2;
			break;
		case '/':
			result = number1 / number2;
		}

		// Display result
		System.out.println(number1+ " " + operand + " " + number2 + " = " + result);
	}
}