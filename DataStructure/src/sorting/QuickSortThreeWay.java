package sorting;

public class QuickSortThreeWay implements StrategySorting{
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

	private static <T extends Comparable<T>> void swap(T[] array, int left, int right) {
		T temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	@Override
	public <T extends Comparable<T>> void sort(T[] array) {
		threeWayQuickSort(array, 0, array.length-1);
		
	}
}
