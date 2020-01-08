import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StarHash {

    // Complete the staircase function below.
    static void staircase(int n) {
    	for (int row = 0; row <= n; row++) {
    		for (int column = n; column >= n; column--) {
    			System.out.print(" ");
				
			}
    		System.out.println("#");
			
		}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
