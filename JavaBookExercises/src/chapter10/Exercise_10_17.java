package chapter10;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Exercise_10_17 {

	public Exercise_10_17() {
	}

	public static void main(String[] args) {
		BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
		MathContext mContext = new MathContext(10);
		BigDecimal n = longMaxValue.sqrt(mContext);
		int count = 10;
		while (count > 0) {
			
			
			BigDecimal squared = n.multiply(n);
			if (squared.compareTo(longMaxValue) > 0) {
				count--;
				System.out.println(count + ": " + n + " squared = " + squared);
			}
			n = n.add(BigDecimal.ONE);
		}
	}

}
