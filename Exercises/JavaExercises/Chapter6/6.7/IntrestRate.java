import java.util.*;
public class IntrestRate{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("The amount invested:");
		double investmentAmount = input.nextDouble();
		System.out.println("Annual interest rate:");
		
		double annualRate = input.nextDouble();
		double monthlyInterestRate = (annualRate/100)/12;
		double futureValue =0;
		System.out.println("Years      Future Value");
		for(int year=1; year<=30; year++){
			futureValue = futureInvestmentValue(investmentAmount,monthlyInterestRate, year);
			System.out.println(year + "     " + futureValue);
		}
	}
public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
	double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate,years*12);
	return futureInvestmentValue;
	}
}