import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendarCalculator {

	public GregorianCalendarCalculator() {
		// 
	}

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println(calendar.get(calendar.YEAR));
		System.out.println(calendar.get(calendar.MONTH));
		System.out.println(calendar.get(calendar.DAY_OF_MONTH));
		calendar.setTimeInMillis(1234567898765L);

		System.out.println(calendar.get(calendar.DAY_OF_MONTH) + " " + calendar.get(calendar.MONTH) + " "
				+ calendar.get(calendar.YEAR));
	}
}
