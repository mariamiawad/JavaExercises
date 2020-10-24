package week1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

	private final WeightedQuickUnionUF percolation;
	private final WeightedQuickUnionUF fullness;
	private final int gridLength;
	private final int virtualTopIndex;
	private final int virtualBottomIndex;
	private boolean[] isOpen;
	private int numberOfSites;

//	// create N-by-N grid, with all sites blocked

	public Percolation(int n) {
		if (n < 1) {
			percolation = null;
			fullness = null;
			throw new IllegalArgumentException();
		}
		gridLength = n;
		int arraySize = n * n + 2;
		isOpen = new boolean[n * n + 2];
		virtualTopIndex = 0;
		virtualBottomIndex = n * n + 1;

		isOpen[virtualTopIndex] = true;
		isOpen[virtualBottomIndex] = true;
		percolation = new WeightedQuickUnionUF(arraySize);
		fullness = new WeightedQuickUnionUF(n * n + 1);
//			for (int j = 0; j < isOpen.length; j++) {
//				isOpen[0][j] = true;
//			}
//		
	}

//	private boolean checkFull(int i, int j) {
//		checkBounds(i, j);
//		int siteIndex = siteIndex(i, j);
//		if (gridLength == 1) {
//			return true;
//		}
//		int n = i - 1;
//		int m = j - 1;
//		if (isOpen[i - 1][j - 1] && gridLength > 1) {
//
//			if (j > 1 && j < gridLength && i > 1 && j > 1 && i < gridLength && isOpen(i, j - 1) && isOpen(i - 1, j)
//					&& isOpen(i + 1, j) && isOpen(i, j + 1)) {
//				isFull[n][m - 1] = true;
//				isFull[n - 1][m] = true;
//				isFull[n + 1][m] = true;
//				isFull[n][m + 1] = true;
//				isFull[n][m] = true;
//				return true;
//			}
//
//			else if (i == 1 && j < gridLength && j > 1 && isOpen(i, j - 1) && isOpen(i, j + 1) && isOpen(i + 1, j)) {
//				isFull[n][m - 1] = true;
//				isFull[n ][m+1] = true;
//				isFull[n + 1][m] = true;
//				isFull[n][m] = true;
//				
//				
//				return true;
//			}
//
//			else if (i > 1 && j == 1 && i < gridLength && isOpen(i - 1, j) && isOpen(i + 1, j) && isOpen(i, j + 1)) {
//				isFull[n-1][m] = true;
//				isFull[n+1 ][m] = true;
//				isFull[n ][m+1] = true;
//				isFull[n][m] = true;
//				return true;
//			}
//
//			else if (i == 1 && j == 1 && isOpen(i, j + 1) && isOpen(i + 1, j)) {
//				isFull[n][m+1] = true;
//				isFull[n+1 ][m] = true;
//				isFull[n][m] = true;
//				
//				return true;
//			}
//
//			else if (i == gridLength && j == 1 && isOpen(i - 1, j) && isOpen(i, j + 1)) {
//				isFull[n-1][m] = true;
//				isFull[n ][m+1] = true;
//				isFull[n][m] = true;
//				return true;
//			}
//
//			else if (i == 1 && j == gridLength && isOpen(i + 1, j) && isOpen(i, j - 1)) {
//				isFull[n+1][m] = true;
//				isFull[n ][m-1] = true;
//				isFull[n][m] = true;
//				return true;
//			}
////
////			else if (i > 1 && j == gridLength && i < gridLength && isOpen(i - 1, j) && isOpen(i , j-1)
////					&& isOpen(i, j - 1)) {
////				isFull[n-1][m] = true;
////				isFull[n ][m+1] = true;
////				isFull[n][m-1] = true;
////				isFull[n][m] = true;
////				return true;
////			}
////			
//			
//			else if (i == gridLength && j >1 && j<gridLength && isOpen(i - 1, j) && isOpen(i, j-1)
//					&& isOpen(i, j+ 1)) {
//				isFull[n-1][m] = true;
//				isFull[n ][m-1] = true;
//				isFull[n ][m+1] = true;
//				isFull[n][m] = true;
//				return true;
//			}
//
//			else if (i == gridLength && j == gridLength && isOpen(i - 1, j) && isOpen(i, j - 1)) {
//				isFull[n-1][m] = true;
//				isFull[n ][m-1] = true;
//				isFull[n][m] = true;
//				return true;
//			}
//		}
//		return false;
//	}

	private int siteIndex(int i, int j) {
//		checkBounds(i, j);
		int x = j;
		int y = i;
		return (y - 1) * gridLength + (x);
	}

	private void checkBounds(int i, int j) {
		if (i > gridLength || i < 1) {
			throw new IllegalArgumentException();
		}
		if (j > gridLength || j < 1) {
			throw new IllegalArgumentException();
		}
	}

	public int numberOfOpenSites() {
		return numberOfSites;
	}

	public boolean isOpen(int i, int j) {
		if (i < 1 || i > gridLength || j < 1 || j > gridLength) {
			throw new IllegalArgumentException();
		}

		int siteIndex = siteIndex(i, j);
		return isOpen[siteIndex];
	}

//
//// is site (row i, column j) full?
	public boolean isFull(int i, int j) {
		if (i < 1 || i > gridLength || j < 1 || j > gridLength) {
			throw new IllegalArgumentException();
		}
		int siteIndex = siteIndex(i, j);
		return fullness.find(virtualTopIndex)== fullness.find(siteIndex) && isOpen[siteIndex];
	}

//// does the system percolate?
	public boolean percolates() {
		if (gridLength==1 && isOpen[siteIndex(1,1)] ) {
			return true;
		}
		return percolation.find(0)== percolation.find(virtualBottomIndex);

	}

	public void open(int i, int j) {
		if (i < 1 || i > gridLength || j < 1 || j > gridLength) {
			throw new IllegalArgumentException();
		}
		if (isOpen(i, j)) {
			return;
		}
		int siteIndex = siteIndex(i, j);
		if (gridLength == 1) {
			isOpen[siteIndex] = true;
			numberOfSites++;
			percolation.union(virtualTopIndex, virtualBottomIndex);
			fullness.union(virtualTopIndex, siteIndex);
			return;
		}

		if (!isOpen[siteIndex] && gridLength > 1) {
			isOpen[siteIndex] = true;
			numberOfSites++;
			if (j > 1 && isOpen(i, j - 1)) {
				int indexToLeft = siteIndex(i, j - 1);
				percolation.union(siteIndex, indexToLeft);
				fullness.union(siteIndex, indexToLeft);

			}

			if (j < gridLength && isOpen(i, j + 1)) {
				int indexToRight = siteIndex(i, j + 1);
				percolation.union(siteIndex, indexToRight);
				fullness.union(siteIndex, indexToRight);

			}

			if (i > 1 && isOpen(i - 1, j)) {
				int indexToTop = siteIndex(i - 1, j);
				percolation.union(siteIndex, indexToTop);
				fullness.union(siteIndex, indexToTop);

			}

			if (i < gridLength && isOpen(i + 1, j)) {
				int indexToBottom = siteIndex(i + 1, j);
				percolation.union(siteIndex, indexToBottom);
				fullness.union(siteIndex, indexToBottom);

			}

			if (i == 1) {
				percolation.union(0, siteIndex);
				fullness.union(0, siteIndex);
			}
			if (i == gridLength) {
				percolation.union(isOpen.length - 1, siteIndex);
			}
		}

	}

	public static void main(String[] args) {
		In in = new In("file:///C:/Users/maria/eclipse-workspace/coursera/input/week1/input6.txt");
		int n = in.readInt();
		Percolation percolation = new Percolation(n);
		boolean isPercolated = false;
		int count = 0;
		while (!in.isEmpty()) {
			int row = in.readInt() + 1;
			int col = in.readInt() + 1;
			if (!percolation.isOpen(row, col)) {
				count++;
			}
			percolation.open(row, col);
			StdOut.println(percolation.isFull(row, col));
			StdOut.println(percolation.isOpen(row, col));
			isPercolated = percolation.percolates();
			if (isPercolated) {
				break;
			}
		}
		StdOut.println(count + " open sites");
		if (isPercolated) {
			StdOut.println("percolates");
		} else {
			StdOut.println("does not percolate");
		}
	}
}
