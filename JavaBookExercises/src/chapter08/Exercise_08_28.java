package chapter08;
import java.util.Scanner;

public class Exercise_08_28 {

	public Exercise_08_28() {
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter list1:");
		int[][] m1 = new int[3][3];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				m1[i][j] = inputScanner.nextInt();
			}
		}
		System.out.println("Enter list2:");
		int[][] m2 = new int[3][3];
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				m2[i][j] = inputScanner.nextInt();
			}
		}
		if (equals(m1, m2)) {
			System.out.println("The two arrays are strictly identical");

		} else {
			System.out.println("The two arrays are not strictly identical");
		}
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		if (m1.length != m2.length) {
			return false;
		}
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
