import java.util.Scanner;

public class MyTriangle {

	public MyTriangle() {
		// 
	}

	public static boolean isValid(double side1, double side2, double side3) {
		return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));

	}

	public static double area(double side1, double side2, double side3) {
		if(isValid(side1, side2, side3)) {
		double s = (side1 + side2 + side3) / 2.0;
		return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		}
		else {
			return -1;
		}
	
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enrter side1 ");
		double side1 = inputScanner.nextDouble();
		System.out.println("Enrter side2 ");
		double side2 = inputScanner.nextDouble();
		System.out.println("Enrter side3");
		double side3 = inputScanner.nextDouble();
		MyTriangle myTriangle = new MyTriangle();
		double area = myTriangle.area(side1, side2, side3);
		if(area>-1) {
			System.out.println("Area = "+ area);
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
