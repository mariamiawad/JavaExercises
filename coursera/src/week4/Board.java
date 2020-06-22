package week4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import edu.princeton.cs.algs4.StdOut;

public final class Board {

//	private final int[] board;
	private final int size;
//	private final int[] goalDown;
	private final int[][] integers;

	// create a board from an n-by-n array of tiles,
	// where tiles[row][col] = tile at (row, col)
	public Board(int[][] tiles) {
//		board = new int[tiles.length * tiles[0].length];
		integers = new int[tiles.length][tiles[0].length];
		size = tiles.length;
//		goalDown = new int[board.length];
		for (int i = 0; i < tiles.length; i++) {
			for (int j = 0; j < tiles.length; j++) {
				integers[i][j] = tiles[i][j];
//				board[k] = tiles[i][j];
		

			}

		}

//		integers = Arrays.copyOf(tiles, tiles.length);
//		for (int i = 0; i < goalDown.length; i++) {
//			goalDown[i] = i + 1;
//			if (i == goalDown.length - 1) {
//				goalDown[i] = 0;
//			}
//		}
	}

	// board dimension n

	private int manhattanDistance(int i, int j, int square) {
		square--;
		int horizontal = Math.abs(square % dimension() - j);
		int vertical = Math.abs(square / dimension() - i);
		return horizontal + vertical;
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
		return Arrays.deepEquals(integers, boards.integers);
	}

	// all neighboring boards
	public Iterable<Board> neighbors() {
		Stack<Board> boardStack = new Stack<>();
		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers.length; j++) {
				// we have found 0 block
				if (integers[i][j] == 0) {

					// if 0 block is not at top position
					if (i > 0) {
						boardStack.push(new Board(swap(i, j, i - 1, j)));
					}

					// if 0 block is not at left position
					if (j > 0) {
						boardStack.push(new Board(swap(i, j, i, j - 1)));
					}

					// if 0 block is not at bottom position
					if (i < size - 1) {
						boardStack.push(new Board(swap(i, j, i + 1, j)));
					}

					// if 0 block is not at right position
					if (j < size - 1) {
						boardStack.push(new Board(swap(i, j, i, j + 1)));
					}

					break;
				}
			}
		}

		return boardStack;
	}

//	private int[][] copyBlocks() {
//		int[][] copy = /* integers.toArray(new int[integers.size()][]); */
//				new int[integers.length][integers.length];
//		for (int i = 0; i < copy.length; i++) {
//			for (int j = 0; j < copy.length; j++) {
//				copy[i][j] = integers[i][j];
//			}
//		}
////		return copy;
//
//		return copy;
//	}

	// a board that is obtained by exchanging any pair of tiles

	private int[][] swap(int i1, int j1, int i2, int j2) {
		int[][] copy = new int[integers.length][integers.length];
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy.length; j++) {
				copy[i][j] = integers[i][j];
			}
		}
		int temp = copy[i1][j1];
		copy[i1][j1] = copy[i2][j2];
		copy[i2][j2] = temp;
		return copy;
	}

//	private int[][] copy() {
//		int[][] copy = integers.clone();
//		for (int i = 0; i < blocks.size(); i++) {
//			List<Integer> list = lists.get(i);
//			for (int j = 0; j < list.size(); j++) {
//				copy[i][j] = list.get(j);
//			}
//		}
//		return copy;
//	}

	public Board twin() {
//		List<List<Integer>> list = Arrays.stream(integers).map(row -> {
//	        return Arrays.asList((row != null) ? row : new Integer[0]);}).collect(Collectors.toList());
//		int [][] twinTiles =list.stream().map(  u  ->  u.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);
		if (integers[0][0] != 0 && integers[0][1] != 0)
			return new Board(swap(0, 0, 0, 1));
		else
			return new Board(swap(1, 0, 1, 1));
	}

	public String toString() {
		String string = size + "\n";
		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers.length; j++) {
				string += integers[i][j] + "  ";
			}
			string += "\n";
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
//		if (Arrays.equals(board, goalDown)) {
//			return 0;
//		}
		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers[i].length; j++) {
				if (integers[i][j] != k) {
					sum++;
				}
				if (integers[i][j] == 0) {
					sum--;
				}
				k++;
			}
		}

		return sum;
	}

	// sum of Manhattan distances between tiles and goal
	public int manhattan() {
		int manhattan = 0;

		for (int i = 0; i < integers.length; i++) {

			for (int j = 0; j < integers.length; j++)
				if (integers[i][j] != 0 && integers[i][j] != j + i * dimension() + 1)
					manhattan += manhattanDistance(i, j, integers[i][j]);
		}
		return manhattan;

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
		Solver solver = new Solver(b);

		// print solution to standard output
		if (!solver.isSolvable())
			StdOut.println("No solution possible");
		else {
			StdOut.println("Minimum number of moves = " + solver.moves());
			for (Board board : solver.solution())
				StdOut.println(board);
//		}
		}

	}

//
////	private final int[] board;
//	private final int size;
////	private final int[] goalDown;
////	private Integer[][] integers;
//	List<int[]> integers;
//	// create a board from an n-by-n array of tiles,
//	// where tiles[row][col] = tile at (row, col)
//	public Board(int[][] tiles) {
////		this.size = 0;
//		// board = new int[tiles.length * tiles[0].length];
////		integers = new Integer[tiles.length][tiles[0].length];
//		size = tiles.length;
////		goalDown = new int[board.length];
////		for (int i = 0; i < tiles.length; i++) {
////			for (int j = 0; j < tiles.length; j++) {
////				integers[i][j] = tiles[i][j];
////				if (integers[i][j].equals(Integer.valueOf(0))) {
////					zeroI = i;
////					zeroJ = j;
////				}
//////				board[k] = tiles[i][j];
////
////			}
////
////		}
//		integers = Collections.unmodifiableList(Arrays.asList(tiles));
////		for (int i = 0; i < goalDown.length; i++) {
////			goalDown[i] = i + 1;
////			if (i == goalDown.length - 1) {
////				goalDown[i] = 0;
////			}
////		}
//	}
//	// board dimension n
//
//	private int manhattanDistance(int i, int j, int square) {
//		square--;
//		int horizontal = Math.abs(square % dimension() - j);
//		int vertical = Math.abs(square / dimension() - i);
//		return horizontal + vertical;
//	}
//
//	// is this board the goal board?
//	public boolean isGoal() {
//		return hamming() == 0;
//	}
//
//	// does this board equal y?
//	public boolean equals(Object y) {
//		if (y == null) {
//			return false;
//		}
//		if (!(y instanceof Board)) {
//			return false;
//		}
//
//		Board boards = (Board) y;
//		if ( integers.size() != boards.integers.size() || integers.get(0).length != boards.integers.get(0).length) {
//			return false;
//		}
//		return integers.equals(boards.integers);
////		for (int i = 0; i < integers.length; i++) {
////			for (int j = 0; j < integers[i].length; j++) {
////				if (!integers[i][j].equals(boards.integers[i][j])) {
////					return false;
////				}
////			}
////		}
////		return true;
//	}
//
//	// all neighboring boards
//	public Iterable<Board> neighbors() {
//		Stack<Board> boardStack = new Stack<>();
//		for (int i = 0; i < integers.get(0).length; i++) {
//			for (int j = 0; j < integers.get(i).length; j++) {
//				// we have found 0 block
//				if (integers.get(i)[j] == 0) {
//
//					// if 0 block is not at top position
//					if (i > 0) {
//						boardStack.push(new Board(swap(i, j, i - 1, j)));
//					}
//
//					// if 0 block is not at left position
//					if (j > 0) {
//						boardStack.push(new Board(swap(i, j, i, j - 1)));
//					}
//
//					// if 0 block is not at bottom position
//					if (i < size - 1) {
//						boardStack.push(new Board(swap(i, j, i + 1, j)));
//					}
//
//					// if 0 block is not at right position
//					if (j < size - 1) {
//						boardStack.push(new Board(swap(i, j, i, j + 1)));
//					}
//
//					break;
//				}
//			}
//		}
//
//		return boardStack;
//	}
//
//	private int[][] copyBlocks() {
//		int[][] copy = integers.toArray(new int[integers.size()][integers.size()]);
//		return copy;
//	}
//
//	// a board that is obtained by exchanging any pair of tiles
//
//	private int[][] swap(int i1, int j1, int i2, int j2) {
//		int[][] copy =copyBlocks();
//		int temp = copy[i1][j1];
//		copy[i1][j1] = copy[i2][j2];
//		copy[i2][j2] = temp;
//		return copy;
//	}
//
////	private int[][] copy() {
////		int[][] copy = integers.clone();
////		for (int i = 0; i < blocks.size(); i++) {
////			List<Integer> list = lists.get(i);
////			for (int j = 0; j < list.size(); j++) {
////				copy[i][j] = list.get(j);
////			}
////		}
////		return copy;
////	}
//
//	public Board twin() {
////		List<List<Integer>> list = Arrays.stream(integers).map(row -> {
////	        return Arrays.asList((row != null) ? row : new Integer[0]);}).collect(Collectors.toList());
////		int [][] twinTiles =list.stream().map(  u  ->  u.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);
//		if (integers.get(0)[0] != 0 && integers.get(0)[1] != 0)
//			return new Board(swap(0, 0, 0, 1));
//		else
//			return new Board(swap(1, 0, 1, 1));
//	}
//
//	public String toString() {
//		String string = size + "\n";
//		for (int i = 0; i < integers.size(); i++) {
//			for (int j = 0; j < integers.get(i).length; j++) {
//				string += integers.get(i)[j] + "  ";
//			}
//			string += "\n";
//		}
//
//		return string;
//	}
//
//	public int dimension() {
//		return size;
//
//	}
//
//	// number of tiles out of place
//	public int hamming() {
//		int sum = 0;
//		int k = 1;
////		if (Arrays.equals(board, goalDown)) {
////			return 0;
////		}
//		for (int i = 0; i < integers.size(); i++) {
//			for (int j = 0; j < integers.get(i).length; j++) {
//				int n = integers.get(i)[j];
//				if (n != k) {
//					sum++;
//				}
//				if (n == 0) {
//					sum--;
//				}
//				k++;
//			}
//		}
//
//		return sum;
//	}
//
//	// sum of Manhattan distances between tiles and goal
//	public int manhattan() {
//		int manhattan = 0;
//
//		for (int i = 0; i < integers.size(); i++) {
//
//			for (int j = 0; j < integers.get(i).length; j++)
//				if (integers.get(i)[j] != 0 && integers.get(i)[j] != j + i * dimension() + 1)
//					manhattan += manhattanDistance(i, j, integers.get(i)[j]);
//		}
//		return manhattan;
//
//	}
//
//	// unit testing (notgraded)
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int N = scanner.nextInt();
//		int[][] blocks = new int[N][N];
//		for (int i = 0; i < blocks.length; i++) {
//			for (int j = 0; j < blocks[i].length; j++) {
//				blocks[i][j] = scanner.nextInt();
//			}
//		}
////		blocks[0][0] = 2;
////		blocks[0][1] = 0;
////		blocks[1][0] = 1;
////		blocks[1][1] = 3;
////		blocks[1][1] = 0;
////		blocks[1][2] = 2;
////		blocks[2][0] = 7;
////		blocks[2][1] = 6;
////		blocks[2][2] = 5;
//
//		// for (int i = 0; i < blocks.length; ++i) {
//		// for (int j = 0; j < blocks[i].length; ++j) {
//		// blocks[i][j] = N * i + j;
//		// }
//		// }
//
//		Board b = new Board(blocks);
////		Iterable<Board> iterator = b.neighbors();
////		while (iterator.iterator().hasNext()) {
////			Board board = iterator.iterator().next();
////			System.out.println(board.toString());
////
////		}
//
//		StdOut.println(b + "\nhamming : " + b.hamming() + "\nmanhattan: " + b.manhattan());
////		for (int i = 0; i < blocks.length; i++) {
////			b.tiles [0][1] = 2;
////		}
//		StdOut.println(b.twin().toString());
//		scanner.close();
////		In in = new In(args[0]);
////		int n = in.readInt();
////		int[][] tiles = new int[n][n];
////		for (int i = 0; i < n; i++)
////			for (int j = 0; j < n; j++)
////				tiles[i][j] = in.readInt();
////		Board initial = new Board(tiles);
////
////		// solve the puzzle
//		Board board1 = new Board(blocks);
//		System.out.println(board1.equals(b));
//		Solver solver = new Solver(b);
//
//		// print solution to standard output
//		if (!solver.isSolvable())
//			StdOut.println("No solution possible");
//		else {
//			StdOut.println("Minimum number of moves = " + solver.moves());
//			for (Board board : solver.solution())
//				StdOut.println(board);
////		}
//		}
//
//	}
}
