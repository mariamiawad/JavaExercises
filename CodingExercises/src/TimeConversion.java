import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    	String hours = s.substring(0, 2);
    	int hour = 0;
        if(s.contains("PM")&&!s.contains("12")){
        	hour = Integer.parseInt(hours) + 12;
        	s =s.replace(hours, String.valueOf(hour));
        	s= s.replace("PM", "");
        	
        	
        }
        else if( s.contains("PM")) {
        	s = s.replace("PM", "");
        }
        else if (s.contains("AM")&&s.substring(0,2).equalsIgnoreCase("12")) {
        	s = s.replace("12", "00");
        	
        	s = s.replace("AM", "");
        }
        else if (s.contains("AM")) {
        	
        	s = s.replace("AM", "");
        }
        return s;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
System.out.println(result);
//        bw.write(result);
//        bw.newLine();

//        bw.close();
    }
}
