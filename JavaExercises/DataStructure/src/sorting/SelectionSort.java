package sorting;

import java.util.List;
import java.util.NoSuchElementException;

public class SelectionSort<E> {
	public <E extends Comparable<E>> void selectionSort(List<E> list) {
		int size = list.size();
		E min = null;
		int index = 0;
		if (list.size() == 0) {
			throw new NoSuchElementException("List is Empty");
		}
		for (int i = 0; i < size; i++) {
			index = i;
			for (int j = i + 1; j < size; j++) {
				if (list.get(j).compareTo(list.get(index)) < 0) {
					index = j;
				}
			}
			E temp = list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}

	}

	public <E extends Comparable<E>> void selectionSort(E[] list) {
		int size = list.length;
		int index = 0;
		if (list.length<=0) {
			throw new NoSuchElementException();
		}
		for (int i = 0; i < size; i++) {
			if (list[i] == null) {
				throw new NoSuchElementException("Array is Empty");
			}
		}

		for (int i = 0; i < size; i++) {
			index = i;
			for (int j = i + 1; j < size; j++) {
				if (list[j].compareTo(list[index]) < 0) {
					index = j;
				}
			}
			E temp = list[index];
			list[index] = list[i];
			list[i] = temp;

		}
	}
}
