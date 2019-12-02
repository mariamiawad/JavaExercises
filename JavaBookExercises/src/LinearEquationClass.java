
public class LinearEquationClass {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public LinearEquationClass(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public boolean isSolvable() {
		return a * d - b * c != 0;

	}

	public double getX() {

		return (e * d - b * f) / (a * d - b * c);

	}

	public double getY() {

		return (a * f - e * c) / (a * d - b * c);
	}

	public static void main(String[] args) {
		LinearEquationClass linearEquationClass = new LinearEquationClass(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
		if (linearEquationClass.isSolvable()) {
			System.out.println(linearEquationClass.getX());
			System.out.println(linearEquationClass.getY());
		} else {
			System.out.println("The equation has no solution");
		}
		linearEquationClass = new LinearEquationClass( 1.0, 2.0, 2.0, 4.0, 4.0, 5.0);
		if (linearEquationClass.isSolvable()) {
			System.out.println(linearEquationClass.getX());
			System.out.println(linearEquationClass.getY());
		} else {
			System.out.println("The equation has no solution");
		}
	}

}
