package testSorting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;

import sorting.InsertionSort;

public class testInsertionSort {


	@Test
	public void testInsertionSortListOfInteger_ReversedList_ReturnAtIndexZeroOne() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
		assertEquals(Integer.valueOf(1),list.get(0));
	}
	@Test
	public void testInsertionSortListOfInteger_ReversedList_ReturnAtIndexSevenEight() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
		assertEquals(Integer.valueOf(8),list.get(7));
	}
	@Test
	public void testInsertionSortListOfInteger_SortedList_ReturnAtIndexZeroOne() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <11; i++) {
			list.add(i);
		}
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
		assertEquals(Integer.valueOf(1),list.get(0));
	}
	@Test
	public void testInsertionSortListOfInteger_SortedList_ReturnAtIndexEight() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <11; i++) {
			list.add(i);
		}
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
		assertEquals(Integer.valueOf(8),list.get(7));
	}
	@Test
	public void testInsertionSortListOfInteger_RandomNumber_ReturnAtIndexSizeMinusOneOneThousand() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(100);
		list.add(52);
		list.add(9);
		list.add(11);
		list.add(1);
		list.add(1000);
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
		assertEquals(Integer.valueOf(1000),list.get(list.size()-1));
	}
	@Test(expected = NoSuchElementException.class)
	public void testInsertionSortListOfInteger_EmptyList_ReturnNoSuchElementException() {
		List<Integer> list = new ArrayList<Integer>();
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
	}

	@Test
	public void testInsertionSortArrayOfInteger_ReversedArray_ReturnAtIndexZeroOne() {
		Integer [] list = new Integer[10];
		int j =0;
		for (int i = 10; i > 0; i--) {
			list[j] = i ;
			j++;
		}
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
		assertEquals(Integer.valueOf(1),list[0]);
	}
	@Test
	public void testInsertionSortArraytOfInteger_ReversedArray_ReturnAtIndexSevenEight() {
		Integer [] list = new Integer[10];
		int j =0;
		for (int i = 10; i > 0; i--) {
			list[j] = i ;
			j++;
		}
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
		assertEquals(Integer.valueOf(8),list[7]);
	}
	@Test
	public void testInsertionSortArrayOfInteger_SortedArray_ReturnAtIndexZeroOne() {
		Integer [] list = new Integer[10];
		int j =0;
		for (int i = 10; i > 0; i--) {
			list[j] = i ;
			j++;
		}
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
		assertEquals(Integer.valueOf(1),list[0]);
	}
	@Test
	public void testInsertionSortArrayOfInteger_SortedArray_ReturnAtIndexEight() {
		Integer [] list = new Integer[10];
		for (int i = 0; i <10; i++) {
			list[i] = i +1 ;
		}
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
		assertEquals(Integer.valueOf(8),list[7]);
	}
	@Test
	public void testInsertionSortArrayOfInteger_RandomNumber_ReturnAtIndexSizeMinusOneOneThousand() {
		Integer [] list = new Integer[7];
		list[0]=1000;
		list[1]= 6;
		list[2]=(52);
		list[3]=(9);
		list[4]=(11);
		list[5]=(4);
		list[6]=  1;
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
		assertEquals(Integer.valueOf(1000),list[list.length-1]);
	}
	@Test(expected = NoSuchElementException.class)
	public void testInsertionSortArrayOfInteger_EmptyArray_ReturnNoSuchElementException() {
		Integer [] list = new Integer[9];
		InsertionSort<Integer> InsertionSort = new InsertionSort<>();
		InsertionSort.insertionSort(list);
	}


}
