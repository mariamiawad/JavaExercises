package week4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public final class Board {

	private final int[][] tiles;
	private final int[] board;
	private final int size;
	private final int[] goalDown;

	// create a board from an n-by-n array of tiles,
	// where tiles[row][col] = tile at (row, col)
	public Board(int[][] tiles) {
		board = new int[tiles.length * tiles[0].length];
		this.tiles = tiles.clone();
		size = this.tiles.length;
		goalDown = new int[board.length];
		int k = 0;
		for (int i = 0; i < this.tiles.length; i++) {
			for (int j = 0; j < this.tiles.length; j++) {
				board[k] = this.tiles[i][j];
				k++;
			}
		}

		for (int i = 0; i < goalDown.length; i++) {
			goalDown[i] = i + 1;
			if (i == goalDown.length - 1) {
				goalDown[i] = 0;
			}
		}

	}

	
	// board dimension n
	
	private Board getGoal(int size) {
		int value = 0;
		int[][] goal = new int[size][size];
		for (int i = 0; i < goal.length; i++) {
			for (int j = 0; j < goal[i].length; j++) {
				value++;
				if ((j + 1 == size) && (i + 1 == size)) {
					goal[i][j] = 0;
				} else {
					goal[i][j] = value;
				}

			}

		}
		return new Board(goal);
	}

	private int getCol(int value, int[][] tiles) {

		for (int i = 0; i < tiles.length; i++) {
			for (int j = 0; j < tiles.length; j++) {
				if (tiles[i][j] == value) {
					return j;
				}
			}

		}
		return -1;
	}

	private int getRow(int value, int[][] tiles) {
		for (int i = 0; i < tiles.length; i++) {
			for (int j = 0; j < tiles.length; j++) {
				if (tiles[i][j] == value) {
					return i;
				}
			}

		}
		return -1;

	}

	// is this board the goal board?
	public boolean isGoal() {
		return hamming() == 0;
	}

	// does this board equal y?
	public boolean equals(Object y) {
		if (y == null) {
			return false;
		}
		if (!(y instanceof Board)) {
			return false;
		}
		Board boards = (Board) y;
		return Arrays.equals(boards.board, board);
	}

	// all neighboring boards
	public Iterable<Board> neighbors() {
		Stack<Board> boardStack = new Stack<>();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				// we have found 0 block
				if (tiles[i][j] == 0) {

					// if 0 block is not at top position
					if (i > 0) {
						int[][] blocksCopy = copyBlocks(tiles, size);
						blocksCopy[i][j] = tiles[i - 1][j];
						blocksCopy[i - 1][j] = tiles[i][j];
						boardStack.push(new Board(blocksCopy));
					}

					// if 0 block is not at left position
					if (j > 0) {
						int[][] blocksCopy = copyBlocks(tiles, size);
						blocksCopy[i][j] = tiles[i][j - 1];
						blocksCopy[i][j - 1] = tiles[i][j];
						boardStack.push(new Board(blocksCopy));
					}

					// if 0 block is not at bottom position
					if (i < size - 1) {
						int[][] blocksCopy = copyBlocks(tiles, size);
						blocksCopy[i][j] = tiles[i + 1][j];
						blocksCopy[i + 1][j] = tiles[i][j];
						boardStack.push(new Board(blocksCopy));
					}

					// if 0 block is not at right position
					if (j < size - 1) {
						int[][] blocksCopy = copyBlocks(tiles, size);
						blocksCopy[i][j] = tiles[i][j + 1];
						blocksCopy[i][j + 1] = tiles[i][j];
						boardStack.push(new Board(blocksCopy));
					}

					break;
				}
			}
		}

		return boardStack;
	}
	
	private int[][] copyBlocks(int[][] blocks, int dimensionSize) {
		int[][] result = new int[dimensionSize][dimensionSize];

		for (int i = 0; i < dimensionSize; i++) {
			for (int j = 0; j < dimensionSize; j++) {
				result[i][j] = blocks[i][j];
			}
		}

		return result;
	}

	// a board that is obtained by exchanging any pair of tiles
	
	private int[][] swap(int i1, int j1, int i2, int j2) {
		int[][] copy = copy(tiles);
		int temp = copy[i1][j1];
		copy[i1][j1] = copy[i2][j2];
		copy[i2][j2] = temp;
		return copy;
	}

	private int[][] copy(int[][] blocks) {
		int[][] copy = new int[blocks.length][blocks.length];
		for (int i = 0; i < blocks.length; i++) {
			for (int j = 0; j < blocks.length; j++) {
				copy[i][j] = blocks[i][j];
			}
		}
		return copy;
	}
	public Board twin() {
		int[][] twinTiles = copy(this.tiles);

		if (twinTiles[0][0] != 0 && twinTiles[0][1] != 0)
			return new Board(swap(0, 0, 0, 1));
		else
			return new Board(swap(1, 0, 1, 1));
	}

	public String toString() {
		String string = size + "\n";
		int k = 0;
		for (int i = 0; i < board.length; i++) {
			string += board[i] + "  ";

			k++;
			if (k % size == 0 && k != 0) {
				k = 0;
				string += "\n";
			}

		}

		return string;
	}
	public int dimension() {
		return size;

	}

	// number of tiles out of place
	public int hamming() {
		int sum = 0;
		int k = 1;
		if (Arrays.equals(board, goalDown)) {
			return 0;
		}
		for (int j = 0; j < board.length; j++) {
			if (board[j] != k) {
				sum += 1;

			}
			if (board[j] == 0) {
				sum--;
			}
			k++;

		}
		return sum;
	}

	// sum of Manhattan distances between tiles and goal
	public int manhattan() {
		int count = 0;
		int expected = 0;
		int[][] thisTiles = this.tiles;
		for (int row = 0; row < thisTiles.length; row++) {

			for (int col = 0; col < thisTiles[row].length; col++) {

				int value = thisTiles[row][col];
				expected++;

				if (value != 0 && value != expected) {
					// Manhattan distance is the sum of the absolute values of
					// the horizontal and the vertical distance
					Board tempBoard = getGoal(size);
					count += Math.abs(row - getRow(value, tempBoard.tiles))
							+ Math.abs(col - getCol(value, tempBoard.tiles));
				}
			}
		}
		return count;

	}


	// unit testing (notgraded)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[][] blocks = new int[N][N];
		for (int i = 0; i < blocks.length; i++) {
			for (int j = 0; j < blocks[i].length; j++) {
				blocks[i][j] = scanner.nextInt();
			}
		}
//		blocks[0][0] = 2;
//		blocks[0][1] = 0;
//		blocks[1][0] = 1;
//		blocks[1][1] = 3;
//		blocks[1][1] = 0;
//		blocks[1][2] = 2;
//		blocks[2][0] = 7;
//		blocks[2][1] = 6;
//		blocks[2][2] = 5;

		// for (int i = 0; i < blocks.length; ++i) {
		// for (int j = 0; j < blocks[i].length; ++j) {
		// blocks[i][j] = N * i + j;
		// }
		// }

		Board b = new Board(blocks);
//		Iterable<Board> iterator = b.neighbors();
//		while (iterator.iterator().hasNext()) {
//			Board board = iterator.iterator().next();
//			System.out.println(board.toString());
//
//		}
		
		StdOut.println(b + "\nhamming : " + b.hamming() + "\nmanhattan: " + b.manhattan());
//		for (int i = 0; i < blocks.length; i++) {
//			b.tiles [0][1] = 2;
//		}
		StdOut.println(b.twin().toString());
		scanner.close();
//		In in = new In(args[0]);
//		int n = in.readInt();
//		int[][] tiles = new int[n][n];
//		for (int i = 0; i < n; i++)
//			for (int j = 0; j < n; j++)
//				tiles[i][j] = in.readInt();
//		Board initial = new Board(tiles);
//
//		// solve the puzzle
//		Solver solver = new Solver(initial);
//
//		// print solution to standard output
//		if (!solver.isSolvable())
//			StdOut.println("No solution possible");
//		else {
//			StdOut.println("Minimum number of moves = " + solver.moves());
//			for (Board board : solver.solution())
//				StdOut.println(board);
//		}
	}

}
