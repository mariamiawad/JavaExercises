import java.util.*;
public class BMI {
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble()*0.45359237;
		System.out.println("Enter feet:");
		double feet = input.nextDouble()*12.0;
		System.out.println("Enter inches:");
		double inches = input.nextDouble();
		double height = (feet+inches)*0.0254;
		double bmi =weight / (height*height);
		if (bmi <18.5){
			System.out.println("BMI is " + bmi );
			System.out.println("Underweight");
		}
		else if (bmi >=18.5 && bmi <25.0){
			System.out.println("BMI is " + bmi );
			System.out.println("Normal");
		}
		else if (bmi >=25.5 && bmi <30.0){
			System.out.println("BMI is " + bmi );
			System.out.println("Overweight");
		}
		else if (bmi >=30.0){
			System.out.println("BMI is " + bmi );
			System.out.println("Obese");
		}
	}
}