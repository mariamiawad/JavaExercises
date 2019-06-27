import java.util.*;
public class PalindromeInteger{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();
		int reverse= reverse(number);
		boolean isPalindrome = isPalindrome(number);
		if (isPalindrome){
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}
	public static int reverse(int number){
		int remaining = 0;
		String s="";
		while (number>0){
			remaining = number%10;
			s += Integer.toString(remaining);
			number = number/10;
		}
		return Integer.parseInt(s);
	}
	public static boolean isPalindrome(int number){
		int reverse =reverse(number);
		if(number == reverse){
			return true;
		}
		else{
			return false;
		}
	}
}