import java.util.*;
public class CurrentTime {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT:");
		int offset = input.nextInt();
		long currentMilliSeconds = System.currentTimeMillis();
		long totalSeconds= currentMilliSeconds/1000;
		long totalMinutes = totalSeconds/60;
		long totalHours = totalMinutes/60;
		long currentSeconds = totalSeconds%60;
		long currentMinutes = totalMinutes%60;
		long currentHours = totalHours%24;
		currentHours= currentHours+offset;
		System.out.println("The current time is"+ currentHours + ":" 
		+currentMinutes+ ":"+currentSeconds);
	
	}
}