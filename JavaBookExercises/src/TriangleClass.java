
public class TriangleClass extends SimpleGeometricObject {
private double side1 =1;
private double side2=1;
private double side3=1;
	public TriangleClass() {
		this.side1=1;
		this.side2 =1;
		this.side3 = 1;
	}
	public TriangleClass(double side1, double side2, double side3) {
		this.side1=side1;
		this.side2 =side2;
		this.side3 = side3;
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
	public double getArea() {
		return 0.5*(side1/side2);
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Triangle: side1 = " + side1 + " side2 = " + side2 +
					" side3 = " + side3;
		}
public static void main(String[] args) {
	TriangleClass triangleClass = new TriangleClass(2, 2, 2);
	triangleClass.setFilled(true);
	triangleClass.setColor("Red");
	System.out.println(triangleClass.toString());
	System.out.println("area = "+triangleClass.getArea());
	System.out.println("perimeter ="+triangleClass.getPerimeter());
	System.out.println("is filled"+triangleClass.isFilled());
	System.out.println("color "+ triangleClass);
}
}
