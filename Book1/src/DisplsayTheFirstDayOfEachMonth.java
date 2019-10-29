import java.time.YearMonth;
import java.util.Scanner;

public class DisplsayTheFirstDayOfEachMonth {

	public DisplsayTheFirstDayOfEachMonth() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter year");
		int year = inputScanner.nextInt();
		System.out.println("Enter day ");
		int day = inputScanner.nextInt();

		for (int i = 1; i <= 12; i++) {
			
		
			YearMonth yearMonth = YearMonth.of(year, i);
			if (i == 1) {
				System.out.print("January 1, " + yearMonth.getYear() + " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			else if (i == 2) {
				System.out.print("February 1," + yearMonth.getYear() + " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			else if (i == 3) {
				System.out.print("March 1," + yearMonth.getYear() + " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			else if (i == 4) {
				System.out.print("April 1," + yearMonth.getYear() + " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			
			else if (i == 5) {
				System.out.print("May 1," + yearMonth.getYear() + " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			else if (i == 6) {
				System.out.print("June 1," + yearMonth.getYear() + " is");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			else if (i == 7) {
				System.out.print("July 1," + yearMonth.getYear() + " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			else if (i == 8) {
				System.out.print("August 1," + yearMonth.getYear()+ " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			else if (i == 9) {
				System.out.print("September 1," + yearMonth.getYear() + " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			else if (i == 10) {
				System.out.print("October 1," + yearMonth.getYear() + " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			else if (i == 11) {
				System.out.print("November 1," + yearMonth.getYear() + " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}
			else if (i == 12) {
				System.out.print("December 1," + yearMonth.getYear() + " is ");
				System.out.println(yearMonth.atDay(1).getDayOfWeek().name());
			}

	}
	}
	
}

