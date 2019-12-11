package chapter13;

import java.util.Scanner;

public class Exercise_13_20 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a, b, c ");
		int a = inputScanner.nextInt();
		int b = inputScanner.nextInt();
		int c = inputScanner.nextInt();
		int d = (int) (Math.pow(b, 2) -(4*a*c));
		
		if(d==0) {
			Exercise_13_17 r1 = new Exercise_13_17(-b / (2 * a));
			System.out.println("The roots is " + r1 );
			
			
		}
		else if (d>0) {
			double r1 = (-b + Math.sqrt(d))/2.0*a;
			double r2 = (-b - Math.sqrt(d))/2.0*a;
			System.out.println("The roots are " + r1 + " and " + r2);
		}
		else {
			Exercise_13_17 r1 = new Exercise_13_17(-b / (2 * a), Math.pow(-d, 0.5) / (2.0 * a));
			Exercise_13_17 r2 = new Exercise_13_17(-b / (2 * a), -Math.pow(-d, 0.5) / (2 * a));
			System.out.println("The roots are " + r1 + " and " + r2);
			
		}
		
	}
}
