package chapter23;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise_23_03<E> {

	private <E extends Comparable<E>> void quickSort(E[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private <E extends Comparable<E>> void quickSort(E[] array, int low, int high) {
		if (low < high) {
			int partition = partition(array, low, high);
			quickSort(array, low, partition - 1);
			quickSort(array, partition + 1, high);
		}
	}

	private <E extends Comparable<E>> int partition(E[] arr, int low, int high) {
		E pivot = arr[high];
		int i = low - 1;
		for (int j = low; j <= high - 1; j++) {

			if (arr[j].compareTo(pivot) < 0) {
				i++;
				swap(arr, i, j);
			}

		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	private <E extends Comparable<E>> void swap(E[] arr, int i, int j) {
		E temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public <E> void quickSort(E[] arr, Comparator<? super E> comparator) {
		quickSort(arr, comparator, 0, arr.length - 1);
	}

	public <E> void quickSort(E[] arr, Comparator<E> comparator, int low, int high) {
		if (low < high) {
			int partition = partition(arr, low, high, comparator);
			quickSort(arr, comparator,low,partition-1);
			quickSort(arr, comparator,partition+1, high);
		}
	}

	private <E> int partition(E[] arr, int low, int high, Comparator<E> comparator) {

		E pivot = arr[high];
		int i = low - 1;
		for (int j = low; j <= high - 1; j++) {

			if (comparator.compare(arr[j], pivot) < 0) {
				i++;
				swap(arr, i, j);
			}

		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	private <E> void swap(E[] arr, int i, int j) {
		E temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void main(String[] args) {
		Integer[] array = { 2, 5, 4, 3, 1 };
		Exercise_23_03<Integer> exercise_23_03 = new Exercise_23_03<Integer>();
		exercise_23_03.quickSort(array);
		System.out.println(Arrays.toString(array));
		Integer[] integers = { 20, 80, 50, 40, 20 };
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		exercise_23_03.quickSort(integers, comparator, 0, integers.length-1);
		System.out.println(Arrays.toString(integers));
	}
}
