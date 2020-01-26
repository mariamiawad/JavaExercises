package crackingcodinginterview.chapter16;

import java.math.BigDecimal;

public class CCI_16_05_FactorialZeros {
	
	public int factorialZeros(int x) {
		BigDecimal n = getFactorial(x);
		String s = n+"";
		int count = 0;
		for (int i = s.length()-1; i>=0; i--) {
			if (s.charAt(i)=='0') {
				count++;
			}
			else {
				break;
			}
		}
		return count;
	}
	private BigDecimal getFactorial(int x) {
		if (x==0) {
			return BigDecimal.ONE;
		}
		return getFactorial(x-1).multiply(BigDecimal.valueOf(x));
		
	}

	public static void main(String[] args) {
		CCI_16_05_FactorialZeros cci = new CCI_16_05_FactorialZeros();
		System.out.println(cci.factorialZeros(4));	// should return 0 as factorial(4) is 24
		System.out.println(cci.factorialZeros(5));  // should return 1 as factorial(5) is 120
		System.out.println(cci.factorialZeros(15));  // should return 3 as factorial(15) is 1307674368000
		System.out.println(cci.factorialZeros(50));	// ???
		System.out.println(cci.factorialZeros(1500));	// ???????????
		

	}

}
