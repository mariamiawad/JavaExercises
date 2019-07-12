import java.util.*;
public class ReversedInteger{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		int reverse = reverse(number);
		System.out.println(reverse);
		
	}
	public static int reverse(int number){
		String s ="";
		if (number ==0)
			return number;
		if (number <0){
			number = number*-1;
			s+="-";
		}
		
		while (number !=0){
			int remaining = number%10;
			s+= remaining;
			number = number/10;
			
		}
		
		return Integer.parseInt(s);
	}
}