import java.util.*;
public class FutureDates{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day:");
		int today = input.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int days = input.nextInt();
		int futureDay = (today+days)%7;
		switch (today){
			case 0 : System.out.println("Sunday") ;break;
			case 1 : System.out.println("Monday");break;
			case 2 : System.out.println("Tuesday");break;
			case 3 : System.out.println("Wednesday");break;
			case 4 : System.out.println("Thursday");break;
			case 5 : System.out.println("Friday");break;
			case 6 : System.out.println("Saturday");
			}
			switch (futureDay){
			case 0 : System.out.println("Sunday") ;break;
			case 1 : System.out.println("Monday");break;
			case 2 : System.out.println("Tuesday");break;
			case 3 : System.out.println("Wednesday");break;
			case 4 : System.out.println("Thursday");break;
			case 5 : System.out.println("Friday");break;
			case 6 : System.out.println("Saturday");
			}
		
	}
}
