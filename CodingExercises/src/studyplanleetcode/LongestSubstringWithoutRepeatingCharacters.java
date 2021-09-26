package studyplanleetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<Character>();
		int max = 0;
		int start = 0;
		int end = 0;
		if (s.charAt(0) == ' ') {
			return 1;
		}

		int j = 0;
		int i = 0;
		while (i < s.length()) {
			if (set.contains(s.charAt(i))) {
				set.remove(s.charAt(i));
				j++;
			}

			set.add(s.charAt(i));
			max = Math.max(max, set.size());
			i++;
			
		}
		return max;
//		while (end < s.length()) {
//			c = s.charAt(end);
//			while (set.contains(c)) {
//				set.remove(s.charAt(start));
//				start++;
//			}
//			set.add(c);
//			length = Math.max(start, end - start + 1);
//			end++;
//		}
		

	}

//	public static int lengthOfLongestSubstring(String s, int m, int n) {
//		if (s.length() == 0) {
//			return 0;
//		}
//		if (m > s.length() && n > s.length()) {
//			return 0;
//		}
//		if (m >= n) {
//			return 1;
//		}
//
//		return lengthOfLongestSubstring(s.substring(m, n), ++m, --n);
//	}

	public static int lengthOfLongestSubstring(String s, int m, int n, int result) {

		if (s.length() <= 0) {
			return 0;
		}
		if (m >= n) {
			return 1;
		}
		while (n < s.length() && m < n) {
			result += lengthOfLongestSubstring(s.substring(m, n), ++m, --n, result);
		}

		return result;
	}

	public static void main(String[] args) {
		String s = "pw";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
