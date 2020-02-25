package chapter20;

import java.util.Scanner;
import java.util.Stack;

public class Exercise_20_14 {
	public static void main(String[] args) {
		Stack<Integer> digitStack = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] strings = s.split(" ");
		for (int i = 0; i < strings.length; i++) {
			if (isNumeric(strings[i])) {
				digitStack.push(Integer.parseInt(strings[i]));

			} else {
				char y = strings[i].charAt(0);
				if (y == '+') {
					int number = digitStack.pop() + digitStack.pop();
					digitStack.push(number);
				}
				if (y == '-') {
					int number = digitStack.pop() - digitStack.pop();
					digitStack.push(number);
				}
				if (y == '*') {
					int number = digitStack.pop() * digitStack.pop();
					digitStack.push(number);
				}
				if (y == '/') {
					int number = digitStack.pop() / digitStack.pop();
					digitStack.push(number);
				}
			}
		}
		System.out.println(digitStack.pop());
	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
}
