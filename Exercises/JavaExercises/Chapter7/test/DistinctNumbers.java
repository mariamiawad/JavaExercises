import java.util.*;
public class DistinctNumbers{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter ten numbers:");
		int [] numbers = new int [10];
		int count =0;
		for(int i=0; i<10;i++){
			numbers[i]= input.nextInt();
		}
		System.out.print("The distinct numbers are: ");
		for(int i =0; i<numbers.length;i++){
			int j=0;
			for(j=0; j<i;j++){
				if (numbers[i]==numbers[j]){
					break;
				}
			}
				if(i==j){
					count++;
					System.out.print( numbers[i] +" ");
				}
				
			
			}
		System.out.println();
		System.out.println("The number of distinct number is" + count);
		
		
	}
	
}