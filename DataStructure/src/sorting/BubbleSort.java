package sorting;

import java.util.List;
import java.util.NoSuchElementException;

public class BubbleSort <E>{
	public <E extends Comparable<E>> void bubbleSort(List<E> list) {
		int n = list.size();
		if (n== 0) {
			throw new NoSuchElementException();
		}
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j <n-i-1; j++) {
				if(list.get(j).compareTo(list.get(j+1))>0) {
					E temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
	}
	public <E extends Comparable<E>> void bubbleSort(E[] list) {
		int n = list.length;
		for (int i = 0; i < list.length; i++) {
			if(list[i] == null) {
				throw new NoSuchElementException();
			}
		}
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(list[j].compareTo(list[j+1])>0) {
					E temp = list[j];
					list[j]= list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
}
