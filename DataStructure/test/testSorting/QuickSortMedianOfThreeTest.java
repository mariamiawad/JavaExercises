package testSorting;

import org.junit.Test;

import sorting.ContextQuickSortMedianOfThree;
import sorting.QuickSortMedianOfThree;

public class QuickSortMedianOfThreeTest {

	@Test
	public void testQuickSortArrayOfInteger_RandomNumberBigSizeSortedArray_ReturnListOfIndexISmallerThanListOfIndexIPlusOne() {
		ContextQuickSortMedianOfThree context = new ContextQuickSortMedianOfThree(new QuickSortMedianOfThree());
		Integer[] list = context.executeStrategySort();

		for (int i = 0; i < list.length - 1; i++) {
			assert (list[i] <=list[i + 1]);
		}
	}
	@Test
	public void testQuickSortArrayOfInteger_EmptyArray_ReturnSizeZero() {
		ContextQuickSortMedianOfThree context = new ContextQuickSortMedianOfThree(new QuickSortMedianOfThree());
		Integer[] list = context.executeStrategySortEmpty();
		for (int i = 0; i < list.length-1; i++) {
			assert(list[i]<=list[i+1]);
		}
	}
	@Test
	public void testQuickSortArrayOfInteger_SortedArray_ReturnSizeZero() {
		ContextQuickSortMedianOfThree context = new ContextQuickSortMedianOfThree(new QuickSortMedianOfThree());
		Integer[] list = context.executeStrategySortSortedArray();
		for (int i = 0; i < list.length-1; i++) {
			assert(list[i]<=list[i+1]);
		}
	}

	

	

}
