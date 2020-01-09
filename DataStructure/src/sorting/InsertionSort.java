package sorting;

import java.util.List;
import java.util.NoSuchElementException;

public class InsertionSort<E> {
	public <E extends Comparable<E>> void insertionSort(List<E> list) {
		int size = list.size();
		if (size== 0) {
			throw new NoSuchElementException();
		}
		E max = null;
		for (int i = 1; i < size; i++) {
			max = list.get(i);
			int j = i-1;
			while (j>=0 && list.get(j).compareTo(max)>0) {
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, max);
			
		}
	}
	public <E extends Comparable<E>> void insertionSort(E[] list) {
		int size = list.length;
		E max = null;
		if (list.length <=  0) {
			throw new NoSuchElementException();
		}
		for (int i = 0; i < list.length; i++) {
			if(list[i] == null) {
				throw new NoSuchElementException();
			}
		}
		for (int i = 1; i < size; i++) {
			max = list[i];
			int j = i-1;
			while (j>=0 && list[j].compareTo(max)>0) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = max;
			
		}
	}
}
