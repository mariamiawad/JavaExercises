package chapter08;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise_08_24 {

	public static void main(String[] args) {
		// Read a Sudoku solution
		int[][] grid = readASolution();
//		
		System.out.println( isSmallBoxValid(grid) &&isValid(grid) ? "Valid solution" : "Invalid solution");
	}

	/** Read a Sudoku solution from the console */
	public static int[][] readASolution() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Sudoku puzzle solution:");
		int[][] grid = new int[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				grid[i][j] = input.nextInt();

		return grid;
	}

	/** Check whether a solution is valid */
	public static boolean isValid(int[][] grid) {
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid) || !isValidColumn(j, grid)
						|| !isValidRow(i, grid))
					return false;
		return true; // The solution is valid
	}

	public static boolean isValidColumn(int column, int[][] grid) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < grid.length; i++) {
			set.add(grid[column][i]);
		}
		if (set.size() == 9) {
			return true;
		}
		return false;
	}

	public static boolean isValidRow(int row, int[][] grid) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < grid[row].length; i++) {
			set.add(grid[row][i]);

		}
		if (set.size() == 9) {
			return true;
		}
		return false;
	}

	public static boolean isSmallBoxValid(int[][] grid) {
		Set<Integer> set = new HashSet<Integer>();
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				set.add(grid[row][column]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				set.add(grid[column][row]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 0; row < 3; row++) {
			for (int column = 3; column < 6; column++) {
				set.add(grid[row][column]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 0; row < 3; row++) {
			for (int column = 3; column < 6; column++) {
				set.add(grid[column][row]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 0; row < 3; row++) {
			for (int column = 6; column < 9; column++) {
				set.add(grid[row][column]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 0; row < 3; row++) {
			for (int column = 6; column < 9; column++) {
				set.add(grid[column][row]);
			}
		}
		if (set.size() != 9) {
			return false;
		}

		set = new HashSet<Integer>();
		for (int row = 3; row < 6; row++) {
			for (int column = 0; column < 3; column++) {
				set.add(grid[row][column]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 3; row < 6; row++) {
			for (int column = 0; column < 3; column++) {
				set.add(grid[column][row]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 3; row < 6; row++) {
			for (int column = 3; column < 6; column++) {
				set.add(grid[row][column]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 3; row < 6; row++) {
			for (int column = 3; column < 6; column++) {
				set.add(grid[column][row]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 3; row < 6; row++) {
			for (int column = 6; column < 9; column++) {
				set.add(grid[row][column]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 3; row < 6; row++) {
			for (int column = 6; column < 9; column++) {
				set.add(grid[column][row]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 6; row < 9; row++) {
			for (int column = 0; column < 3; column++) {
				set.add(grid[row][column]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 6; row < 9; row++) {
			for (int column = 0; column < 3; column++) {
				set.add(grid[column][row]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 6; row < 9; row++) {
			for (int column = 3; column < 6; column++) {
				set.add(grid[row][column]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 6; row < 9; row++) {
			for (int column = 3; column < 6; column++) {
				set.add(grid[column][row]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 6; row < 9; row++) {
			for (int column = 6; column < 9; column++) {
				set.add(grid[row][column]);
			}
		}
		if (set.size() != 9) {
			return false;
		}
		set = new HashSet<Integer>();
		for (int row = 6; row < 9; row++) {
			for (int column = 6; column < 9; column++) {
				set.add(grid[column][row]);
			}
		}
		if (set.size() != 9) {
			return false;
		}

		return true;
	}

	/** Check whether grid[i][j] is valid in the grid */
	public static boolean isValid(int i, int j, int[][] grid) {
		int column = 0;
		int row = 0;
		for (column = 0; column < 9; column++) {
			if (column != j && grid[i][column] == grid[i][j]) {
				return false;
			}
		}
		// Check whether grid[i][j] is unique in j's column
		for (row = 0; row < 9; row++) {
			if (row != i && grid[row][j] == grid[i][j]) {
				return false;
			}
		}
		// Check whether grid[i][j] is unique in the 3-by-3 box
		for (row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
			for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
				if (row != i && col != j && grid[row][col] == grid[i][j])
					return false;

		return true; // The current value at grid[i][j] is valid
	}
}
