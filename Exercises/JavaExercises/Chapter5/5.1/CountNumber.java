import java.util.*;
public class CountNumber{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0:");
		int number = input.nextInt();
		int sum= 0;
		int countPositive=0;
		int countNegative = 0;
		while (number !=0){
			sum += number;
			if (number < 0){
				countNegative++;
			}
			else if (number >0){
				countPositive++;
				}
			number = input.nextInt();	
				
		}
		int average = sum/(countPositive+countNegative);
		System.out.println("The number of positives is " + countPositive);
		System.out.println("The number of negatives is " + countNegative);
		System.out.println("The total is "+ sum);
		System.out.println("The average is " + average);
	}
	
}