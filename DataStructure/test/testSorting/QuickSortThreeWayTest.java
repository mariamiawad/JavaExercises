package testSorting;

import static org.junit.Assert.*;

import org.junit.Test;

import sorting.ContextQuickSortThreeWay;
import sorting.ContextQuickSortWithShuffle;
import sorting.QuickSortThreeWay;
import sorting.QuickSortWithShuffle;

public class QuickSortThreeWayTest {

	@Test
	public void testQuickSortArrayOfInteger_RandomNumberBigSizeSortedArray_ReturnListOfIndexISmallerThanListOfIndexIPlusOne() {
		ContextQuickSortThreeWay context = new ContextQuickSortThreeWay(new QuickSortThreeWay());
		Integer[] list = context.executeStrategySort();

		for (int i = 0; i < list.length - 1; i++) {
			assert (list[i] <=list[i + 1]);
		}
	}
	@Test
	public void testQuickSortArrayOfInteger_EmptyArray_ReturnSizeZero() {
		ContextQuickSortThreeWay context = new ContextQuickSortThreeWay(new QuickSortThreeWay());
		Integer[] list = context.executeStrategySortEmpty();
		for (int i = 0; i < list.length-1; i++) {
			assert(list[i]<=list[i+1]);
		}
	}
	@Test
	public void testQuickSortArrayOfInteger_SortedArray_ReturnSizeZero() {
		ContextQuickSortThreeWay context = new ContextQuickSortThreeWay(new QuickSortThreeWay());
		Integer[] list = context.executeStrategySortSortedArray();
		for (int i = 0; i < list.length-1; i++) {
			assert(list[i]<=list[i+1]);
		}
	}

	

	

}
