package chapter10;
import java.math.BigDecimal;

public class Exercise_10_21 {

	public Exercise_10_21() {
		// 
	}

	public static void main(String[] args) {
		BigDecimal bigDecimal = BigDecimal.valueOf(Long.MAX_VALUE);

		int count = 0;
		while (count < 10) {
			bigDecimal = bigDecimal.add(BigDecimal.ONE);
			if (bigDecimal.remainder(BigDecimal.valueOf(6)).equals(BigDecimal.ZERO)
					|| bigDecimal.remainder(BigDecimal.valueOf(5)).equals(BigDecimal.ZERO)) {
				System.out.println(bigDecimal);
				count++;

			}

		}
	}
}
