import java.sql.Timestamp;
import java.time.Year;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DaysOfTheMonth {

	public DaysOfTheMonth() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year");
		int year = input.nextInt();
		System.out.println("Enter month");
		String month = input.next();
		boolean isLeap = Year.isLeap(year);
		
		switch (month) {
		case "Jan":
			System.out.println(month + " " + year + " has 31 days" );
			
			break;
			case "Feb" :
				if (isLeap) {
					System.out.println(month + " " + year + " has 29 days" );
				}
				else {
					System.out.println(month + " " + year + " has 28 days" );
				}
				break;
			case "Mar":
				System.out.println(month + " " + year + " has 31 days" );
				
				break;	
			case "Apr":
				System.out.println(month + " " + year + " has 30 days" );
				
				break;
			case "May":
				System.out.println(month + " " + year + " has 31 days" );
				
				break;
			case "Jun":
				System.out.println(month + " " + year + " has 30 days" );
				
				break;
			case "Jul":
				System.out.println(month + " " + year + " has 31 days" );
				
				break;
			case "Aug":
				System.out.println(month + " " + year + " has 31 days" );
				
				break;
			case "Sep":
				System.out.println(month + " " + year + " has 30 days" );
				
				break;
			case "Oct":
				System.out.println(month + " " + year + " has 31 days" );
				
				break;
			case "Nov":
				System.out.println(month + " " + year + " has 30 days" );
				
				break;
			case "Dec":
				System.out.println(month + " " + year + " has 31 days" );
				
				break;
		default:
			System.out.println("Not Valid Month");
			break;
		}
	}

}
