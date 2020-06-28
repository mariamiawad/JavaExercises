package codingLeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
//https://leetcode.com/problems/longest-substring-without-repeating-characters/

	public static int lengthOfLongestSubstring(String s) {

		if (s.length() == 1) {
			return 1;
		}
		Set<Character> set = new HashSet<>();
		int i = 0;
		int j = 0;
		int result = 0;
		while (i < s.length() && j < s.length()) {
			if (!set.contains(Character.valueOf(s.charAt(j)))) {
				set.add(Character.valueOf(s.charAt(j++)));
				result = Math.max(result, j - i);
			} else {
				set.remove(Character.valueOf(s.charAt(i++)));

			}
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
}
