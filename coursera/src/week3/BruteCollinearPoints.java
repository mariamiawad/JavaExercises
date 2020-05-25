package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class BruteCollinearPoints {

	private LineSegment[] segments;

	public BruteCollinearPoints(Point[] points) {
		if (points == null || points.length == 0) {
			throw new IllegalArgumentException();
		}
		int n = points.length;
		for (int i = 0; i < n; i++) {
			if (points[i] == null)
				throw new IllegalArgumentException();
			for (int j = i + 1; j < n; j++) {
				if (points[j] == null) {
					throw new IllegalArgumentException();
				}
				if (points[i].compareTo(points[j]) == 0)
					throw new IllegalArgumentException();
			}
		}

		List<LineSegment> list = new ArrayList<>();
		int N = points.length;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					for (int l = k + 1; l < N; l++) {
						Point[] ps = { points[i], points[j], points[k], points[l] };
						double s1 = ps[0].slopeTo(ps[1]);
						double s2 = ps[0].slopeTo(ps[2]);
						if (s1 != s2) {
							continue;
						}
						double s3 = ps[0].slopeTo(ps[3]);
						if (s1 == s3) {
							Arrays.sort(ps);
							list.add(new LineSegment(ps[0], ps[3]));
						}
					}
				}
			}
		}

		segments = list.toArray(new LineSegment[list.size()]);

	}

	public int numberOfSegments() {
		return segments.length;
	}

	public LineSegment[] segments() {
		return segments.clone();
	}

	public static void main(String[] args) {

		// read the n points from a file
		In in = new In(args[0]);
		int n = in.readInt();
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
			int x = in.readInt();
			int y = in.readInt();
			points[i] = new Point(x, y);
		}

		// draw the points
		StdDraw.enableDoubleBuffering();
		StdDraw.setXscale(0, 32768);
		StdDraw.setYscale(0, 32768);
		for (Point p : points) {
			p.draw();
		}
		StdDraw.show();

		// print and draw the line segments
		BruteCollinearPoints collinear = new BruteCollinearPoints(points);
		for (LineSegment segment : collinear.segments()) {
			StdOut.println(segment);
			segment.draw();
		}
		StdDraw.show();
	}
}
