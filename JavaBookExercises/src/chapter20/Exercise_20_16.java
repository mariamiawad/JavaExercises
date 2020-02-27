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

		Stack<Character> stack = new Stack<>();
		Stack<Character> charachterStack = new Stack<>();
		String string = "";
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (Character.isDigit(ch) || Character.isSpace(ch)) {
				stack.push(expression.charAt(i));
			} else if (charachterStack.isEmpty() && ch != ')') {
				charachterStack.push(ch);
			}

			else if (!charachterStack.isEmpty()) {
				if ((charachterStack.peek() == '*' && ch == '/') || (charachterStack.peek() == '/' && ch == '*')
						|| (charachterStack.peek() == '*' && ch == '*')
						|| (charachterStack.peek() == '/' && ch == '/')) {
					stack.push(charachterStack.pop());
					charachterStack.push(ch);
				} else {
					charachterStack.push(ch);
				}
			}
			if (ch == ')') {
				while (!charachterStack.isEmpty()) {
					if (charachterStack.peek() == ')' || charachterStack.peek() == '(') {
						charachterStack.pop();
						continue;
					}
					stack.push(charachterStack.pop());
				}
			}

		}
		while (!charachterStack.isEmpty()) {
			stack.push(charachterStack.pop());
		}
		Stack<Character> newStack = new Stack<>();
		while (!stack.isEmpty()) {
			newStack.push(stack.pop());

		}

		while (!newStack.isEmpty()) {
			string += newStack.pop();
		}
		return string;
	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
}
