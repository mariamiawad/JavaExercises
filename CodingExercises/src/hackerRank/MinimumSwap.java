package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwap {

	public static int bubbleSort(int array[]) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - i - 1; j++)
				if (array[j] > array[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					count++;
				}
		return count;
	}

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {

		return bubbleSort(arr);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(minimumSwaps(array));

	}
}
