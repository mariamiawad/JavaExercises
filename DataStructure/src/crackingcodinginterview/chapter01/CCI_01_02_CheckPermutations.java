package crackingcodinginterview.chapter01;

import java.util.Arrays;

public class CCI_01_02_CheckPermutations {

	public boolean checkPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		for (int i = 0; i < chars2.length; i++) {
			if (chars1[i] != chars2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		CCI_01_02_CheckPermutations cci = new CCI_01_02_CheckPermutations();
		System.out.println(cci.checkPermutation("god", "dog")); // should return true;
		System.out.println(cci.checkPermutation("good", "dog")); // should return false;
		System.out.println(cci.checkPermutation("good", "goodbye")); // should return false;
		System.out.println(cci.checkPermutation("hello", "mariam")); // should return false;

	}

}
