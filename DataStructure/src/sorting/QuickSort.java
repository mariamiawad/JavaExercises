package sorting;

public class QuickSort implements StrategySorting {
	public <T extends Comparable<T>> void sort(T[] arr) {

		sort(arr, 0, arr.length - 1);

	}

	public <T extends Comparable<T>> void sortWithShuffle(T[] arr) {
		Shuffle shuffle = new Shuffle();
		shuffle.shuffle(arr);
		sort(arr);
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

	private static <T extends Comparable<T>> void threeWayQuickSort(T[] array, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		int it = lo;
		int gt = hi;
		T v = array[lo];
		int i = lo + 1;
		while (i <= gt) {
			int cmp = array[i].compareTo(v);
			if (cmp < 0) {
				swap(array, it++, i++);
			} else if (cmp > 0) {
				swap(array, i, gt--);
			} else {
				i++;
			}
		}
		threeWayQuickSort(array, lo, it - 1);
		threeWayQuickSort(array, gt + 1, hi);
	}

	private <T extends Comparable<T>> void sort(T[] array, int start, int end) {
		if (end <= start) {
			return;

		}
		int p = partition(array, start, end, array[end]);
		sort(array, start, p - 1);
		sort(array, p + 1, end);
	}

	public <T extends Comparable<T>> void sortMedianOfThree(T[] arr) {
		int start = 0;
		int end = arr.length - 1;
		sortMedianOfThree(arr, start, end);
	}

	public <T extends Comparable<T>> void threeWayQuickSort(T[] arr) {
		threeWayQuickSort(arr, 0, arr.length - 1);
	}

	private static <T extends Comparable<T>> void swap(T[] array, int left, int right) {
		T temp = array[left];
		array[left] = array[right];
		array[right] = temp;
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
}
