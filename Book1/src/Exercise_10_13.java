
public class Exercise_10_13 {
	protected double x;
	protected double y;
	protected double width;
	protected double height;

	public Exercise_10_13() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}

	public Exercise_10_13(double x, double y, double height, double width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return this.height * this.width;
	}

	public double getPerimeter() {
		return 2 * (this.height + this.width);

	}

	public boolean contains(double x, double y) {

		return this.x < x && this.y < y && this.x + this.width > x && this.y + this.height > y;
	}

	public boolean contains(Exercise_10_13 exercise_10_13) {
		return this.x <= exercise_10_13.x && this.y <= exercise_10_13.y
				&& this.x + this.width >= exercise_10_13.x + exercise_10_13.width
				&& this.y + this.height >= exercise_10_13.y + exercise_10_13.height;
	}

	public boolean overlaps(Exercise_10_13 exercise_10_13) {
		return this.x < exercise_10_13.x + exercise_10_13.width && this.x + this.width > exercise_10_13.x
				&& this.y < exercise_10_13.y + exercise_10_13.height && this.y + this.height > exercise_10_13.y;

	}

	public static void main(String[] args) {
		Exercise_10_13 r1 = new Exercise_10_13(2, 2, 5.5, 4.9);
		System.out.println("Area = " + r1.getArea());
		System.out.println("Perimeter = " + r1.getPerimeter());
		System.out.println("r1 contains point (3,3) " + r1.contains(3, 3));
		System.out.println("r1 contains r2 " + r1.contains(new Exercise_10_13(4, 5, 10.5, 3.2)));
		System.out.println("" + r1.overlaps(new Exercise_10_13(3, 5, 2.3, 5.4)));
	}

}
