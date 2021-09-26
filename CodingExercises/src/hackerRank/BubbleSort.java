package hackerRank;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
	public static void countSwaps(List<Integer> a) {
		// Write your code here
		int n = a.size();
		int swap = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a.get(j) > a.get(j + 1)) {
					swap(a, j, j + 1);
					swap++;
				}
			}
		}
		System.out.println("Array is sorted in "+ swap + " swaps.");
		System.out.println("First Element: "+ a.get(0));
		System.out.println("Last Element: "+ a.get(a.size()-1));
	}

	public static void swap(List<Integer> a, int i, int j) {
		int temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
	}

}
