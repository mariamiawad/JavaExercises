import java.util.*;
public class AddThreeNumbers {
	public static void main ( String [] args){
		int a = (int) (Math.random() *10);
		int b = (int) (Math.random()*10);
		int c = (int) (Math.random()*10);
		Scanner input = new Scanner(System.in);
		int answer = a+b+c;
		System.out.println("The sum of " + a+ " + "+ b +" + " + c + "=");
		int userAnswer = input.nextInt();
		if ( answer == userAnswer)
			System.out.println("The answer is true");
		else 
			System.out.println("The answer is false");
	
	}
}
