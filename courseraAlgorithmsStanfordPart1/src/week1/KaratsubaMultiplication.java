package week1;

import java.math.BigInteger;
import java.util.Scanner;

public class KaratsubaMultiplication {
	private final static BigInteger ZERO = new BigInteger("0");

	public static BigInteger karatsuba(BigInteger x, BigInteger y) {

		int N = Math.max(x.bitLength(), y.bitLength());
		if (N <= 2000) {
			return x.multiply(y);
		}

		
		N = (N / 2) + (N % 2);

		BigInteger b = x.shiftRight(N);
		BigInteger a = x.subtract(b.shiftLeft(N));
		BigInteger d = y.shiftRight(N);
		BigInteger c = y.subtract(d.shiftLeft(N));

		BigInteger ac = karatsuba(a, c);
		BigInteger bd = karatsuba(b, d);
		BigInteger abcd = karatsuba(a.add(b), c.add(d));

		return ac.add(abcd.subtract(ac).subtract(bd).shiftLeft(N)).add(bd.shiftLeft(2 * N));
	}

	public static BigInteger integerMultiplicationRecursively(BigInteger x, BigInteger y) {
		if (x.equals(BigInteger.ZERO)|| y.equals(BigInteger.ZERO)) {
			return BigInteger.ZERO;
		}
		BigInteger xDivBy10 = x.divide(BigInteger.TEN);
		BigInteger yDivBy10 = y.divide(BigInteger.TEN);
		boolean xIsSingleDigit = xDivBy10.equals(BigInteger.ZERO);
		boolean yIsSingleDigit = yDivBy10.equals(BigInteger.ZERO);
		if(xIsSingleDigit && yIsSingleDigit) {
			return multiplySingleDigit(x, y);
		}
		if (xIsSingleDigit) {
			return (integerMultiplicationRecursively(x, yDivBy10).multiply(BigInteger.TEN)).add(integerMultiplicationRecursively(x, y.mod(BigInteger.TEN)));
		}
		if (yIsSingleDigit) {
			return integerMultiplicationRecursively(xDivBy10, y).multiply(BigInteger.TEN).add(integerMultiplicationRecursively(x.mod(BigInteger.TEN), y));
		}
		return (integerMultiplicationRecursively(x, yDivBy10).multiply(BigInteger.TEN)).add(integerMultiplicationRecursively(x, y.mod(BigInteger.TEN)));

	}
	public static BigInteger multiplySingleDigit(BigInteger x, BigInteger y) {
		if (x.equals(BigInteger.ZERO)|| y.equals(BigInteger.ZERO)) {
			return BigInteger.ZERO;
			
		}
		y = y.subtract(BigInteger.ONE);
		return x.add(multiplySingleDigit(x, y));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger s1 = scanner.nextBigInteger();
		BigInteger s2 = scanner.nextBigInteger();
		System.out.println(karatsuba(s1, s2));
		System.out.println(integerMultiplicationRecursively(s1, s2));
		scanner.close();
	}
}
