
public class NewTriangle extends SimpleGeometricObject {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	public NewTriangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}

	public NewTriangle(double side1, double side2, double side3) throws IllegalTriangleException {

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		isValidTriangle();
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide1(double side1) throws IllegalTriangleException {
		this.side1 = side1;
		isValidTriangle();
	}

	public void setSide2(double side2) throws IllegalTriangleException {
		this.side2 = side2;
		isValidTriangle();
	}

	public void setSide3(double side3) throws IllegalTriangleException {
		this.side3 = side3;
		isValidTriangle();
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2.0;
		return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

	public static boolean isTriangle(double side1, double side2, double side3) {

		return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));

	}

	public void isValidTriangle() throws IllegalTriangleException {
		if (!isTriangle(side1, side2, side3)) {
			throw new IllegalTriangleException(side1, side2, side3);
		}
	}

class IllegalTriangleException extends IllegalArgumentException {
	private double side1;
	private double side2;
	private double side3;

	public IllegalTriangleException(double side1, double side2, double side3) {
		super("Not a real triangle:" + " side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
}



	public static void main(String[] args) {

		try {
			NewTriangle triangleClass = new NewTriangle(2, 2, 2);
			triangleClass.setFilled(true);
			triangleClass.setColor("Red");
			System.out.println(triangleClass.toString());
			System.out.println("area = " + triangleClass.getArea());
			System.out.println("perimeter = " + triangleClass.getPerimeter());
			System.out.println("is filled " + triangleClass.isFilled());
			System.out.println("color " + triangleClass.getColor());
		} catch (IllegalTriangleException e) {

			e.printStackTrace();
		}

	}
}
