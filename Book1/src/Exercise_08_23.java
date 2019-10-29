import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_08_23 {

	public Exercise_08_23() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a 6-by-6 matrix row by row:");
		int[][] numbers = new int[6][6];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = inputScanner.nextInt();
			}
		}
		getCells(numbers);
	}

	private static void getCells(int[][] numbers) {
		int count = 0;
		int[] array = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			count = 0;
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] == 1) {
					count++;
					;
				}
			}
			if (count % 2 != 0) {
				array[0] = i;

			}
		}
		int j = 0;
		for (int i = 0; i < numbers.length; i++) {
			count = 0;
			for (j = 0; j < numbers[i].length; j++) {
				if (numbers[j][i] == 1) {
					count++;
				}

			}
			if (count % 2 != 0) {
				array[1] = i;

			}
		}

		System.out.println("The flipped cell is at (" + array[0] + "," + array[1] + ")");
	}
}
