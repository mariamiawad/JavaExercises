
public class DisplayPrimeNumbers {

	public DisplayPrimeNumbers() {
		// 
	}

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();
		for (int i = 2; i < 121; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
