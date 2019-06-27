import java.util.*;
public class TrianglePerimeter {
	public static void main ( String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the three sides of the triangle");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if ( ( a+b )> c &&( a+c)>b && (b+c)>a){
			double perimeter = a+b+c;
			System.out.println("The perimeter is " + perimeter);
		}
		else {
			System.out.println("Invalid number");
			System.exit(1);
		}
	}
}