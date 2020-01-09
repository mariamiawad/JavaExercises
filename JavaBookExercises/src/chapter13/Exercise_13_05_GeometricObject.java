package chapter13;
import java.util.Date;

public abstract class Exercise_13_05_GeometricObject implements Comparable<Exercise_13_05_GeometricObject> {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	public Exercise_13_05_GeometricObject() {
		dateCreated = new Date();
	}

	/**
	 * Construct a geometric object with the specified color and filled value
	 */
	public Exercise_13_05_GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, its getter method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public Date getDateCreated() {
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	public abstract double getArea();

	@Override
	public int compareTo(Exercise_13_05_GeometricObject o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}

	public static Exercise_13_05_GeometricObject max(Exercise_13_05_GeometricObject o1,
			Exercise_13_05_GeometricObject o2) {
		return (o1.compareTo(o2) >= 0) ? o1 : o2;
	}
}