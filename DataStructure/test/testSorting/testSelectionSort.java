package testSorting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;

import sorting.SelectionSort;

public class testSelectionSort {

	@Test
	public void testSelectionSortListOfInteger_ReversedList_ReturnAtIndexZeroOne() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
		assertEquals(Integer.valueOf(1),list.get(0));
	}
	@Test
	public void testSelectionSortListOfInteger_ReversedList_ReturnAtIndexSevenEight() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
		assertEquals(Integer.valueOf(8),list.get(7));
	}
	@Test
	public void testSelectionSortListOfInteger_SortedList_ReturnAtIndexZeroOne() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <11; i++) {
			list.add(i);
		}
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
		assertEquals(Integer.valueOf(1),list.get(0));
	}
	@Test
	public void testSelectionSortListOfInteger_SortedList_ReturnAtIndexEight() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <11; i++) {
			list.add(i);
		}
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
		assertEquals(Integer.valueOf(8),list.get(7));
	}
	@Test
	public void testSelectionSortListOfInteger_RandomNumber_ReturnAtIndexSizeMinusOneOneThousand() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(100);
		list.add(52);
		list.add(9);
		list.add(11);
		list.add(1);
		list.add(1000);
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
		assertEquals(Integer.valueOf(1000),list.get(list.size()-1));
	}
	@Test(expected = NoSuchElementException.class)
	public void testSelectionSortListOfInteger_EmptyList_ReturnNoSuchElementException() {
		List<Integer> list = new ArrayList<Integer>();
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
	}

	@Test
	public void testSelectionSortArrayOfInteger_ReversedArray_ReturnAtIndexZeroOne() {
		Integer [] list = new Integer[10];
		int j =0;
		for (int i = 10; i > 0; i--) {
			list[j] = i ;
			j++;
		}
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
		assertEquals(Integer.valueOf(1),list[0]);
	}
	@Test
	public void testSelectionSortArraytOfInteger_ReversedArray_ReturnAtIndexSevenEight() {
		Integer [] list = new Integer[10];
		int j =0;
		for (int i = 10; i > 0; i--) {
			list[j] = i ;
			j++;
		}
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
		assertEquals(Integer.valueOf(8),list[7]);
	}
	@Test
	public void testSelectionSortArrayOfInteger_SortedArray_ReturnAtIndexZeroOne() {
		Integer [] list = new Integer[10];
		int j =0;
		for (int i = 10; i > 0; i--) {
			list[j] = i ;
			j++;
		}
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
		assertEquals(Integer.valueOf(1),list[0]);
	}
	@Test
	public void testSelectionSortArrayOfInteger_SortedArray_ReturnAtIndexEight() {
		Integer [] list = new Integer[10];
		for (int i = 0; i <10; i++) {
			list[i] = i +1 ;
		}
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
		assertEquals(Integer.valueOf(8),list[7]);
	}
	@Test
	public void testSelectionSortArrayOfInteger_RandomNumber_ReturnAtIndexSizeMinusOneOneThousand() {
		Integer [] list = new Integer[7];
		list[0]=1000;
		list[1]= 6;
		list[2]=(52);
		list[3]=(9);
		list[4]=(11);
		list[5]=(4);
		list[6]=  1;
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
		assertEquals(Integer.valueOf(1000),list[list.length-1]);
	}
	@Test(expected = NoSuchElementException.class)
	public void testSelectionSortArrayOfInteger_EmptyArray_ReturnNoSuchElementException() {
		Integer [] list = new Integer[9];
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.selectionSort(list);
	}

}
