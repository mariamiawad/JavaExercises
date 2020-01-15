package testSorting;

import static org.junit.Assert.*;

import org.junit.Test;

import sorting.ContextQuickSort;
import sorting.ContextQuickSortWithShuffle;
import sorting.QuickSort;
import sorting.QuickSortWithShuffle;

public class QuickSortWithShuffleTest {

	@Test
	public void testQuickSortArrayOfInteger_RandomNumberBigSizeSortedArray_ReturnListOfIndexISmallerThanListOfIndexIPlusOne() {
		ContextQuickSortWithShuffle context = new ContextQuickSortWithShuffle(new QuickSortWithShuffle());
		Integer[] list = context.executeStrategySort();

		for (int i = 0; i < list.length - 1; i++) {
			assert (list[i] <=list[i + 1]);
		}
	}
	@Test
	public void testQuickSortArrayOfInteger_EmptyArray_ReturnSizeZero() {
		ContextQuickSortWithShuffle context = new ContextQuickSortWithShuffle(new QuickSortWithShuffle());
		Integer[] list = context.executeStrategySortEmpty();
		for (int i = 0; i < list.length-1; i++) {
			assert(list[i]<=list[i+1]);
		}
	}
	@Test
	public void testQuickSortArrayOfInteger_SortedArray_ReturnSizeZero() {
		ContextQuickSortWithShuffle context = new ContextQuickSortWithShuffle(new QuickSortWithShuffle());
		Integer[] list = context.executeStrategySortSortedArray();
		for (int i = 0; i < list.length-1; i++) {
			assert(list[i]<=list[i+1]);
		}
	}

	

	

}
