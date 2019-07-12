import java.util.*;
public class ReverseNumber{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten integers");
		int [] array = new int[10];
		for (int i= 0; i <array.length;i++){
			array[i]= input.nextInt();
		}
		for (int i = array.length-1; i>=0; i--){
			System.out.print(array[i] + " ");
		}
	}
}
