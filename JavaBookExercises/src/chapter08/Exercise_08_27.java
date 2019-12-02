package chapter08;
import java.util.Scanner;

public class Exercise_08_27 {

	public Exercise_08_27() {
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row:");
		double [][] m = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m [i][j] = inputScanner.nextDouble();
			}
		}
		sortColumns(m);
		System.out.println("The column-sorted array is");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static double[][] sortColumns(double[][] m){
		double [][] n = new double [m.length][m.length];
		double temp = 0;
		for (int column = 0; column < m.length; column++) {
			for (int row = 0; row < m[column].length-1; row++) {
				if (m[row][column]>m[row+1][column]) {
					temp = m[row][column];
					m[row][column]= m[row+1][column];
					m[row+1][column] = temp;
				}
			}
		}
		return n;
	}
}
