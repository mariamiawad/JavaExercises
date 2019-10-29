import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

public class ExploreMatrix {
	static Map<Integer, List<Integer>> rowMap = new HashMap<Integer, List<Integer>>();
	static Map<Integer, List<Integer>> columnMap = new HashMap<Integer, List<Integer>>();

	public ExploreMatrix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int length = inputScanner.nextInt();
		int[][] array = new int[length][length];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = inputScanner.nextInt();
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		if (checkDiagonalLeft(array)) {
			System.out.println("All " + array[0][0] + "s on the major diagonal");
		} else if (!checkDiagonalLeft(array)) {
			System.out.println("No same numbers on the major diagonal");
		}

		if (checkDiagonalRight(array)) {
			System.out.println("All " + array[length - 1][0] + "s on the sub-diagonal");
		} else if (!checkDiagonalRight(array)) {
			System.out.println("No same numbers on the sub-diagonal");
		}
		String rows1 = "All 1s on the row";
		String rows0 = "All 0s on the row";

		String rowString0 = "";
		String rowString1 = "";
		checkRow(array);
		if (!rowMap.isEmpty()) {

			for (Entry<Integer, List<Integer>> entry : rowMap.entrySet()) {
				if (entry.getKey().equals(0)) {
					for (int j = 0; j < entry.getValue().size(); j++) {

						rowString0 += entry.getValue().get(j) + " ";
					}

				}
				if (entry.getKey().equals(1)) {
					for (int j = 0; j < entry.getValue().size(); j++) {
						rowString1 += entry.getValue().get(j) + " ";
					}

				}
			}
			if (!rowString0.isEmpty()) {
				System.out.println(rows0 + " " + rowString0);
			}
			if (!rowString1.isEmpty()) {
				System.out.println(rows1 + " " + rowString1);
			}
		} else if (rowMap.isEmpty()) {
			System.out.println("No same numbers on a row");
		}
		String columns0 = "All 0s on the columns";
		String columns1 = "All 1s on the columns";
		String columnString0 = "";
		String columnString1 = "";
		checkColumn(array);

		if (!columnMap.isEmpty()) {

			for (Entry<Integer, List<Integer>> entry : columnMap.entrySet()) {
				if (entry.getKey().equals(0)) {
					for (int j = 0; j < entry.getValue().size(); j++) {

						columnString0 += entry.getValue().get(j) + " ";
					}
				}
				if (entry.getKey().equals(1)) {
					for (int j = 0; j < entry.getValue().size(); j++) {

						columnString1 += entry.getValue().get(j) + " ";
					}
				}
			}

			if (!columnString0.isEmpty()) {
				System.out.println(columns0 + " " + columnString0);
			}
			if (!columnString1.isEmpty()) {
				System.out.println(columns1 + " " + columnString1);
			}

		} else if (columnMap.isEmpty()) {
			System.out.println("No same numbers on a column");
		}
	}

	public static boolean checkDiagonalLeft(int[][] array) {
		boolean flag = false;
		int x = array[0][0];
		for (int i = 0; i < array.length; i++) {
			if (x == array[i][i]) {
				flag = true;
			} else if (x != array[i][i]) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static boolean checkDiagonalRight(int[][] array) {
		boolean flag = true;
		int x = array[0][array.length - 1];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i + j == array.length - 1) {
					if (x == array[i][j]) {
						flag = true;
					} else if (x != array[i][j]) {
						flag = false;
						break;
					}
				}

			}
			if (!flag) {
				break;
			}

		}
		return flag;
	}

	public static boolean checkRow(int[][] array) {
		boolean flag = false;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			int x = array[i][0];
			for (int j = 0; j < array.length; j++) {

				if (x == array[i][j]) {
					flag = true;

				} else if (x != array[i][j]) {
					flag = false;
					break;
				}

			}
			if (flag) {
				list.add(i);
				rowMap.put(x, list);
			}

		}
		return flag;
	}

	public static boolean checkColumn(int[][] array) {
		boolean flag = false;
		List<Integer> list = new ArrayList<Integer>();
		for (int j = 0; j < array.length; j++) {
			int x = array[0][j];
			for (int i = 0; i < array.length; i++) {

				if (x == array[i][j]) {
					flag = true;

				} else if (x != array[i][j]) {
					flag = false;

					break;
				}

			}
			if (flag) {
				list.add(j);
				columnMap.put(x, list);
			}

		}
		return flag;
	}

}
