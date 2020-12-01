package codeforces;

import java.util.Scanner;

public class Inbox {

	public static void main(String[] args) {
		// 0 1 0 1 0 // next;
		// 1 1 0 0 1 // back to inbox;
		// 1 1 1 0 0 // next
		// 0 1 1 1 0// next
		// 1 0 0 0 1 back to inbox
		// 1 1 1 1 1 next ;
		// 0 1 1 1 1 1
		// 1 1 0 1 1 1
		// 0 1 1 1 0 1 1 1 0 0 1 1 1
		// 1 0 0 0 1
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();

		}
		int i = 0;
		for (i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				break;
			}

		}
		for (; i < array.length; i++) {
			if (array[i] == 1 || (i != array.length - 1 && array[i] == 0 && array[i + 1] == 1)) {
				count++;

			}
		}
		System.out.println(count);
	}

}
