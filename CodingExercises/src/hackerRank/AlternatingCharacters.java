package hackerRank;

import java.util.Scanner;
import java.util.Stack;

public class AlternatingCharacters {
	public static int alternatingCharacters(String s) {
		// Write your code here
		Stack<Character> stack = new Stack<Character>();
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (!stack.isEmpty()) {
				if (stack.peek() == s.charAt(i)) {
					stack.pop();
				}
			}

			stack.push(s.charAt(i));

		}
		return s.length() - stack.size();
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		for (int i = 0; i < n; i++) {
//			String s = scanner.nextLine();
//			System.out.println(alternatingCharacters(s));
//		}
		System.out.println(alternatingCharacters("BBBBB"));
		System.out.println(alternatingCharacters("AAAA"));
		System.out.println(alternatingCharacters("ABABABAB"));
		System.out.println(alternatingCharacters("BABABA"));
		System.out.println(alternatingCharacters("AAABBB"));
	}
}
