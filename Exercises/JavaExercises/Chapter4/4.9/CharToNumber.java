import java.util.*;
public class CharToNumber{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch = input.next().charAt(0);
		int x = (int)ch;
		System.out.println("The Unicode for the character : "+ ch +" is " +x);
	}
}