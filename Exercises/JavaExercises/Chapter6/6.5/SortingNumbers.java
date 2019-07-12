import java.util.*;
public class SortingNumbers{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		displaySortingNumbers(n1, n2, n3);
	}
	public static void displaySortingNumbers (double n1, double n2, double n3){
		double max  = Math.max(n1,Math.max(n2,n3)); 
		double min = Math.min(n1,Math.min(n2,n3));
		double med = n1 + n2+ n3- max - min ;
		System.out.println(min+" "+ med+" "+max);
	}
}