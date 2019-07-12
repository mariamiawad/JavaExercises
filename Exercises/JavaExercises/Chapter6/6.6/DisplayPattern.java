import java.util.*;
public class DisplayPattern{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();
		displayPattern(n);
	}
	public static void displayPattern(int n){
		for (int i=1; i<=n;i++){
			for(int j=1; j<=n-i; j++){
				System.out.print("  ");
			}
			System.out.print(i+ " ");
			for (int j = 1; j < i; j++) {
				System.out.print(i-j );
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}