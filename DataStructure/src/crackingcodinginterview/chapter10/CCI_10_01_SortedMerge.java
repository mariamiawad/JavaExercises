package crackingcodinginterview.chapter10;

import java.util.Arrays;

import sorting.MergeSort;

public class CCI_10_01_SortedMerge<T extends Comparable<T>> {
	
	public void merge(T[] a, T[] b) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]== null) {
				a[i] = b[j];
				j++;
			}
		}
		MergeSort sort = new MergeSort();
		sort.sort(a);
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[9];
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 7;
		a[4] = 9;
		Integer[] b = {2, 4, 8, 10};
		
		System.out.println("First array is: " + Arrays.toString(a));
		System.out.println("Second array is: " + Arrays.toString(b));
		
		CCI_10_01_SortedMerge<Integer> cci= new CCI_10_01_SortedMerge<>();
		cci.merge(a, b);
		System.out.println("First array is: " + Arrays.toString(a));	// [1, 2, 3, 4, 5, 7, 8, 9, 10]
		System.out.println("Second array is: " + Arrays.toString(b));	// [2, 4, 8, 10]
		

	}

}