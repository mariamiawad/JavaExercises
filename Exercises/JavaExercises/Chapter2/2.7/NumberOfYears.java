import java.util.*;
public class NumberOfYears{
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes:");
		int minutes = input.nextInt();
		int hours = minutes/60;
		int day = hours/24;
		int years= day/365;
		int days = day%365;
		System.out.println(minutes+
		" minutes is approximately " +years + " years and " +days+" days");
	}
}