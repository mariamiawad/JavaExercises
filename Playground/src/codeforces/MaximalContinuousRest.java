package codeforces;

import java.util.Scanner;

public class MaximalContinuousRest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean flag = true;
		int firstOnes = 0;
		int lastOnes = 0;
		int count = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			if (flag && num == 1) {
				firstOnes++;
			} else {
				flag = false;
			}
			if (num == 1) {
				lastOnes++;
			} else {
				lastOnes = 0;
			}
			if (num == 1) {
				count++;
				if (max < count) {
					max = count;
				}

			} else {
				count = 0;
			}
		}
		System.out.println(Math.max(max, firstOnes + lastOnes));
		scanner.close();
	}
	
}
