package interviewIST;

public class _04Sample {
	public boolean isPalindrome(int x) {
		if (signedInteger(x)) {
			return false;
		}
		int reversed = reverseInteger(x);
		if (reversed == x) {
			return true;
		}
		return false;
		
	}
	public int reverseInteger(int x) {
		int reversed=0;
		while (x != 0) {
			int digit = x % 10;
			reversed = reversed * 10 + digit;
			x /= 10;
		}
		return reversed;


	}
	public boolean signedInteger(int x) {
		return x<0;

	}
}
