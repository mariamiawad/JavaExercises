package chapter20;

import java.util.Scanner;
import java.util.Stack;

public class Exercise_20_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.nextLine();
		System.out.println(infixToPostfix(expression));

	}

	public static String infixToPostfix(String expression) {
		expression = expression.replace("(", "");
		expression = expression.replace(")", "");
		String[] strings = expression.split(" ");
		Stack<String> stack = new Stack<>();
		Stack<String> charachterStack = new Stack<>();
		String string = "";
		for (int i = 0; i < strings.length; i++) {
			String s = strings[i];
			if (isNumeric(s)) {
				string += s+" ";
			}
			else if (s.equals("+")|| s.equals("-")) {
				stack.push(s);
				
			}
			else if (s.equals("*") ||  s.equals("/")) {
				if (!stack.isEmpty()) {
					string += stack.pop()+" ";
					
				}
				stack.push(s);
			}

		}
		while (!stack.isEmpty()) {
			string+=stack.pop()+" ";
		}
		
		return string;
	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
}
