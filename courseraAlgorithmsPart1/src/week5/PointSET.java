package week5;


import java.util.TreeSet;

import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.StdDraw;

public class PointSET {
	private int size;
	private TreeSet<Point2D> treeSet;

	public PointSET() {
		// construct an empty set of points
		treeSet = new TreeSet<>();

	}

	public boolean isEmpty() {
		// is the set empty?
		return treeSet.isEmpty();
	}

	public int size() {
		return treeSet.size();
		// number of points in the set
	}

	public void insert(Point2D p) {
		if (p == null) {
			throw new IllegalArgumentException();
		}
		if (!treeSet.contains(p)) {
			treeSet.add(p);
		}
		// add the point to the set (if it is not already in the set)
	}

	public boolean contains(Point2D p) {
		if (p == null) {
			throw new IllegalArgumentException();
		}
		if (isEmpty()) {
			return false;
		}

		// does the set contain point p?
		return treeSet.contains(p);
	}

	public void draw() {
		StdDraw.enableDoubleBuffering();
		StdDraw.setXscale(0, 32768);
		StdDraw.setYscale(0, 32768);
		for (Point2D p : treeSet) {
			p.draw();
		}
		StdDraw.show();

	}

	public Iterable<Point2D> range(RectHV rect) {
		// all points that are inside the rectangle (or on the boundary)
		if (rect == null) {
			throw new IllegalArgumentException();
		}
		if (isEmpty()) {
			return null;
		}

		MinPQ<Point2D> queue = new MinPQ<>();
		for (Point2D point2d : treeSet) {
			if (rect.contains(point2d)) {
				queue.insert(point2d);
			}

		}
		return queue;
	}

	public Point2D nearest(Point2D p) {
		// a nearest neighbor in the set to point p; null if the set is empty
		if (p == null) {
			throw new IllegalArgumentException();
		}
		if (isEmpty()) {
			return null;
		}

		Point2D minPoint2d = null;
		for (Point2D point2d : treeSet) {
			if (minPoint2d == null || p.distanceTo(point2d) < p.distanceTo(minPoint2d)) {
				minPoint2d = new Point2D(point2d.x(), point2d.y());
			}
		}
		return minPoint2d;
	}

	public static void main(String[] args) {
		
	}
}