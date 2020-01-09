package chapter08;
import java.util.Scanner;

public class Exercise_08_25 {

	public Exercise_08_25() {

	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row:");

		double[][] m = new double[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = inputScanner.nextDouble();
			}
		}
		System.out.println(isMarkovMatrix(m) ? "It is a Markov matrix" : "It is not a Markov matrix");
	}

	public static boolean isMarkovMatrix(double[][] m) {
		if (isPositive(m)) {

			for (int row = 0; row < m.length; row++) {
				double sum = 0;
				for (int column = 0; column < m[row].length; column++) {
					sum += m[column][row];
				}
				if (sum != 1) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static boolean isPositive(double[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				if (m[row][column] < 0) {
					return false;
				}
			}
		}
		return true;
	}
}
