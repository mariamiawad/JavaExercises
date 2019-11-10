import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_18_01 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println(factorial(inputScanner.nextInt()));
	}
	/** Return the factorial for a specified number */
	public static BigInteger factorial(int n) {
		BigInteger n1 = BigInteger.valueOf(n);
		return factorial(n1, BigInteger.ONE); // Call auxiliary method
	}

	/** Auxiliary tail-recursive method for factorial */
	private static BigInteger factorial(BigInteger n, BigInteger result) {
		
		if (n.compareTo(BigInteger.ZERO)==0)
			return result;
		else
			return factorial(n.subtract(BigInteger.ONE), n.multiply(result) ); // Recursive call
	}
}