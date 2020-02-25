package chapter20;

import java.util.Scanner;
import java.util.Stack;

public class Exercise_20_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(isBalanced(scanner.next()));
	}

	static String isBalanced(String s) {

		boolean isBalanced = false;
		int length = s.length();
		char symbol6 = '}';
		char symbol5 = '{';
		char symbol4 = ')';
		char symbol3 = '(';
		char symbol2 = ']';
		char symbol1 = '[';
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (symbol1 == charArray[i] || symbol3 == charArray[i] || symbol5 == charArray[i]) {
				stack.push(charArray[i]);
				if (i < length - 1)
					continue;
			}
			if (stack.size() > 0) {
				if (stack.peek().equals(symbol1) && charArray[i] == symbol2) {
					stack.pop();
					isBalanced = true;
					continue;
				} else if (charArray[i] == symbol4 && stack.peek() == symbol3) {

					stack.pop();
					isBalanced = true;
					continue;

				} else if (charArray[i] == symbol6 && stack.peek() == symbol5) {

					stack.pop();
					isBalanced = true;
					continue;

				}

				else {
					isBalanced = false;
					break;
				}
			} else {
				isBalanced = false;
			}

		}

		if (isBalanced) {
			return "YES";

		} else {
			return "NO";

		}

	}

}
