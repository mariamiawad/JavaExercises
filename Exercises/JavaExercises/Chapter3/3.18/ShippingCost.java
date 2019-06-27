import java.util.*;
public class ShippingCost{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter shipping's weight");
		double weight = input.nextDouble();
		double result = 0;
		if (weight > 50){
			System.out.println("the package cannot be shipped.");
			System.exit(1);
		}
		else if (weight > 0 && weight <=1){
			result = weight*3.5;
		}
		else if (weight > 1 && weight <=3){
			result = weight*5.5;
		}
		else if (weight > 3 && weight <=10){
			result = weight*8.5;
		}
		else if (weight > 10 && weight <=20){
			result = weight*10.5;
		}
		System.out.println("The cost will be $"+ result);
	}
}