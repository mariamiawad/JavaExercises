package sorting;

import java.util.Random;

public class ContextQuickSortThreeWay {
	private StrategySorting strategy;

	public ContextQuickSortThreeWay(StrategySorting strategy) {
		this.strategy = strategy;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySort() {
		Integer[] list = new Integer[100000];
		generateArray(list);
		strategy.sort(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortSortedArray() {
		Integer[] list = new Integer[10];
		generateArray(list, 0, 0);
		strategy.sort(list);
		return list;
	}

	public <T extends Comparable<T>> Integer[] executeStrategySortEmpty() {
		Integer[] list = {};
		strategy.sort(list);
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
