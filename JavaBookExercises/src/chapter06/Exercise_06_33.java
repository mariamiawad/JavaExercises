package chapter06;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise_06_33 {

	public Exercise_06_33() {
	}
	public static void main(String[] args) {
		long milliSeconds = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");    
		Date resultdate = new Date(milliSeconds);
		System.out.println("Current date and time is " +sdf.format(resultdate));
	}

}
