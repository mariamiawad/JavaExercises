import java.util.*;
public class PentagonNumber{
	public static void main ( String [] args){
		int number =0;
		for(int i=0; i<100;i++){
			number = pentagonNumber(i+1);
			System.out.println(number);
		}
	}
	public static int pentagonNumber(int number){
		int x = (number*((3 * number) -1))/2;
		return x;
	}
}