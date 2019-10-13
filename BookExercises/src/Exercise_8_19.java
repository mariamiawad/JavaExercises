import java.util.Scanner;

public class Exercise_8_19 {

	public Exercise_8_19() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int row = inputScanner.nextInt();
		int column = inputScanner.nextInt();
		int[][] number = new int[row][column];
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[0].length; j++) {
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
		int i = 0;
		while (i < number.length) {
			int count = 0;
			int count2 = 0;

			for (int row = 0; row < number.length - 1; row++) {
				int x = 0;
				int j = 0;
				for (int column = 0; column < number.length - 1; column++) {
					if (number[j][column] == number[j + 1][column + 1]) {
						count++;

					} else if (number[x][column] == number[x + 1][column + 1]) {
						count2++;
					} else {
						count = 0;
						count2 = 0;
					}
					j++;
					x++;
				}
				if (count == 4 || count2 == 4) {
					return true;
				}
				if (j >= number.length || x >= number.length) {
					break;
				}

			}

			i++;
		}
//		int column = 0;
//		int row = 0;
//		int count = 0;
//		for (int i = 0; i < number.length; i++) {
//			row = i;
//			column = 0;
//			while (column < number.length - 1 && row < number.length - 1) {
//				if (number[row][column] == number[row + 1][column + 1]) {
//					row++;
//					column++;
//					count++;
//					continue;
//				} else {
//					column++;
//				}
//			}
//			if (count >= 4) {
//				return true;
//			}
//		}
//		column = 0;
//		row = 0;
//		count = 0;
//		for (int i =0; i <number.length; i++) {
//			row = 0;
//			column = number[0].length-1-i;
//			while (column > 0 && row < number.length - 1) {
//				if (number[row][column] == number[row + 1][column -1]) {
//					row++;
//					column--;
//					count++;
//					continue;
//				} else {
//					column--;
//				}
//			}
//			if (count >= 4) {
//				return true;
//			}
//		}
//		
		return false;
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
