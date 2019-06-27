import java.util.*;
public class NumberToChar{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code:");
		int ch = input.nextInt();
		char x = (char)ch;
		System.out.println("The character for ASCII code " + ch + " is " +x);
	}
}