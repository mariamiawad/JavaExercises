package interviewIST;

public class _03Sample {

	public static void main(String[] args) {
		_03Sample sample = new _03Sample();
		System.out.println(sample.reverse(1534236469));
	}

	public int reverse(int x) {

		long reversed = 0;
		while (x != 0) {
			int digit = x % 10;
			reversed = reversed * 10 + digit;
			x /= 10;
		}
		if (reversed >= Integer.MAX_VALUE || reversed <= Integer.MIN_VALUE) {
			return 0;
		}
		return (int) reversed;

	}

}
