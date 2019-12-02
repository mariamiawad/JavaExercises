package chapter08;
import java.util.Scanner;

public class Exercise_08_26 {

	public Exercise_08_26() {
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		double[][] m = new double[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = inputScanner.nextDouble();
			}
		}
		sortRows(m);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortRows(double[][] m) {
		double min = Double.MAX_VALUE;
		double temp = 0;
		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length - 1; j++) {
				if (m[i][j] > m[i][j + 1]) {

					temp = m[i][j];
					m[i][j] = m[i][j + 1];
					m[i][j + 1] = temp;

				}
			}
		}
		return m;
	}

}
