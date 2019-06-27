import java.util.*;
public class SmallestNth{
	public static void main ( String [] args){
		int n=1;
		while(n<12000){
			if (Math.pow(n,2)>12000){
				System.out.println(n);
				break;
			}
			n++;
		}
	}
}