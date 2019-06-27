import java.util.*;
public class PointInCircle {
	public static void main ( String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double distance = Math.pow((Math.pow((x-0),2) + Math.pow((y-0),2)),0.5);
		if (distance >10){
			System.out.println("Point (" +x +","+y +") is not in the circle");
		}
		else {
			System.out.println("Point (" +x +","+y +") is in the circle");
		}
	}
}