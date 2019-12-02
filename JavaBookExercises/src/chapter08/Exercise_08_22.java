package chapter08;
import java.util.Random;

public class Exercise_08_22 {

	public Exercise_08_22() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[][] array = new int[6][6];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = random.nextInt(2);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		if(checkEvenColumn(array)&&checkEvenRow(array)) {
			System.out.println("Every Column and Rows has an even number of 1's");
		}
	}

	public static boolean checkEvenRow(int[][] array) {
		int count = -1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == 1) {
					count++;
				}
			}
		}
		if (count % 2 == 0) {
			return true;
		}
		return false;

	}

	public static boolean checkEvenColumn(int[][] array) {
		int count = -1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[j][i] == 1) {
					count++;
				}
			}
		}
		if (count % 2 == 0) {
			return true;
		}
		return false;

	}

}
