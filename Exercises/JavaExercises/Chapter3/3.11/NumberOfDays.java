import java.util.*;
public class NumberOfDays{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Month");
		int month = input.nextInt();
		System.out.println("Enter Year");
		int year = input.nextInt();
		int nameOfMonth = month;
		boolean leapYear = ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
		switch(nameOfMonth){
			case 1 : System.out.println("January had 31 days in this year");  break;
			case 2: System.out.println("February  had" +
					  ((leapYear) ? " 29 days  in this year" : " 28 days in this year")); break;
			case 3 : System.out.println("March had 31 days in this year"); break;
			case 4 : System.out.println("April had 30 days in this year"); break;
			case 5 : System.out.println("May had 31 days in this year"); break;
			case 6 : System.out.println("June had 30 days in this year"); break;
			case 7 : System.out.println("July had 31 days in this year"); break;
			case 8 : System.out.println("August had 31 days in this year"); break;
			case 9 : System.out.println("September had 30 days in this year"); break;
			case 10 : System.out.println("October had 31 days in this year"); break;
			case 11 : System.out.println("November had 30 days in this year"); break;
			case 12 : System.out.println("December had 31 days in this year");
		}
	}
}