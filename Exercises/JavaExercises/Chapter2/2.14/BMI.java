import java.util.*;
public class BMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		double weightPounds = input.nextDouble();
		double weigthKilo = weightPounds*0.45359237;
		System.out.println("Enter height in inches:");
		double heigthInches = input.nextDouble();
		double heightMeter = heigthInches*0.0254;
		double bmi = weigthKilo/(Math.pow(heightMeter,2));
		System.out.println("BMI is "+ bmi);
		
	}
}
