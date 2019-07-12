import java.util.*;



public class CalculateTips {
public static void main (String[] args){
	System.out.println("Enter the subtotal and a gratuity rate");
	Scanner input = new Scanner(System.in);
	double subtotal = input.nextDouble();
	double gratuityRate = input.nextDouble();
	double gratuity =( subtotal*gratuityRate)/100;
	double total = gratuity + subtotal;
	System.out.println("The gratuity is $" + gratuity+ "and total is $"+ total);
	
	
	
	
}
}