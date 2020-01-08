import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	BigDecimal min = new BigDecimal(arr[0]);
    	BigDecimal max=BigDecimal.ZERO;
    	for (int i = 0; i < arr.length; i++) {
			if(max.compareTo(new BigDecimal(arr[i]))<0) {
				max = new BigDecimal(arr[i]);
			}
			if(min.compareTo(new BigDecimal(arr[i]))>0) {
				min = new BigDecimal(arr[i]);
			}
		}
    	BigDecimal sum =BigDecimal.ZERO;
    	for (int i = 0; i < arr.length; i++) {
			sum = sum.add(new BigDecimal(arr[i]));
		}
    	System.out.println(sum.subtract(max));
    	System.out.println(sum.subtract(min));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
