import java.util.*;
public class VowelConstant{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade");
		char letter = input.next().charAt(0);
		char Letter = Character.toUpperCase(letter);
		if (!Character.isLetter(letter)){
			System.out.println(letter + "is an invalid input");
			System.exit(0);
		}
		if (Letter == 'A' || Letter == 'E' || Letter == 'I' || Letter == 'O' || Letter == 'U' || Letter == 'Y'){
			System.out.println(letter + " is Vowel");
		}
		else {
			System.out.println(letter +" is constant");
		}
		
	}
}