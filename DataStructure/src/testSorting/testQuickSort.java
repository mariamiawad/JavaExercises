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
			assert (list[i] <= list[i + 1]);
		}
	}

	public void testQuickSortArrayOfInteger_EmptyArray_ReturnSizeZero() {
		ContextQuickSort context = new ContextQuickSort(new QuickSort());
		Integer[] list = context.executeStrategySortEmpty();
		assertEquals(0, list.length);
	}

	@Test
	public void testQuickSortWithShuffleArrayOfInteger_RandomNumber_ReturnListOfIndexISmallerThanListOfIndexIPlusOne() {
		ContextQuickSort context = new ContextQuickSort(new QuickSort());
		Integer[] list = context.executeStrategySortWithSuffleSortedArray();
		for (int i = 0; i < list.length - 1; i++) {
			assert (list[i] <= list[i + 1]);
		}
	}

	@Test
	public void testQuickSorWithShuffletArrayOfInteger_RandomNumberBigSizeSortedArray_ReturnListOfIndexISmallerThanListOfIndexIPlusOne() {
		ContextQuickSort context = new ContextQuickSort(new QuickSort());
		Integer[] list = context.executeStrategySortWithSuffleSortedArray();
		for (int i = 0; i < list.length - 1; i++) {
			assert (list[i] <= list[i + 1]);
		}
	}

	public void testQuickSortWithShuffleArrayOfInteger_EmptyArray_ReturnNoSuchElementException() {
		ContextQuickSort context = new ContextQuickSort(new QuickSort());
		Integer[] list = context.executeStrategySortWithSuffleEmpty();
		assertEquals(0, list.length);
	}

	@Test
	public void testQuickSortMedianOfThreeArrayOfInteger_RandomNumber_ReturnListOfIndexISmallerThanListOfIndexIPlusOne() {

		ContextQuickSort context = new ContextQuickSort(new QuickSort());
		Integer[] list = context.executeStrategySortMedianOfThree();
		for (int i = 0; i < list.length - 1; i++) {
			assert (list[i] <= list[i + 1]);
		}
	}

	@Test
	public void testQuickSortMedianOfThreeArrayOfInteger_RandomNumberBigSizeSortedArray_ReturnListOfIndexISmallerThanListOfIndexIPlusOne() {
		ContextQuickSort context = new ContextQuickSort(new QuickSort());
		Integer[] list = context.executeStrategySortMedianOfThreeSortedArray();
		for (int i = 0; i < list.length - 1; i++) {
			assert (list[i] <= list[i + 1]);
		}
	}

	public void testQuickSortMedianOfThreeArrayOfInteger_EmptyArray_ReturnNoSuchElementException() {
		ContextQuickSort context = new ContextQuickSort(new QuickSort());
		Integer[] list = context.executeStrategySortMedianOfThreeEmpty();
		assertEquals(0, list.length);
	}

}
