import java.util.*;
public class DividedBySixOrFive{
	public static void main ( String [] args){
		int NUMBER_PER_LINE = 10;
		int count =0;
		for ( int i =100; i<=200; i++){
			if ((i%5==0 && i%6!=0) || (i%6==0 && i%5!=0)){
				count++;
				if (count%NUMBER_PER_LINE==0){
					System.out.println(i);
				}
				else {
					System.out.print(i+" ");
				}
			}
		}
	}
}