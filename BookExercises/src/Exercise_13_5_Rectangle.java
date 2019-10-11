
public class Exercise_13_5_Rectangle extends Exercise_13_5_GeometricObject {
	protected double width;
	protected double height;

	public Exercise_13_5_Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}

	public Exercise_13_5_Rectangle(String color, boolean filled, double height, double width) {
		super(color, filled);
		this.height = height;
		this.width = width;

	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.height * this.width;
	}

}
