import java.util.*;
public class SumOfAnInteger{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int sum =SumDigits(number);
		System.out.println(sum);
		
		
		
	}
	public static int SumDigits (int number){
		int sum = 0;
		while (number >0){
			int remaining = number%10;
			sum+= remaining;
			number = number/10;			
		}
		return sum;
	}
}