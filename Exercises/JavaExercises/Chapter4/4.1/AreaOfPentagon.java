import java.util.*;
public class AreaOfPentagon{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex:");
		double r = input.nextDouble();
		double s = (2*r)*Math.sin(Math.PI/5);
		double area = (5*Math.pow(s,2))/(4*Math.tan(Math.PI/5));
		System.out.println("The area of the pentagon is "+area);
	}
}