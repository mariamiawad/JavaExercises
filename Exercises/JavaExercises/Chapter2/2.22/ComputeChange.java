import java.util.*;
public class  ComputeChange {
	public static void main (String[] args){
		System.out.println("Please enter the amount");
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		int numberOfOneDollars = amount/100;
		amount = amount%100;
		int numberOfCents = amount;
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfCents + " cents ");
	}
}