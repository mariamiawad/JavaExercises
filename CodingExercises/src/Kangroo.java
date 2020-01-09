import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Kangroo {

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {
		int x = Math.min(x1+v1, v2+x2);
		int y =Math.max(x1+v1 ,x2+v2)/x;
		if (y<x)
			return "YES";
		else
			return "NO";
	}

	private static int GCD(int p, int q) {
		if (q == 0) {
			return p;
		}
		return GCD(q, p % q);
	}
//	 public static int lcm(int a, int b) {
//		 for(int i = 1; i <= b; i++) {
//			    if(i*a % b == 0)
//			        return abs(i*a);
//			}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

//        bufferedWriter.close();

		scanner.close();
	}
}
