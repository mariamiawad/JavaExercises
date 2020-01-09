
public class Circle2DClass {
private double x;
private double y;
  double radius;
	public Circle2DClass(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public Circle2DClass() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * Math.sqrt(radius);
	}
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public static boolean contains(double x , double y) {
		Circle2DClass circle2dClass = new Circle2DClass();
		double x1 = circle2dClass.getX();
		double y1 = circle2dClass.getY();
		double d=Math.pow((x1-x), 2)+Math.pow(y1-y, 2);
		d = Math.sqrt(d);
		if(d<0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean contains(Circle2DClass circle2dClass) {
		Circle2DClass circle2dClass2 = new Circle2DClass();
		double x1 = circle2dClass2.getX();
		double y1 = circle2dClass2.getY();
		double x2 = circle2dClass.getX();
		double y2 = circle2dClass.getY();
		int distSq = (int)Math.sqrt(((x1 - x2)  
                * (x1 - x2))  
                + ((y1 - y2)  
                * (y1 - y2)));  
				
		double d = Math.sqrt(2);
		if(d<0) {
			return true;
		}
		else {
			return false;
		}
	}
}
