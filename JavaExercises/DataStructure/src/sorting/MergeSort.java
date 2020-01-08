package sorting;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class MergeSort {
	public <T extends Comparable<T>> void sort(T[] arr) {

		if (arr.length == 0) {
			throw new NoSuchElementException();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				throw new NoSuchElementException();
			}
		}
		T[] aux = (T[]) Array.newInstance(arr[0].getClass(), arr.length);
		sort(arr, aux, 0, arr.length - 1);

	}

	private <T extends Comparable<T>> void sort(T[] arr, T[] aux, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			sort(arr,aux, low, mid);
			sort(arr, aux, mid + 1, high);
			merge(arr,aux, low, mid, high);
		}
	}

	private <T extends Comparable<T>> void merge(T[] arr, T[] aux, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= high) {
			if (arr[i].compareTo(arr[j]) <= 0) {
				aux[k] = arr[i];
				i++;
				k++;
			} else {
				aux[k] = arr[j];
				j++;
				k++;
			}
		}
		while (i <= mid) {
			aux[k] = arr[i];
			i++;
			k++;
		}
		while (j <= high) {
			aux[k] = arr[j];
			k++;
			j++;
		}
		for (i = low; i<= high; i++) {
			arr[i] = aux[i - low];
		}
	}
}
