import java.util.Scanner;

public class MultiplyTwoMatrices {

	public static void getMultiplyedMatrex(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%.1f ", a[i][j]);
			}
			if(i==1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			System.out.print("  ");
			for (int j = 0; j < b.length; j++) {
				
				System.out.printf("%.1f ", b[i][j]);
			}
			if(i==1) {
				System.out.print("= ");
			}
			else {
				System.out.print("  ");
			}
			
			for (int j = 0; j < c.length; j++) {

				System.out.printf("%.1f ", c[i][j]);
			}

			System.out.println();
		}
		System.out.print("  ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] a = new double[3][3];
		System.out.println("Enter first 3X3 matrex");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = input.nextDouble();
			}

		}
		System.out.println("Enter second 3X3 matrex");
		double[][] b = new double[3][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = input.nextDouble();
			}
		}
		getMultiplyedMatrex(a, b);
		input.close();
	}
}
