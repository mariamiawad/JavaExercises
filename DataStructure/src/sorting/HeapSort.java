package sorting;

public class HeapSort implements StrategySorting {

	@Override
	public <T extends Comparable<T>> void sort(T[] array) {
		int n = array.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}
		for (int i = n - 1; i >= 0; i--) {
			swap(array, 0, i);
			heapify(array, i, 0);
		}

	}

	private <T extends Comparable<T>> void heapify(T[] array, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && array[l].compareTo(array[i]) > 0) {
			largest = l;
		}
		if (r < n && array[r].compareTo(array[largest]) > 0) {
			largest = r;
		}
		if (largest != i) {
			swap(array, i, largest);
			heapify(array, n, largest);
		}
	}

	private <T extends Comparable<T>> void swap(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	
	

}
