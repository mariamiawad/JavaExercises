package chapter08;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08_29 {

	public Exercise_08_29() {

	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter list1:");
		int[][] m1 = new int[3][3];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = inputScanner.nextInt();
			}
		}
		System.out.println("Enter list2:");

		int[][] m2 = new int[3][3];
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m2[i][j] = inputScanner.nextInt();
			}
		}

		if (equals(m1, m2)) {
			System.out.println("The two arrays are identical");
		} else {
			System.out.println("The two arrays are not identical");
		}
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		sortArray(m1);
		sortArray(m2);
		if (m1.length != m2.length) {
			return false;
		}
		if (m1[0].length != m2[0].length) {
			return false;
		}
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void sortArray(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i].length - j - 1; k++) {
					if (m[i][k] > m[i][k + 1]) {
						int t = m[i][k];
						m[i][k] = m[i][k + 1];
						m[i][k + 1] = t;
					}
				}
			}

		}
	}
}
