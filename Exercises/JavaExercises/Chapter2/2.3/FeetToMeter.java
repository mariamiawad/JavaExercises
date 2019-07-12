import java.util.*;



public class FeetToMeter {
public static void main (String[] args){
	System.out.println("Enter a value for feet:");
	Scanner input = new Scanner(System.in);
	double feet = input.nextDouble();
	double meter = 0.305;
	double result = feet*meter;
	System.out.println( feet + " feet is "+ result);
	
	
	
	
}
}