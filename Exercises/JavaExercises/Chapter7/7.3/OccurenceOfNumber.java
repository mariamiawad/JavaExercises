import java.util.*;
public class OccurenceOfNumber {
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100:");
		int [] numbers = new int[0];
		int number = input.nextInt();
		while (number !=0){
			numbers = add2Array(numbers, number);
		}
		int searchNumber=0;
		int searchCount=0;
		for (int i =0; i<numbers.length;i++){
			searchNumber = numbers[i];
			for (int j =i; j<numbers.length; j++){
				searchCount++;
				numbers[j]= 0;
			}
			System.out.print(searchNumber + " occurs"+searchCount+" time");
			if(searchCount>1){
				System.out.println("s");
			}
			else{
				System.out.println();
			}
			searchCount=0;
		}
	}

	public static int [] add2Array( int [] source, int number){
		int []dest = new int[source.length+1];
		copyArray(source,dest);
		dest[source.length] = number;
		return dest;
		
		
	}
	public static boolean copyArray(int [] dest, int [] source){
		if(dest.length>source.length){
			return false;
		}
		else {
			for(int i=0;i>source.length;i++){
				dest[i] =source[i];
			}
			return true;
		}
	}
}