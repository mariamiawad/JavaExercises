package leetCode30DaysChallenge;

import java.util.Stack;

public class _09DayNine {

	public static boolean backspaceCompare(String S, String T) {
		return strings(S).equals(strings(T));
	
	}

	private static String strings(String S) {
		Stack<Character> stack = new Stack<>();
		for (char ch : S.toCharArray()) {
			if (ch != '#') {
				stack.push(ch);
			} else if (!stack.isEmpty()) {
				stack.pop();
			}
		}
		return String.valueOf(stack);
	}

	public static void main(String[] args) {
		System.out.println(backspaceCompare("a##c", "#a#c"));
	}
}
