package codeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class KthBeautifulString {

	public static int numberOfA(int n, int k) {
		if (n > k) {
			k = n / k;
		}
		char[] chars = new char[n];
		int i = n-k;
		int j = k;
		for (int j2 = 0; j2 < chars.length; j2++) {
			chars[j2]='a';
			
		}
		return 0;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		for (int j = 0; j < t; j++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			ArrayList<String> arrayList = print_string(n, k);
			System.out.println(arrayList.get(k));
		}
	}
}