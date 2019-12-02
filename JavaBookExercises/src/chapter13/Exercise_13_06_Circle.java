package chapter13;

public abstract class Exercise_13_06_Circle implements Comparable<Exercise_13_06_Circle> {

	protected double radius;

	/** Construct a circle with radius 1 */
	Exercise_13_06_Circle() {
		radius = 1;
	}

	Exercise_13_06_Circle(double newRadius) {
		radius = newRadius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public int compareTo(Exercise_13_06_Circle o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() < o.getArea()) {
			return -1;

		} else {
			return 0;
		}
	}
}