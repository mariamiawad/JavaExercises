import java.math.BigInteger;

public class Exercise_13_15 extends Number implements Comparable<Exercise_13_15> {
	/**
		 * 
		 */
	
	
	private static final long serialVersionUID = 1L;
	// Data fields for numerator and denominator
	private BigInteger numerator = BigInteger.ZERO;
	private BigInteger denominator = BigInteger.ONE;

	/** Construct a rational with default properties */
	public Exercise_13_15() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}
	public static void main(String[] args) {
		Exercise_13_15 r1 = new Exercise_13_15(BigInteger.ONE, BigInteger.valueOf(123456789));
		 Exercise_13_15 r2 = new Exercise_13_15(BigInteger.ONE, BigInteger.valueOf(123456789));
		 Exercise_13_15 r3 = new Exercise_13_15(BigInteger.ONE, BigInteger.valueOf(123456789));
		 System.out.println("r1 * r2 * r3 is " +
		 r1.multiply(r2.multiply(r3)));
		 }

	/** Construct a rational with specified numerator and denominator */
	public Exercise_13_15(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		BigInteger posOne =  BigInteger.valueOf(1);
		BigInteger negOne =  BigInteger.valueOf(-1);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) > 0) ? posOne  : negOne).multiply(numerator.divide(gcd));
		this.denominator = (denominator.abs()).divide(gcd);
	}

	/** Find GCD of two numbers */
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = BigInteger.ONE;

		for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
			if (n1.mod(k).equals(BigInteger.ZERO) && n2.mod(k).equals(BigInteger.ZERO))
				gcd = k;
		}

		return gcd;
	}

	/** Return numerator */
	public BigInteger getNumerator() {
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator() {
		return denominator;
	}

	/** Add a rational number to this rational */
	public Exercise_13_15 add(Exercise_13_15 secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Exercise_13_15(n, d);
	}

	/** Subtract a rational number from this rational */
	public Exercise_13_15 subtract(Exercise_13_15 secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Exercise_13_15(n, d);
	}

	/** Multiply a rational number by this rational */
	public Exercise_13_15 multiply(Exercise_13_15 secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Exercise_13_15(n, d);
	}

	/** Divide a rational number by this rational */
	public Exercise_13_15 divide(Exercise_13_15 secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.numerator);
		return new Exercise_13_15(n, d);
	}

	@Override
	public String toString() {
		if (denominator.equals(BigInteger.ONE))
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override // Override the equals method in the Object class
	public boolean equals(Object other) {
		if (((this.subtract((Exercise_13_15) (other))).getNumerator()).equals(BigInteger.ZERO))
			return true;
		else
			return false;
	}

	@Override // Implement the abstract intValue method in Number
	public int intValue() {
		return (int) doubleValue();
	}

	@Override // Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override // Implement the doubleValue method in Number
	public double doubleValue() {
		return numerator.doubleValue() / denominator.doubleValue();
	}

	@Override // Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	@Override // Implement the compareTo method in Comparable
	public int compareTo(Exercise_13_15 o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
			return -1;
		else
			return 0;
	}

}