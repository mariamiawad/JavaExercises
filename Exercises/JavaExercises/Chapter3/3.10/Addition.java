import java.util.*;
public class Addition {
	public static void main(String [] args){
		int x = (int) (Math.random()*10);
		int y = (int) (Math.random()*10);
		System.out.println("What is " + x + " + " + y + "? ");
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		if (result == x+y)
			System.out.println("You are correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(x + " + " + y +" should be " + (x +y)); 

		}
	}
}