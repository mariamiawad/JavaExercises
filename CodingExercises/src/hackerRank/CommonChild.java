package hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CommonChild {
	public static int commonChild(String s1, String s2) {
		return commonChild(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
	}

	public static int commonChild(char[] c1, char[] c2, int i, int j) {
		if (i <= 0 || j <= 0) {
			return 0;
		}
		if (c1[i-1] == c2[j-1]) {
			return 1 + commonChild(c1, c2, i - 1, j - 1);

		}
		return Math.max(commonChild(c1, c2, i-1, j), commonChild(c1, c2, i, j-1));

	}

	public static void main(String[] args) {
		String s1 = "MCB";
		String s2 = "MAC";
		System.out.println(commonChild(s1, s2));
	}
}
