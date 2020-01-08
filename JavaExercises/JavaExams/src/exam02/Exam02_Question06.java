package exam02;

import java.util.Scanner;

public class Exam02_Question06 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int k = inputScanner.nextInt();
		int length = inputScanner.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = inputScanner.nextInt();
		}
		System.out.println(getKth(array, k));
	}

	private static int getKth(int[] array, int k){
		threeWayQuickSort(array);
		return array[k-1];
	}

	public static void threeWayQuickSort(int[] arr) {
		threeWayQuickSort(arr, 0, arr.length - 1);
	}

	private static void threeWayQuickSort(int[] array, int lo, int hi) {

		if (hi <= lo) {
			return;
		}
		int it = lo;
		int gt = hi;
		int v = array[lo];
		int i = lo + 1;
		while (i <= gt) {
			if (array[i] < v) {
				swap(array, it++, i++);
			} else if (array[i] > v) {
				swap(array, i, gt--);
			} else {
				i++;
			}
		}
		threeWayQuickSort(array, lo, it - 1);
		threeWayQuickSort(array, gt + 1, hi);
	}

	private static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
