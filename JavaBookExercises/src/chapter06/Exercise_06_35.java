package chapter06;
import java.util.Scanner;

public class Exercise_06_35 {

	public Exercise_06_35() {
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the side: ");
		System.out.println("The area of the pentagon is " + area(inputScanner.nextDouble()));
	}
	public static double area(double side) {
		return (5 * Math.pow(side, 2))/(4*(Math.tan(Math.PI/5)));
		
	}

}
