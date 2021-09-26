package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class Test {
	static long substrCount(String s) {
		long retVal = s.length();

		for (int i = 0; i < s.length(); i++) {
			int diffCharIdx = -1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if (diffCharIdx == -1 || (j - diffCharIdx == diffCharIdx - i))
						retVal++;
				} else {
					if (diffCharIdx == -1) {
						diffCharIdx = j;
					} else {
						break;
					}
				}
			}
		}
		return retVal;
	}

	public static void main(String[] args) {
		String a = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		String b = "fcrxzwscanmligyxyvym";
		System.out.println(substrCount("abcbaba"));
	}

}
