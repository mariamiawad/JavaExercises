package chapter23;

import java.util.Comparator;

public class Exercise_23_01 {
	/** Bubble sort method */
	public static void bubbleSort(int[] list) {
		boolean needNextPass = true;
		for (int k = 1; k < list.length && needNextPass; k++) {
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				if (list[i] > list[i + 1]) {
					// Swap list[i] with list[i + 1]
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNextPass = true;
				}
			}
		}
	}

	public static <E extends Comparable<E>> void bubbleSort(E[] list) {
		boolean needNExtPass = true;
		for (int i = 1; i < list.length && needNExtPass; i++) {
			needNExtPass = false;
			for (int j = 0; j < list.length - i; j++) {
				if (list[i].compareTo(list[i + 1]) > 0) {
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNExtPass = true;
				}
			}
		}
	}

	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
		boolean needNextPass = true;
		for (int i = 1; i < list.length && needNextPass; i++) {
			needNextPass = false;
			for (int j = 0; j < list.length - i; j++) {
				if (comparator.compare(list[i], list[i + 1]) > 0) {
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNextPass = true;

				}
			}
		}
	}

}