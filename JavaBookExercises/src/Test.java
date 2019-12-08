public abstract class Test<E extends Object> {
	public static void main(String[] args) {
		printDivisors(4014);
	}

	static void printDivisors(int n) {
		// Note that this loop runs till square root
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				// If divisors are equal, print only one
				if (n / i == i)
					System.out.printf("%d ", i);

				else // Otherwise print both
					System.out.printf("%d %d ", i, n / i);
			}
		}
	}

}