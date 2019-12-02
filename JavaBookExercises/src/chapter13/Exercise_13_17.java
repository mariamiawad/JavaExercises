package chapter13;
import java.util.Scanner;

public class Exercise_13_17 implements Cloneable {
	private double a;
	private double b;

	public Exercise_13_17() {
		this.a = 0;
		this.b = 0;
	}

	public Exercise_13_17(double a) {
		this.a = a;
		this.b = 0;
	}

	public Exercise_13_17(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Exercise_13_17 add(Exercise_13_17 complex) {
		double c = complex.a;
		double d = complex.b;
		double a = (this.a + c);
		double b = (this.b + d);
		return new Exercise_13_17(a, b);
	}

	public Exercise_13_17 subtract(Exercise_13_17 complex) {
		double c = complex.a;
		double d = complex.b;
		double a = (this.a - c);
		double b = (this.b - d);
		return new Exercise_13_17(a, b);
	}

	public Exercise_13_17 multiply(Exercise_13_17 complex) {
		double c = complex.a;
		double d = complex.b;
		double a  = (this.a * c - this.b * d) ;
		double b = (this.b * c + this.a * d);
		return new Exercise_13_17(a, b);
	}

	public Exercise_13_17 divide(Exercise_13_17 complex) {
		double c = complex.a;
		double d = complex.b;
		double a = (this.a * c + this.b * d) / ((Math.pow(c, 2) + Math.pow(d, 2)));

		double b = ((this.b * c - this.a * d)) / ((Math.pow(c, 2) + Math.pow(d, 2)));
		return new Exercise_13_17(a, b);
	}

	public double abs() {
		return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
	}

	public double getRealPart() {
		return this.a;
	}

	public double getImaginaryPart() {
		return this.b;
	}

	@Override
	public String toString() {
		if (b == 0) {
			return this.a + "";
		}
		return a + " " + b + "i";
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the first complex number:");
		double a1 = inputScanner.nextDouble();
		double b1 = inputScanner.nextDouble();
		Exercise_13_17 complex1 = new Exercise_13_17(a1, b1);
		System.out.println("Enter the second complex number:");
		double a2 = inputScanner.nextDouble();
		double b2 = inputScanner.nextDouble();
		Exercise_13_17 complex2 = new Exercise_13_17(a2, b2);
		Exercise_13_17 add = complex1.add(complex2);
		System.out.println("(" + complex1.getRealPart() + " + " + complex1.getImaginaryPart() + "i)" + " + " + "("
				+ complex2.getRealPart() + " + " + complex2.getImaginaryPart() + "i) = " + add.getRealPart() + " + "
				+ add.getImaginaryPart() + "i");
		Exercise_13_17 subtract = complex1.subtract(complex2);
		System.out.println("(" + complex1.getRealPart() + " + " + complex1.getImaginaryPart() + "i)" + " - " + "("
				+ complex2.getRealPart() + " + " + complex2.getImaginaryPart() + "i) = " +subtract.getRealPart() + " + " + subtract.getImaginaryPart() + "i");
		Exercise_13_17 multiply = complex1.multiply(complex2);
		System.out.println("(" + complex1.getRealPart() + " + " + complex1.getImaginaryPart() + "i)" + " * " + "("
				+ complex2.getRealPart() + " + " + complex2.getImaginaryPart() + "i) = "+ multiply.getRealPart() + " + " + multiply.getImaginaryPart() + "i");
		Exercise_13_17 divide = complex1.divide(complex2);
		System.out.println("(" + complex1.getRealPart() + " + " + complex1.getImaginaryPart() + "i)" + " / " + "("
				+ complex2.getRealPart() + " + " + complex2.getImaginaryPart() + "i) = " +divide.getRealPart() + " + " + divide.getImaginaryPart() + "i");
		System.out.println("|" + complex1.getRealPart() + " + " + complex1.getImaginaryPart() +"i = "+ complex1.abs());
	}
}
