import java.util.Scanner;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
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

	public double getDiscriminant() {

		return (Math.pow(getB(), 2)) - (4 * getA() * getC());

	}

	public double getRoot1() {
		if (getDiscriminant() >= 0) {
			return ((-b) + (Math.sqrt(Math.pow(getB(), 2) - (4 * getA() * getC())))) / (2 * getA());
		}
		return 0;
	}

	private double getRoot2() {
		if (getDiscriminant() >= 0) {
			return ((-b) - (Math.sqrt(Math.pow(getB(), 2) - (4 * getA() * getC())))) / (2 * getA());
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a");
		double a = inputScanner.nextDouble();
		System.out.println("Enter b");
		double b = inputScanner.nextDouble();
		System.out.println("Enter c");
		double c = inputScanner.nextDouble();
		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
		double discriminant = quadraticEquation.getDiscriminant();
		if (discriminant > 0) {
			System.out.println("Root1 = " + quadraticEquation.getRoot1() + " root2 = " + quadraticEquation.getRoot2());

		}
		else if (discriminant == 0) {
			System.out.println("Root1 = " + quadraticEquation.getRoot1());

		} else {
			System.out.println("The equation has no roots");
		}

	}

}
