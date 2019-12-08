import java.util.Scanner;

public class EstimatePie {

	public EstimatePie() {
		// 
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 901; i = i + 100) {
			System.out.println(i + "   " + summation(i));
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
