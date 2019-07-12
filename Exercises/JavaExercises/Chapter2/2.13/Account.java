import java.util.*;
public class Account{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount: ");
		double amount = input.nextDouble();
		double constant = 1+0.00417;
		double first =amount*constant;
		double second =(amount+ first) * constant;
		double third =(amount + second) * constant;
		double fourth =(amount+ third) * constant;
		double fifth = (amount +fourth) * constant;
		double sixth = (amount+ fifth) *constant;
		System.out.println("After the sixth month, the account value is $"+ sixth);
	}
}