package sorting;

import java.util.NoSuchElementException;

public class ShellSort {
	public <T extends Comparable<T>> void sort(T[] arr) {
		int h = 0;
		if (arr.length == 0) {
			throw new NoSuchElementException();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				throw new NoSuchElementException();
			}
		}
		while (h < arr.length / 3) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int i = h; i < arr.length; i+=h) {
				for (int j = i; j >= 1; j-=h) {
					if (arr[j].compareTo(arr[j - h]) < 0) {
						T temp = arr[j - h];
						arr[j - h] = arr[j];
						arr[j] = temp;

					} else {
						break;
					}
				}

			}
			h = h / 3;
		}
	}
}
