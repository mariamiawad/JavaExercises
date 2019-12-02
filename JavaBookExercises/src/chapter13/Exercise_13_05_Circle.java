package chapter13;

public class Exercise_13_05_Circle extends Exercise_13_05_GeometricObject {
	protected double radius;

	public Exercise_13_05_Circle(double radius) {
		this.radius = radius;
	}

	public Exercise_13_05_Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
