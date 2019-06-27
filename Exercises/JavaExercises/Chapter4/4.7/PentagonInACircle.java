import java.util.*;
public class PentagonInACircle{
	public static void main ( String [] args ){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the bounding circle: ");
		double r = input.nextDouble();
		double x1 = r *Math.cos(Math.toRadians(72));
		double y1 = r *Math.sin(Math.toRadians(72));
		double x2 = r *Math.cos(Math.toRadians(144));
		double y2 = r *Math.sin(Math.toRadians(144));
		double x3 = r *Math.cos(Math.toRadians(216));
		double y3= r *Math.sin(Math.toRadians(216));
		double x4 = r *Math.cos(Math.toRadians(288));
		double y4 = r *Math.sin(Math.toRadians(288));
		double x5 = r *Math.cos(Math.toRadians(0));
		double y5 = r *Math.sin(Math.toRadians(0));
		 System.out.printf("(%10.10f, %10.10f)\n", x1, y1);
  System.out.printf("(%10.10f, %10.10f)\n", x2, y2);
  System.out.printf("(%10.10f, %10.10f)\n", x3, y3);
  System.out.printf("(%10.10f, %10.10f)\n", x4, y4);
  System.out.printf("(%10.10f, %10.10f)\n", x5, y5);
	}
}