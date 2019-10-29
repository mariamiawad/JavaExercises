
public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	public RegularPolygon() {
		this.n = 3;
		this.side =1;
		this.x = 0;
		this.y = 0;
	}
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side =side;
		this.x = 0;
		this.y = 0;
	}
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side =side;
		this.x = x;
		this.y = y;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
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
	public double getPerimeter() {
		return this.side*this.n;
		
	}
	public double getArea() {
		return (n*Math.pow(side, 2))/(4*Math.tanh(Math.PI/n));
		
	}
	public static void main(String[] args) {
		RegularPolygon  regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6,4.0);
		RegularPolygon regularPolygon3 = new RegularPolygon(10,4.0 , 5.6, 7.8);
		System.out.println("regularPolygon1's perimeter " + regularPolygon1.getPerimeter());
		System.out.println("regularPolygon1's area " +regularPolygon1.getArea());
		System.out.println("regularPolygon2's perimeter " + regularPolygon2.getPerimeter());
		System.out.println("regularPolygon2's area " +regularPolygon2.getArea());
		System.out.println("regularPolygon3's perimeter " + regularPolygon3.getPerimeter());
		System.out.println("regularPolygon3's area "+regularPolygon3.getArea());
	}
}
