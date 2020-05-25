package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class FastCollinearPoints {

	private LineSegment[] lines;

	public FastCollinearPoints(Point[] points) {
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
		Point[] ps = points.clone();
		Arrays.sort(ps);
		List<LineSegment> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			Point[] p = ps.clone();
			Arrays.sort(p, p[i].slopeOrder());
			int j = 1;
			while (j < n - 2) {
				int k = j;
				double s1 = p[0].slopeTo(p[k++]);
				double s2 = p[0].slopeTo(p[k++]);
				while (s1 == s2 && k <= n) {
					if (k == n) {
						k++;
						break;
					}
					s2 = p[0].slopeTo(p[k++]);
				}

				if (k - j < 4) {
					j++;
					continue;
				}
				int len = k-- - j;
				Point[] line = new Point[len];
				line[0] = p[0];

				for (int l = 1; l < len; l++) {
					line[l] = p[j + l - 1];
				}
				Arrays.sort(line);
				if (line[0] == p[0]) {
					list.add(new LineSegment(line[0], line[len - 1]));
				}
				j = k;
			}
		}
		lines = list.toArray(new LineSegment[list.size()]);
	}

	public int numberOfSegments() {
		return lines.length;
	}

	public LineSegment[] segments() {
		return lines.clone();
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		// read the n points from a file
		In in = new In(args[0]);

		int n = in.readInt();
//		int n = 2; /* scanner.nextInt(); */
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
			int x = in.readInt();
			int y = in.readInt();
			points[i] = new Point(x, y);
		}
		FastCollinearPoints collinear = new FastCollinearPoints(points);
		for (LineSegment segment : collinear.segments()) {
			StdOut.println(segment);
			segment.draw();
		}
		StdDraw.show();
		// draw the points
		StdDraw.enableDoubleBuffering();
		StdDraw.setXscale(0, 32768);
		StdDraw.setYscale(0, 32768);
		for (Point p : points) {
			p.draw();
		}

		StdDraw.show();

		// print and draw the line segments

	}
}