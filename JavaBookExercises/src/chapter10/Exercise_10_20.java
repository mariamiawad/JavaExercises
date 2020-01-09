package chapter10;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Exercise_10_20 {

	public static void main(String[] args) {

		for (int i = 100; i < 1001; i += 100) {
			System.out.println("E =" + i + " " + Euler(i));
//				System.out.println(Math.exp(i));
		}
	}

	private static BigDecimal Euler(int n) {
		BigDecimal e = BigDecimal.ONE;
		BigDecimal f = BigDecimal.ONE;
		for (int i = 1; i <= n; i++) {
			MathContext mContext = new MathContext(25, RoundingMode.HALF_EVEN);
			f = f.multiply(BigDecimal.ONE.divide(new BigDecimal(i), mContext));
			f = f.setScale(25, RoundingMode.UP);
			if (f.equals(BigDecimal.ZERO)) {
				break;
			}
			e = e.add(f);
		}
		return e;
	}
}
