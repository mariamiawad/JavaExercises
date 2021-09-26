package codingLeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
//https://leetcode.com/problems/longest-palindromic-substring/
public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s) {
		Stack<Character> stack = new Stack<>();
		String string ="";

		stack.push(Character.valueOf(s.charAt(0)));
		
//		stack.push(Character.valueOf(s.charAt(0)));
		for (int i =0; i < s.length()-1; i++) {
			if (stack.peek().equals(Character.valueOf(s.charAt(i+1)))) {
				stack.push(Character.valueOf(s.charAt(i)));
			}
			
			else {
				
				if (!stack.isEmpty()) {
					 stack.pop();
				}
				
//			}
			
		}
//		String string ="";
		for (Character character : stack) {
			string+= character+"";
		}
		
//		for (int i = 0; i < s.length(); i++) {
//			string+= s.charAt(i)+"";
//		}
	public static void main(String[] args) {
		System.out.println(longestPalindrome("cbbd"));
	}
}
