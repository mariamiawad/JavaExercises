import java.util.*;
public class ReverseNumber{
	public static void main ( String [] args){
		System.out.println("Enter 10 numbers");
		Scanner input = new Scanner(System.in);
		int [] numbers = new int [10];
		for (int i =0; i<10;i++)
		{
			numbers [i] = input.nextInt();
		}
		for(int i=9; i>=0; i--)
		{
			System.out.print(numbers[i]+" ");
		}
	}
}