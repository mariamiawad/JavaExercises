package chapter23;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Exercise_23_02 {
	public <E extends Comparable<E>> void mergeSort(E[] list) {
		mergeSort(list, 0, list.length - 1);
	}

	private <E extends Comparable<E>> void mergeSort(E[] arr, int left, int right) {
		if (left < right) {
			int middle = left + (right - left) / 2;
			mergeSort(arr, left, middle);
			mergeSort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}

	}

	private <E extends Comparable<E>> void merge(E[] arr, int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;
		E[] lefts = (E[]) Array.newInstance(arr[0].getClass(), n1);
		E[] rights = (E[]) Array.newInstance(arr[0].getClass(), n2);

		for (int i = 0; i < n1; i++) {
			lefts[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			rights[j] = arr[middle + 1 + j];
		}
		int i = 0;
		int j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (lefts[i].compareTo(rights[j]) <= 0) {
				arr[k] = lefts[i];
				i++;
			} else {
				arr[k] = rights[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = lefts[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = rights[j];
			j++;
			k++;
		}

	}

	/*-------------------------------------------------------------------------------------------------------*/
	public <E> void mergeSort(E[] list, Comparator<? super E> comparator) {
		mergeSort(list, comparator, 0, list.length-1);
	}

	public <E> void mergeSort(E[] list, Comparator<? super E> comparator, int left, int right) {
		if (left < right) {
			int middle = left + (right - left) / 2;
			mergeSort(list, comparator, left, middle);
			mergeSort(list, comparator, middle + 1, right);
			merge(list, comparator, left, middle, right);
		}
	}

	private <E> void merge(E[] list, Comparator<E> comparator, int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;
		E[] lefts = (E[]) Array.newInstance(list[0].getClass(), n1);
		E[] rights = (E[]) Array.newInstance(list[0].getClass(), n2);
		for (int i = 0; i < lefts.length; i++) {
			lefts[i] = list[left + i];
		}
		for (int j = 0; j < rights.length; j++) {
			rights[j] = list[middle + 1 + j];
		}
		int i =0;
		int j = 0;
		int k = left;
		while (i<lefts.length && j < rights.length) {
			if (comparator.compare(lefts[i], rights[j])<=0) {
				list[k] = lefts[i];
				i++;
			}
			else {
				list[k] = rights[j];
				j++;
			}
			k++;
		}
		while (i<lefts.length) {
			list[k] = lefts[i];
			i++;
			k++;
		}
		while (j< rights.length) {
			list[k] = rights[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 4, 3, 5, 8, 1, 7 };
		Exercise_23_02 exercise_23_02 = new Exercise_23_02();
		exercise_23_02.mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		Integer [] integers = { 20, 80, 50, 40, 20 };
		exercise_23_02.mergeSort(integers, comparator);
		System.out.println(Arrays.toString(integers));
	}

}
