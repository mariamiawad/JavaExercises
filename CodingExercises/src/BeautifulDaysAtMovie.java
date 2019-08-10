import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDaysAtMovie {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
    	int daysCount = 0;
    	for (int l = i; l < j; l++) {
        	int reversed = 0;
        	int number =l;
    		while(number != 0 ) {
                int digit = (number) % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
    		if(Math.abs(reversed-l)*1.0%k==0) {
    			daysCount++;
    		}
		}
    	return daysCount;
    	 
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);
System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
