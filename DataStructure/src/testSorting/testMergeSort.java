package testSorting;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

import sorting.MergeSort;
import sorting.ShellSort;

public class testMergeSort {

	@Test
	public void testMergeSortArrayOfInteger_ReversedArray_ReturnAtIndexZeroOne() {
		Integer[] list = new Integer[10];
		int j = 0;
		for (int i = 10; i > 0; i--) {
			list[j] = i;
			j++;
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(list);
		assertEquals(Integer.valueOf(1), list[0]);
	}

	@Test
	public void testMergeSortArraytOfInteger_ReversedArray_ReturnAtIndexSevenEight() {
		Integer[] list = new Integer[10];
		int j = 0;
		for (int i = 10; i > 0; i--) {
			list[j] = i;
			j++;
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(list);
		assertEquals(Integer.valueOf(8), list[7]);
	}

	@Test
	public void testMergeSortArrayOfInteger_SortedArray_ReturnAtIndexZeroOne() {
		Integer[] list = new Integer[10];
		int j = 0;
		for (int i = 10; i > 0; i--) {
			list[j] = i;
			j++;
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(list);
		assertEquals(Integer.valueOf(1), list[0]);
	}

	@Test
	public void testMergeSortArrayOfInteger_RandomNumber_ReturnAtIndexSizeMinusOneOneThousand() {
		Integer[] list = new Integer[7];
		list[0] = 1000;
		list[1] = 6;
		list[2] = (52);
		list[3] = (9);
		list[4] = (11);
		list[5] = (4);
		list[6] = 1;
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(list);
		assertEquals(Integer.valueOf(1000), list[list.length - 1]);
	}

	@Test(expected = NoSuchElementException.class)
	public void testMergeSortArrayOfInteger_EmptyArray_ReturnNoSuchElementException() {
		Integer[] list = new Integer[9];
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(list);
	}

	@Test
	public void testMergeSortArrayOfInteger_ReversedArrayOfTwenty_ReturnAtIndexZeroOne() {
		Integer[] list = new Integer[20];
		int j = 0;
		for (int i = 20; i > 0; i--) {
			list[j] = i;
			j++;
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(list);
		assertEquals(Integer.valueOf(1), list[0]);
	}

	@Test
	public void testMergeSortArraytOfInteger_ReversedArrayTwenty_ReturnAtIndexSevenEight() {
		Integer[] list = new Integer[20];
		int j = 0;
		for (int i = 20; i > 0; i--) {
			list[j] = i;
			j++;
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(list);
		assertEquals(Integer.valueOf(8), list[7]);
	}

	@Test
	public void testMergeSortArrayOfInteger_SortedArrayofTwenty_ReturnAtIndexZeroOne() {
		Integer[] list = new Integer[20];
		int j = 0;
		for (int i = 20; i > 0; i--) {
			list[j] = i;
			j++;
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(list);
		assertEquals(Integer.valueOf(1), list[0]);
	}

}
