import java.util.*;
public class HeadTail{
	public static void main ( String [] args){
		int headTail = (int)(Math.random()*2);
		Scanner input = new Scanner (System.in);
		System.out.println("Enter 0 for head 1 for tail");
		int x = input.nextInt();
		if ( x==1 || x==0){
			if (x == headTail)
				System.out.println("You are correct ");
			else 
				System.out.println("You are incorrect");
		}
		else {
			System.out.println("Invalid number");
			System.exit(1);
		}
	}
}