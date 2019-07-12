import java.util.*;
public class AllFactors{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int n = input.nextInt();
		int i = 2; 
		while(n!=1){
			if(n%i==0){
				System.out.print(i+" ");
				n= n/i;
				i=2;
			}
			else {
				i++;
			}
		}
	}
}