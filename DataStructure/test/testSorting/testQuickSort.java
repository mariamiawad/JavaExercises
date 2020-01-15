package testSorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sorting.ContextQuickSort;
import sorting.QuickSort;

public class testQuickSort {

	@Test
	public void testQuickSortArrayOfInteger_RandomNumberBigSizeSortedArray_ReturnListOfIndexISmallerThanListOfIndexIPlusOne() {
		ContextQuickSort context = new ContextQuickSort(new QuickSort());
		Integer[] list = context.executeStrategySort();

		for (int i = 0; i < list.length - 1; i++) {
			assert (list[i] <=list[i + 1]);
		}
	}
	@Test
	public void testQuickSortArrayOfInteger_EmptyArray_ReturnSizeZero() {
		ContextQuickSort context = new ContextQuickSort(new QuickSort());
		Integer[] list = context.executeStrategySortEmpty();
		for (int i = 0; i < list.length-1; i++) {
			assert(list[i]<=list[i+1]);
		}
	}
	@Test
	public void testQuickSortArrayOfInteger_SortedArray_ReturnSizeZero() {
		ContextQuickSort context = new ContextQuickSort(new QuickSort());
		Integer[] list = context.executeStrategySortSortedArray();
		for (int i = 0; i < list.length-1; i++) {
			assert(list[i]<=list[i+1]);
		}
	}

	

	

}
