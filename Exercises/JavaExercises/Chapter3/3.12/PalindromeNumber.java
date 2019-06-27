import java.util.*;
public class PalindromeNumber{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit integer:");
		int number = input.nextInt();
		int originalNumber = number;
		int a = originalNumber/100;
		originalNumber = originalNumber%100;
		int b = originalNumber/10;
		originalNumber = originalNumber%10;
		int c = originalNumber;
		if (a == c )
			System.out.println(number + " is a palindrome");
		else 
			System.out.println(number + " is  not a palindrome");

	}
}