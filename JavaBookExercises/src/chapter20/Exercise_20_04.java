package chapter20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise_20_04 {
	public static void main(String[] args) {
		Point[] points = new Point[100];
		CompareY compareY = new CompareY();
		for (int i = 0; i < points.length; i++) {

			points[i] = new Point();

			points[i].setX(ThreadLocalRandom.current().nextDouble());
			points[i].setY(ThreadLocalRandom.current().nextDouble());
		}
		Arrays.sort(points);
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i].getX() + "," + points[i].getY());
		}

		System.out.println();
		Arrays.sort(points, compareY);
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i].getX() + "," + points[i].getY());
		}

	}

}

class Point implements Comparable<Point> {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		if (this.x > o.x) {
			return 1;
		} else if (this.x < o.x) {
			return -1;
		} else if (this.x == o.x) {
			if (this.y > o.y) {
				return 1;
			} else if (this.y < o.y) {
				return -1;
			}
		}
		return 0;
	}

}

class CompareY implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		if (o1.getY() > o2.getY()) {
			return 1;
		} else if (o1.getY() < o2.getY()) {
			return -1;
		} else if (o1.getY() == o2.getY()) {
			if (o1.getX() > o2.getX()) {
				return 1;
			} else if (o1.getX() < o2.getX()) {
				return -1;
			}
		}
		return 0;
	}

}