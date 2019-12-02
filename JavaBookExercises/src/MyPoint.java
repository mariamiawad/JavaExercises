import java.awt.Point;

public class MyPoint {
	double x = 0;
	double y = 0;
	
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

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double distance(double x, double y) {
		return Math.pow(Math.pow(this.x-x, 2 )+Math.pow(this.y-y, 2),0.5);
	}
	public double distance(MyPoint point) {
		return Math.pow(Math.pow(this.x-point.getX(), 2 )+Math.pow(this.y-point.getY(), 2),0.5);
		
	}
	public static void main(String[] args) {
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10,30.5);
		double distance = point1.distance(10, 30.5);
		System.out.println(distance);
	}

}
