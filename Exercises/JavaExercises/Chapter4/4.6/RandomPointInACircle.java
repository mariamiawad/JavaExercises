import java.util.*;
public class RandomPointInACircle{
	public static void main ( String [] args){
		int R = 40;
		System.out.println("Three random points are ");
		double angle = Math.random() * 360;
		angle = Math.toRadians(angle);
		double x = R* Math.cos(angle);
		double y = R*Math.sin(angle);
		System.out.println("(" + x + ", " + y + ")");
		angle = Math.random() *360;
		angle = Math.toRadians(angle);
		x = R* Math.cos(angle);
		y = R*Math.sin(angle);
		System.out.println("(" + x + ", " + y + ")");
		angle = Math.random() *360;
		angle = Math.toRadians(angle);
		x = R* Math.cos(angle);
		y = R*Math.sin(angle);
		System.out.println("(" + x + ", " + y + ")");
	}
}