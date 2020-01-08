package sorting;

import java.util.Random;

public class ContextQuickSort {
	private StrategySorting strategy;

	public ContextQuickSort(StrategySorting strategy) {
		this.strategy = strategy;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySort() {
		Integer[] list = new Integer[100000];
		generateArray(list);
		strategy.sort(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortThreeWay() {
		Integer[] list = new Integer[100000];
		generateArray(list);
		strategy.threeWayQuickSort(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortWithSuffle() {
		Integer[] list = new Integer[100000];
		generateArray(list);
		strategy.sortWithShuffle(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortMedianOfThree() {
		Integer[] list = new Integer[100000];
		generateArray(list);
		strategy.sortMedianOfThree(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortSortedArray() {
		Integer[] list = new Integer[100000];
		generateArray(list, 0, 0);
		strategy.sort(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortThreeWaySortedArray() {
		Integer[] list = new Integer[100000];
		generateArray(list, 0, 0);
		strategy.threeWayQuickSort(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortWithSuffleSortedArray() {
		Integer[] list = new Integer[100000];
		generateArray(list, 0, 0);
		strategy.sortWithShuffle(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortMedianOfThreeSortedArray() {
		Integer[] list = new Integer[100000];
		generateArray(list, 0, 0);
		strategy.threeWayQuickSort(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortThreeWayEmpty() {
		Integer[] list = {};
		strategy.sort(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortEmpty() {
		Integer[] list = {};
		strategy.sort(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortWithSuffleEmpty() {
		Integer[] list = {};
		strategy.sortWithShuffle(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortMedianOfThreeEmpty() {
		Integer[] list = {};
		strategy.sortMedianOfThree(list);
		return list;
	}

	private Integer[] generateArray(Integer[] list, int currentValue, int lastValue) {
		Random random = new Random();
		for (int i = 0; i < list.length; i++) {
			currentValue = random.nextInt(200);
			lastValue = lastValue + currentValue;
			list[i] = lastValue;
		}
		return list;

	}

	private Integer[] generateArray(Integer[] list) {
		Random random = new Random();
		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(1000);

		}
		return list;
	}
}
