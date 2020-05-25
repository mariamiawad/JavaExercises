package week3;



import java.util.Comparator;

import edu.princeton.cs.algs4.StdDraw;

public class Point implements Comparable<Point> {

	private final int x; // x-coordinate of this point
	private final int y; // y-coordinate of this point

	/**
	 * Initializes a new point.
	 *
	 * @param x the <em>x</em>-coordinate of the point
	 * @param y the <em>y</em>-coordinate of the point
	 */
	public Point(int x, int y) {
		/* DO NOT MODIFY */
		this.x = x;
		this.y = y;
	}

	private class SlopeOrder implements Comparator<Point> {

		public int compare(Point v, Point w) {
			double slopev = slopeTo(v), slopew = slopeTo(w);

			if (slopev < slopew)
				return -1;
			else if (slopev > slopew)
				return +1;
			else
				return 0;
		}
	}

	/**
	 * Draws this point to standard draw.
	 */
	public void draw() {
		/* DO NOT MODIFY */
		StdDraw.point(x, y);
	}

	/**
	 * Draws the line segment between this point and the specified point to standard
	 * draw.
	 *
	 * @param that the other point
	 */
	public void drawTo(Point that) {
		/* DO NOT MODIFY */
		StdDraw.line(this.x, this.y, that.x, that.y);
	}

	/**
	 * Returns the slope between this point and the specified point. Formally, if
	 * the two points are (x0, y0) and (x1, y1), then the slope is (y1 - y0) / (x1 -
	 * x0). For completeness, the slope is defined to be +0.0 if the line segment
	 * connecting the two points is horizontal; Double.POSITIVE_INFINITY if the line
	 * segment is vertical; and Double.NEGATIVE_INFINITY if (x0, y0) and (x1, y1)
	 * are equal.
	 *
	 * @param that the other point
	 * @return the slope between this point and the specified point
	 */
	public double slopeTo(Point that) {
		double slope;
		int cmp = this.compareTo(that);

		if (cmp == 0)
			slope = Double.NEGATIVE_INFINITY;
		else if (this.x == that.x)
			slope = Double.POSITIVE_INFINITY;
		else if (this.y == that.y)
			slope = +0.00;
		else
			slope = (double) (that.y - this.y) / (double) (that.x - this.x);

		return slope;
	}

	/**
	 * Compares two points by y-coordinate, breaking ties by x-coordinate. Formally,
	 * the invoking point (x0, y0) is less than the argument point (x1, y1) if and
	 * only if either y0 < y1 or if y0 = y1 and x0 < x1.
	 *
	 * @param that the other point
	 * @return the value <tt>0</tt> if this point is equal to the argument point (x0
	 *         = x1 and y0 = y1); a negative integer if this point is less than the
	 *         argument point; and a positive integer if this point is greater than
	 *         the argument point
	 */
	public int compareTo(Point that) {
		if (this.y < that.y)
			return -1;
		else if (this.y > that.y)
			return +1;
		else if (this.x < that.x)
			return -1;
		else if (this.x > that.x)
			return +1;
		else
			return 0;
	}

	/**
	 * Compares two points by the slope they make with this point. The slope is
	 * defined as in the slopeTo() method.
	 *
	 * @return the Comparator that defines this ordering on points
	 */
	public Comparator<Point> slopeOrder() {
		return new SlopeOrder();
	}

	/**
	 * Returns a string representation of this point. This method is provide for
	 * debugging; your program should not rely on the format of the string
	 * representation.
	 *
	 * @return a string representation of this point
	 */
	public String toString() {
		/* DO NOT MODIFY */
		return "(" + x + ", " + y + ")";
	}

	/**
	 * Unit tests the Point data type.
	 */
	public static void main(String[] args) {
//		Point point = new Point(10, 10);
//		System.out.println(point);
//
//		Point ps[] = new Point[10];
//		for (int i = 0; i < 10; ++i)
//			ps[i] = new Point(StdRandom.uniform(100), StdRandom.uniform(100));
//		for (Point p : ps)
//			System.out.print(p + " ");
//		System.out.println();
//		Arrays.sort(ps, 0, ps.length);
//		for (Point p : ps)
//			System.out.print(p + " ");
//		System.out.println();
//		Arrays.sort(ps, 1, ps.length, point.slopeOrder());
//		for (Point p : ps)
//			System.out.print(p + " ");
//		System.out.println();
//
//		Point points[] = new Point[] { new Point(29000, 8000), new Point(26000, 10000), new Point(16000, 16000),
//				new Point(5000, 18000) };
//		for (int i = 0; i < points.length - 1; ++i)
//			System.out.println(points[i].slopeTo(points[i + 1]));
//
//		System.out.println(new Point(1, 1).slopeTo(new Point(-1, -1)));
//
//		for (int i = 1; i < 10; ++i)
//			ps[i] = new Point(1, i);
//		ps[0] = new Point(0, 0);
//		for (Point p : ps)
//			System.out.print(p + " ");
//		System.out.println();
//		Arrays.sort(ps, 1, ps.length, point.slopeOrder());
	}
}