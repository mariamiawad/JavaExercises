import java.time.DayOfWeek;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DisplayCalendar {

	public DisplayCalendar() {
		// 
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter year");
		int year = inputScanner.nextInt();
		System.out.println("Enter day ");
		int day = inputScanner.nextInt();
		for (int i = 1; i <= 12; i++) {
			Calendar calendar = new GregorianCalendar();
			YearMonth yearMonth = YearMonth.of(year, i);

			System.out.println("          " + yearMonth.getMonth().name() + " " + yearMonth.getYear());
			System.out.println("----------------------------------");
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");

			if (yearMonth.atDay(1).getDayOfWeek() == DayOfWeek.MONDAY) {
				System.out.print("     ");
			} else if (yearMonth.atDay(1).getDayOfWeek() == DayOfWeek.TUESDAY) {
				System.out.print("        ");
			} else if (yearMonth.atDay(1).getDayOfWeek() == DayOfWeek.WEDNESDAY) {
				System.out.print("             ");
			} else if (yearMonth.atDay(1).getDayOfWeek() == DayOfWeek.THURSDAY) {
				System.out.print("                 ");
			} else if (yearMonth.atDay(1).getDayOfWeek() == DayOfWeek.FRIDAY) {
				System.out.print("                     ");
			} else if (yearMonth.atDay(1).getDayOfWeek() == DayOfWeek.SATURDAY) {
				System.out.print("                        ");
			}
			for (int j = 1; j <= yearMonth.lengthOfMonth(); j++) {
				if (yearMonth.atDay(j).getDayOfWeek() == DayOfWeek.SUNDAY && j != 1) {
					
					System.out.println();
					 if(j <10 ) {
					System.out.print(yearMonth.atDay(j).getDayOfMonth() + "   ");
					 }
					 else {
						 System.out.print(yearMonth.atDay(j).getDayOfMonth() + "  ");
					 }
				}
				else if(j <10 ) {
				System.out.print(yearMonth.atDay(j).getDayOfMonth() + "   ");
				}
				else {
					System.out.print(yearMonth.atDay(j).getDayOfMonth() + "  ");
				}
			}

			System.out.println();
		}

	}

	public static void getNameOfDay(int day) {
		if (day == 1) {
			System.out.println("");

		}
	}
}
