package sorting;

public class QuickSortWithShuffle implements StrategySorting {
	public <T extends Comparable<T>> void sort(T[] arr) {
		sort(arr, 0, arr.length - 1);

	}

	public <T extends Comparable<T>> void sortWithShuffle(T[] arr) {
		Shuffle shuffle = new Shuffle();
		shuffle.shuffle(arr);
		sort(arr);
	}
	private <T extends Comparable<T>> void sort(T[] array, int start, int end) {
		if (end <= start) {
			return;

		}
		int p = partition(array, start, end, array[end]);
		sort(array, start, p - 1);
		sort(array, p + 1, end);
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
