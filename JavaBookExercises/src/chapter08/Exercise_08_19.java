package chapter08;
import java.util.Scanner;


public class Exercise_08_19 {

	public Exercise_08_19() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int row = inputScanner.nextInt();
		int column = inputScanner.nextInt();
		int[][] number = new int[row][column];
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				number[i][j] = inputScanner.nextInt();
			}
		}
		if (isColumn(number) || isDiagonal(number) || isRow(number)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static boolean isDiagonal(int[][] number) {
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				if ((isEqual(i, j, number, number[i][j]) && isEqual(i + 1, j + 1, number, number[i][j])
						&& isEqual(i + 2, j + 2, number, number[i][j]) && isEqual(i + 3, j + 3, number, number[i][j]))
						|| (isEqual(i, j, number, number[i][j]) && isEqual(i - 1, j - 1, number, number[i][j])
								&& isEqual(i - 2, j - 2, number, number[i][j])
								&& isEqual(i - 3, j - 3, number, number[i][j]))
						|| (isEqual(i, j, number, number[i][j]) && isEqual(i + 1, j - 1, number, number[i][j])
								&& isEqual(i + 2, j - 2, number, number[i][j])
								&& isEqual(i + 3, j - 3, number, number[i][j]))
						|| (isEqual(i, j, number, number[i][j]) && isEqual(i - 1, j + 1, number, number[i][j])
								&& isEqual(i - 2, j + 2, number, number[i][j])
								&& isEqual(i - 3, j + 3, number, number[i][j]))) {
					return true;

				}
			}
		}
		return false;
	}

	private static boolean isEqual(int i, int j, int[][] number, int value) {
		if (isInBound(i, j, number.length)) {
			if (value == number[i][j]) {
				return true;
			}
		}
		return false;
	}

	private static boolean isInBound(int i, int j, int length) {
		return i >= 0 && i < length && j >= 0 && j < length;
	}

	public static boolean isColumn(int[][] number) {
		int count = 0;
		for (int column = 0; column < number[0].length; column++) {
			for (int row = 1; row < number.length; row++) {
				if (number[row - 1][column] == number[row][column]) {
					count++;
					if (count == 3) {
						return true;
					}
				} else {
					count = 0;
				}
			}

		}

		return false;
	}

	public static boolean isRow(int[][] number) {
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = 1; j < number.length; j++) {
				if (number[i][j - 1] == number[i][j]) {
					count++;
					if (count == 3) {
						return true;
					}
				} else {
					count = 0;
				}
			}

		}

		return false;
	}
}
