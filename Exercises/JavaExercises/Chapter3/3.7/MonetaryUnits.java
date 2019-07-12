import java.util.*;
public class MonetaryUnits{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		int remainingAmount = (int) (amount*100);
		int numberOfDollars = remainingAmount /100;
		remainingAmount = remainingAmount %100;
		int numberOfQuarters = remainingAmount/25;
		remainingAmount = remainingAmount%25;
		int numberOfDimes = remainingAmount/10;
		remainingAmount=remainingAmount%10;
		int numberOfNickels = remainingAmount /5;
		remainingAmount=remainingAmount%5;
		int numberOfPennies =remainingAmount;
		String plural = " Your amount "+ amount + " consits of " + numberOfDollars;
		if(numberOfDollars > 1 )
			plural+= " Dollars ";
		else 
			plural+= " Dollar ";
		plural+= numberOfQuarters;
		if(numberOfQuarters > 1 )
			plural+= " quarters ";
		else 
			plural+= " quarter ";
		plural+= numberOfDimes;
		if(numberOfDimes > 1 )
			plural+= " dimes ";
		else 
			plural+= " dime ";
		plural+= numberOfNickels;
		if(numberOfDimes > 1 )
			plural+= " nickels ";
		else 
			plural+= " nickel ";
		System.out.println (plural);
		
	}
}