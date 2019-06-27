import java.util.*;



public class Volume {
public static void main (String[] args){
	System.out.println("Enter the radius and length of a cylinder:");
	Scanner input = new Scanner(System.in);
	double radius = input.nextDouble();
	double length = input.nextDouble();
	double PI = 3.14;
	double area = radius * radius *PI;
	double volume = area *length;
	System.out.println("The area is " +area);
	System.out.println("The volume is " +volume);
	
	
	
}
}