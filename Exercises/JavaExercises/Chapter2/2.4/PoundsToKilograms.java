import java.util.*;



public class PoundsToKilograms {
public static void main (String[] args){
	System.out.println("Enter a number in pounds");
	Scanner input = new Scanner(System.in);
	double pound = input.nextDouble();
	double kilogram = 0.454;
	double result = pound*kilogram;
	System.out.println( pound + " pounds "+ result +" kilograms");
	
	
	
	
}
}