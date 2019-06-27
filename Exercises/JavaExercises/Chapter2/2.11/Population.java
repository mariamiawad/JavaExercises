import java.util.*;
public class Population{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years:");
		double yearsNumber= input.nextDouble();
		double constant = 365*24*60*60;
		double birth = constant/7.0;
		double death = constant/13.0;
		double immigrant = constant/45.0;
		int result =(int)( 312032486+yearsNumber*(birth-death+immigrant));
		System.out.println("The population in 5 years is "+result);
		
	}
}