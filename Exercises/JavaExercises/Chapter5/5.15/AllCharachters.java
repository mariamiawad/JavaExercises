import java.util.*;
public class AllCharachters{
	public static void main ( String [] args){
		for(char i = '!'; i<='~' ; i++){
			System.out.print(i + " "); 
		if ((i-32)%10==0)
			System.out.println("");
		
		}
	}
}