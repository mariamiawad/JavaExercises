
public class ComputePI {

	public ComputePI() {
		// 
	}
public static void main(String[] args) {
	double pi = 0;
	for (int i = 10000; i <= 100000; i= i +10000) {
		pi =summation(i); 
		System.out.println(i  + " " +pi);
	}
}
public static double summation(int n) {
	double pi = 0;
	for (int i = 1; i <= n; i++) {
		pi += (Math.pow(-1, i + 1)) / ((2.0 * i) - 1);
	}
	return pi * 4.0;
}
}
