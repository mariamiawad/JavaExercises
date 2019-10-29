
public class Exercise_13_5_Circle extends Exercise_13_5_GeometricObject {
	protected double radius;

	public Exercise_13_5_Circle(double radius) {
		this.radius = radius;
	}

	public Exercise_13_5_Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
