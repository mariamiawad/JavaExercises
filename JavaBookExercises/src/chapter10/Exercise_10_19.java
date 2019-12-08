package chapter10;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Exercise_10_19 {

	public Exercise_10_19() {
		// 
	}

	public static void main(String[] args) {
		// Printing heading

		System.out.printf("%-5s%8s\n", "p", "2^p-1");

		for (int i = 2; i <= 100; i++) {

			BigInteger prime = mersennePrime(i);

			if (!prime.equals(BigInteger.ZERO)) {
				System.out.println(i + "    " + prime);
			}

		}

	}

	public static BigInteger mersennePrime(int n) {
		BigDecimal x = new BigDecimal (Math.pow(2, n));
		BigInteger z = x.toBigIntegerExact();
		z = z.subtract(BigInteger.ONE);
		BigInteger prime =z;
		if (isPrime(prime)) {
			return prime;
		}

		return BigInteger.ZERO;

	}

	public static boolean isPrime(BigInteger number) {
		
		
		return number.isProbablePrime(1);
		

	}
}
