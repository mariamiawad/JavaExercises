import java.util.*;
public class RectangleIntersection{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w1 = x1/2;
		double h1 = y2/2;
		System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		double w2= x4/2;
		double h2= y4/2;
		double x1Top = x1 + w1;
		double y1Top = y1 + h1;
		double x1Bottom = x1 - w1;
		double y1Bottom = y1 - h1;
		double x2Top = x2 + w2;
		double y2Top = y2 + h2;
		double x2Bottom = x2 - w2;
		double y2Bottom = y2 - h2;
		double wInTop= Math.abs(x2Top-x1Top);
		double hInTop = Math.abs(y2Top-y1Top);
		double wInBottom= Math.abs(x2Bottom-x1Bottom);
		double hInBottom =Math.abs(y2Bottom-y1Bottom);
		if (x1==x2 && y1==y2 && w1==w2 && h1==h2){
			System.out.println("r1 and r2 are identical");
		}
		else if ((Math.abs(wInTop)<=x1Top && Math.abs(hInTop)<=y1Top)||(Math.abs(wInBottom)<=x1Top && Math.abs(hInBottom)<=y1Top)){
			System.out.print("r2 overlaps r1");
		}
		else if(Math.abs(x2-x1)<=w1 && Math.abs(y2-y1)<=h1 && w1>w2 && h1>h2){
			System.out.print("r2 inside r1");
		}
			
		
		
	}
}