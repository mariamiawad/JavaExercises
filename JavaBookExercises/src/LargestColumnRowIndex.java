import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LargestColumnRowIndex {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter numbers");
		int number = inputScanner.nextInt();
		List<Integer> arraListRow = new ArrayList<Integer>();
		List<Integer> arrayListColumn = new ArrayList<Integer>();
		int[][] array = new int[number][number];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = random.nextInt(2);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}
		int countRow = 0;
		int maxRow = -1;
		for (int i = 0; i < array.length; i++) {
			countRow = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] == 1) {
					countRow++;

				}

			}
			if (maxRow <= countRow) {
				maxRow = countRow;
				arraListRow = new ArrayList<Integer>();
				arraListRow.add(i);
			} else if (maxRow == countRow) {
				arraListRow.add(i);
			}

		}
		int maxColumn = -1;
		int countColumn = 0;
		for (int j = 0; j < array.length; j++) {
			countColumn = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i][j] == 1) {
					countColumn++;

				}

			}
			if (maxColumn <= countColumn) {
				maxColumn = countColumn;
				arrayListColumn = new ArrayList<Integer>();
				arrayListColumn.add(j);
			} else if (maxColumn == countColumn) {
				arrayListColumn.add(j);
			}
		}

		for (int i = 0; i < arraListRow.size(); i++) {
			System.out.println(arraListRow.get(i));
		}
		for (int i = 0; i < arrayListColumn.size(); i++) {
			System.out.println(arrayListColumn.get(i));
		}

	}

}
