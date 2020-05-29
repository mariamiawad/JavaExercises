import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

	private final int gridLength;
	private boolean[] isOpen;
	private WeightedQuickUnionUF percolation;
	private WeightedQuickUnionUF fullness;
	private final int virtualTopIndex;
	private final int virtualBottomIndex;
	private int numberOfSites;
	public Percolation(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		gridLength = n;
		int arraySize = n * n + 2;
		isOpen = new boolean[arraySize];

		virtualTopIndex = 0;
		virtualBottomIndex = (n * n) + 1;

		isOpen[virtualTopIndex] = true; /// open virtual top site
		isOpen[virtualBottomIndex] = true; /// open virtual bottom site

		percolation = new WeightedQuickUnionUF(arraySize);
		fullness = new WeightedQuickUnionUF(arraySize);
		for (int j = 1; j <= n; j++) {
			/// connect all top row sites to virtual top site
			int i = 1;
			int topSiteIndex = siteIndex(i, j);
			percolation.union(virtualTopIndex, topSiteIndex);
			fullness.union(virtualTopIndex, topSiteIndex);

			/// connect all bottom row sites to virtual bottom site
			i = n;
			int bottomSiteIndex = siteIndex(i, j);
			percolation.union(virtualBottomIndex, bottomSiteIndex);

		}
	};

	/// converts between two dimensional coordinate system and site array index.
	/// throws exceptions on invalid bounds. valid indices are 1 : N^2
	/// i is the row; j is the column
	private int siteIndex(int i, int j) {
		checkBounds(i, j);
		int x = j;
		int y = i;
		return (y - 1) * gridLength + (x);
	}

	/*
	 * By convention, the indices i and j are integers between 1 and N, where (1, 1)
	 * is the upper-left site: Throw a java.lang.IndexOutOfBoundsException if either
	 * i or j is outside this range.
	 */
	private void checkBounds(int i, int j) {
		if (i > gridLength || i < 1) {
			throw new IllegalArgumentException();
		}
		if (j > gridLength || j < 1) {
			throw new IllegalArgumentException();
		}
	}

	// open site (row i, column j) if it is not already
	public void open(int i, int j) {
		if (i < 1 || i >= isOpen.length || j < 1 || j >= isOpen.length) {
			throw new IllegalArgumentException();
		}
		int siteIndex = siteIndex(i, j);
		if (!isOpen[siteIndex]) {
			/// to open a site, change boolean value, and union with any adjacent open sites
			isOpen[siteIndex] = true;
			numberOfSites++;
			// before connecting to a neighbor, first check that site is not on an edge, and
			// is open
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

			if (i > 1 && isOpen(i - 1, j)) // site is not top edge
			{
				int indexToTop = siteIndex(i - 1, j);
				percolation.union(siteIndex, indexToTop);
				fullness.union(siteIndex, indexToTop);
			}

			if (i < gridLength && isOpen(i + 1, j)) /// site is not on bottom edge
			{
				int indexToBottom = siteIndex(i + 1, j);
				percolation.union(siteIndex, indexToBottom);
				fullness.union(siteIndex, indexToBottom);
			}
		}
	};

	public int numberOfOpenSites() {
		return numberOfSites;
	}

	// is site (row i, column j) open?
	//// openness represented by boolean value in isOpen array
	public boolean isOpen(int i, int j) {
		if (i < 1 || i >= isOpen.length || j < 1 || j >= isOpen.length) {
			throw new IllegalArgumentException();
		}
		int siteIndex = siteIndex(i, j);
		return isOpen[siteIndex];
	}

	// is site (row i, column j) full?
	/// fullness represented by union with virtual top node
	public boolean isFull(int i, int j) {
		if (i < 1 || i >= isOpen.length || j < 1 || j >= isOpen.length) {
			throw new IllegalArgumentException();
		}
		int siteIndex = siteIndex(i, j);
		// return (percolation.connected(virtualTopIndex,siteIndex) &&
		// isOpen[siteIndex]);
		return (fullness.find(virtualTopIndex) == fullness.find(siteIndex) && isOpen[siteIndex]);
	}

	// does the system percolate?
	public boolean percolates() {
		if (gridLength > 1) {
			return percolation.find(virtualTopIndex) == percolation.find(virtualBottomIndex);
		} else {
			return isOpen[siteIndex(1, 1)];
		}

	}

	public static void main(String[] args) {
		Percolation percolation = new Percolation(1);
		StdOut.println(percolation.percolates());
		percolation.open(1, 1);
		StdOut.println(percolation.percolates());
		Percolation percolation2 = new Percolation(2);
		StdOut.println(percolation2.percolates());
		percolation2.open(1, 1);
		StdOut.println(percolation2.percolates());
		percolation2.open(2, 1);
		StdOut.println(percolation2.percolates());
	}
}