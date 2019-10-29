import java.util.Scanner;

public class Exercise_06_36 {

	public Exercise_06_36() {
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int n = inputScanner.nextInt();
		System.out.println("Enter the side:");
		double side = inputScanner.nextDouble();
		System.out.println("The area of the polygon is " +area(n, side));
	}
	public static double area(int n, double side) {
		return (n * Math.pow(side, 2)) / (4* Math.tan(Math.PI/n));
	}
}
