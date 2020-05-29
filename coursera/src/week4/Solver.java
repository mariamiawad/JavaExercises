package week4;

/**
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author maria
 *
 */

public final class Solver {
	private boolean isSolvable;
	private Stack<Board> solutionBoards;
	private Stack<Board> reversedBoards;

	private class SearchNode implements Comparable<SearchNode> {
		private final Board board;
		private final SearchNode prevNode;
		private int moves;
		private int manhattan;

		public SearchNode(Board board, SearchNode prevNode) {
			this.board = board;
			this.prevNode = prevNode;
			this.manhattan = board.manhattan();
			if (prevNode != null)
				moves = prevNode.moves + 1;
			else
				moves = 0;
		}

		@Override
		public int compareTo(SearchNode that) {
			int priorityDiff = (this.manhattan + this.moves) - (that.manhattan + that.moves);
			return priorityDiff == 0 ? this.manhattan - that.manhattan : priorityDiff;
		}
	}

	/**
	 * @param initial
	 */

	public Solver(Board initial) {
		if (initial == null)
			throw new IllegalArgumentException();
		isSolvable = false;
		solutionBoards = new Stack<>();
		reversedBoards = new Stack<>();
		MinPQ<SearchNode> searchNodes = new MinPQ<>();
		searchNodes.insert(new SearchNode(initial, null));
		searchNodes.insert(new SearchNode(initial.twin(), null));

		while (!searchNodes.min().board.isGoal()) {
			SearchNode searchNode = searchNodes.delMin();
			for (Board board : searchNode.board.neighbors())
				if (searchNode.prevNode == null
						|| searchNode.prevNode != null && !searchNode.prevNode.board.equals(board))
					searchNodes.insert(new SearchNode(board, searchNode));
		}

		SearchNode current = searchNodes.min();
		while (current.prevNode != null) {
			solutionBoards.push(current.board);
			current = current.prevNode;
		}
		solutionBoards.push(current.board);
		if (current.board.equals(initial)) {
			isSolvable = true;

		}

	}

	public boolean isSolvable() {
		return isSolvable;
	}

	// min number of moves to solve initial board
	public int moves() {
		if (!isSolvable())
			return -1;
		if (!solutionBoards.isEmpty()) {
			return solutionBoards.size()-1;
		}
		return reversedBoards.size()-1;

	}

	// sequence of boards in a shortest solution
	public Iterable<Board> solution() {
		if (isSolvable()) {
//			MinPQ<Board> minPQ = new MinPQ<>();
//			for (int i = 0; i < solutionBoards.size(); i++) {
//				minPQ.insert(solutionBoards.pop());
//			}
			int size = solutionBoards.size();
			for (int i = 0; i < size; i++) {
				reversedBoards.push(solutionBoards.pop());
			}
			return reversedBoards;
		}

		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] tiles = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				tiles[i][j] = in.nextInt();
		Board initial = new Board(tiles);

		// solve the puzzle
		Solver solver = new Solver(initial);

		// print solution to standard output
		if (!solver.isSolvable())
			StdOut.println("No solution possible");
		else {
			System.out.println(solver.isSolvable());
			System.out.println(solver.moves());
			System.out.println(solver.moves());
			System.out.println(solver.moves());
			System.out.println(solver.solution());
			System.out.println(solver.solution());
			System.out.println(solver.isSolvable());
			System.out.println(solver.moves());

//			StdOut.println("Minimum number of moves = " + solver.moves());
//			for (Board board : solver.solution())
//				StdOut.println(board);
		}
	}

}
