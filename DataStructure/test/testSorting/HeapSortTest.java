package testSorting;

import org.junit.Test;

import sorting.ContextHeapSort;
import sorting.HeapSort;

public class HeapSortTest {


	@Test
	public void testQuickSortArrayOfInteger_RandomNumberBigSizeSortedArray_ReturnListOfIndexISmallerThanListOfIndexIPlusOne() {
		ContextHeapSort context = new ContextHeapSort(new HeapSort());
		Integer[] list = context.executeStrategySort();

		for (int i = 0; i < list.length - 1; i++) {
			assert (list[i] <=list[i + 1]);
		}
	}
	@Test
	public void testQuickSortArrayOfInteger_EmptyArray_ReturnSizeZero() {
		ContextHeapSort context = new ContextHeapSort(new HeapSort());
		Integer[] list = context.executeStrategySortEmpty();
		for (int i = 0; i < list.length-1; i++) {
			assert(list[i]<=list[i+1]);
		}
	}
	@Test
	public void testQuickSortArrayOfInteger_SortedArray_ReturnSizeZero() {
		ContextHeapSort context = new ContextHeapSort(new HeapSort());
		Integer[] list = context.executeStrategySortSortedArray();
		for (int i = 0; i < list.length-1; i++) {
			assert(list[i]<=list[i+1]);
		}
	}

	

	


}
