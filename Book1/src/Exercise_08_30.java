import java.util.Scanner;

public class Exercise_08_30 {

	public Exercise_08_30() {
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		double[][] a = new double[2][2];
		System.out.println("Enter a00, a01, a10, a11");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = inputScanner.nextDouble();
			}
		}
		double[] b = new double[2];
		System.out.println("Enter b0, b1");
		for (int i = 0; i < b.length; i++) {
			b[i] = inputScanner.nextDouble();
		}
		double[] result = linearEquation(a, b);
		if (result == null) {
			System.out.println("The equation has no solution");
		} else {
			System.out.println("x = " + result[0] + " and y =" + result[1]);
		}
	}

	public static double[] linearEquation(double[][] a, double[] b) {
		double a00 = a[0][0];
		double a01 = a[0][1];
		double a10 = a[1][0];
		double a11 = a[1][1];
		double b0 = b[0];
		double b1 = b[1];
		double x = 0;
		double y = 0;
		double[] result = new double[2];
		if (a00 * a11 - a01 * a10 == 0) {
			return null;
		}
		x = (b0 * a11 - b1 * a01) / (a00 * a11 - a01 * a10);
		y = (b1 * a00 - b0 * a10) / (a00 * a11 - a01 * a10);
		result[0] = x;
		result[1] = y;
		return result;
	}
}
