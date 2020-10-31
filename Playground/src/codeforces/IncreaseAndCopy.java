package codeforces;

import java.math.BigInteger;
import java.util.Scanner;
//https://codeforces.com/problemset/problem/1426/C
public class IncreaseAndCopy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			double m =  Math.sqrt(n);
			int x1 = (int) m;
			int x2 = (int) (m-1);
			int x3 = (int) (m-2);
			int y1 = (int) (x1-1+Math.ceil((double)n/x1-1));
//			int y2 =(int) (x2-1+Math.ceil((double)n/x2-1));
//			int y3 =(int) (x3-1+Math.ceil((double)n/x3-1));
			
			System.out.println(y1);
			
			
		}
	}
}
