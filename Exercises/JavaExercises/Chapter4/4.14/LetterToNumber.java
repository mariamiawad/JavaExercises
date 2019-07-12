import java.util.*;
public class LetterToNumber{
	public static void main( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade:");
		char ch = input.next().charAt(0);
		char chUpper = Character.toUpperCase(ch);
		int number = 0;
		switch (chUpper){
			case 'A' : number = 4; break;
			case 'B' : number = 3; break;
			case 'C' : number = 2; break;
			case 'D' : number = 1 ; break;
			case 'F' : number = 0;break; 
			default : System.out.println(ch+"is an invalid grade");
			System.exit(1);
			break;
			}
		System.out.println("The numeric value for garade " + ch + " is " + number);
	}
}