import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Test<E extends Object> {
	public static void main(String[] args) {
		System.out.println(solution("Sat", 23));
	}

	public static String solution(String S, int K) {
		int total = K + getNumber(S);
		if (total % 7 == 0) {
			return "Mon";
		} else if (total % 7 == 1) {
			return "Tue";
		} else if (total % 7 == 2) {
			return "Wed";
		} else if (total % 7 == 3) {
			return "Thu";
		} else if (total % 7 == 4) {
			return "Fri";
		} else if (total % 7 == 5) {
			return "Sat";
		} else if (total % 7 == 6) {
			return "Sun";
		}
		return null;
	}

	public static int getNumber(String S) {
		int number = 0;
		if (S.equalsIgnoreCase("Mon")) {
			number = 0;
		} else if (S.equalsIgnoreCase("Tue")) {
			number = 1;
		} else if (S.equalsIgnoreCase("Wed")) {
			number = 2;
		} else if (S.equalsIgnoreCase("Thu")) {
			number = 3;
		} else if (S.equalsIgnoreCase("Fri")) {
			number = 4;
		} else if (S.equalsIgnoreCase("Sat")) {
			number = 5;
		} else if (S.equalsIgnoreCase("Sun")) {
			number = 6;
		}
		return number;

	}

}