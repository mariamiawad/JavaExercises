package crackingcodinginterview.chapter01;

public class CCI_01_02_CheckPermutations {
	
	public boolean checkPermutation(String s1, String s2) {
		// TODO - Implement this method
		return false;
	}

	public static void main(String[] args) {
		CCI_01_02_CheckPermutations cci = new CCI_01_02_CheckPermutations();
		System.out.println(cci.checkPermutation("god", "dog")); // should return true;
		System.out.println(cci.checkPermutation("good", "dog")); // should return false;
		System.out.println(cci.checkPermutation("good", "goodbye")); // should return false;
		System.out.println(cci.checkPermutation("hello", "mariam")); // should return false;

	}

}
