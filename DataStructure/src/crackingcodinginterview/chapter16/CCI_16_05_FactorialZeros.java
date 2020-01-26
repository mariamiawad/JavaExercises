package crackingcodinginterview.chapter16;

public class CCI_16_05_FactorialZeros {
	
	public int factorialZeros(int x) {
		// TODO - Implement this method
		return 0;
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
