import java.util.*;
public class FutureInvestment{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double investmentAmount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage:");
		double monthlyInterestRate = input.nextDouble()/1200.0;
		System.out.println("Enter number of years:");
		double numberYears = input.nextDouble();
		double futureInvestment =investmentAmount*Math.pow((1+monthlyInterestRate),(numberYears*12));
		System.out.println("Accumulated value is "+futureInvestment);
	}
}