package sorting;

public class QuickSortMedianOfThree implements StrategySorting {
	public <T extends Comparable<T>> void sort(T[] arr) {
		int start = 0;
		int end = arr.length - 1;
		sortMedianOfThree(arr, start, end);
	}

	private <T extends Comparable<T>> void sortMedianOfThree(T[] array, int start, int end) {
		if (start >= end)
			return;

		T pivot = getMedian(array, start, end);
		int partition = partition(array, start, end, pivot);

		sortMedianOfThree(array, start, partition - 1);
		sortMedianOfThree(array, partition + 1, end);

	}
	private static <T extends Comparable<T>> T getMedian(T[] array, int left, int right) {
		int center = (left + right) / 2;

		if (array[left].compareTo(array[center]) > 0)
			swap(array, left, center);

		if (array[left].compareTo(array[right]) > 0)
			swap(array, left, right);

		if (array[center].compareTo(array[right]) > 0)
			swap(array, center, right);

		swap(array, center, right);
		return array[right];
	}
	private static <T extends Comparable<T>> int partition(T[] array, int start, int end, T pivot) {
		int i = start - 1;
		for (int j = start; j < end; j++) {
			if (array[j].compareTo(pivot) < 0) {
				i++;
				swap(array, i, j);
			}

		}
		swap(array, i + 1, end);
		return i + 1;

	}
	private static <T extends Comparable<T>> void swap(T[] array, int left, int right) {
		T temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
