import java.util.*;
public class AndOrUsage {
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number = input.nextInt();
		boolean trueFalse = false;
		if (number%6 ==0 && number%5 ==0){
			trueFalse = true;
			System.out.println("Is "+ number+" divisible by 5 and 6? "+trueFalse);
			trueFalse=false;
		}
		else {
			System.out.println("Is " +number + " divisible by 5 and 6? "+trueFalse);
		}
			
		if (number%6 ==0 || number%5 ==0){
			trueFalse = true;
			System.out.println("Is " +number + " divisible by 5 or 6? "+trueFalse);
			trueFalse=false;
		}
		else {
			System.out.println("Is " +number + " divisible by 5 or 6? "+trueFalse);
		}
		if ((number%6 ==0 && number%5 !=0) || (number%6!=0 && number%5 ==0)){
			trueFalse = true;
			System.out.println("Is " +number + " divisible by 5 or 6, but not both "+trueFalse);
			trueFalse=false;
		}
		else {
			System.out.println("Is " +number + " divisible by 5 or 6, but not both? "+trueFalse);
		}
	}
}