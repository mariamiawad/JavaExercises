package newdatastructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements List<E> {

	static int capacity = 10;
	E[] arrayList;
	int size = 0;;

	public MyArrayList() {
		this.arrayList = (E[]) new Object[capacity];
	}

	@Override
	public void add(E e) {
		if (size >= capacity) {
			resize();
		}
		arrayList[size] = e;
		size++;

	}

	@Override
	public void add(int index, E element) {

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (size >= capacity) {
			resize();
		}
		arrayList[index] = element;
		size++;

	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < arrayList.length; i++) {
			if (arrayList[i] == o) {
				return true;
			}
		}
		return false;
	}

	@Override
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return arrayList[index];

	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < arrayList.length; i++) {
			if (arrayList[i] == o) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		int ind = -1;
		E returnE = null;
		for (int i = index; i < arrayList.length; i++) {
			if (i == index) {
				ind = i;
				returnE = arrayList[i];
				size--;
				break;
				
			}

		}
		
		if (ind>-1) {
			for (int i = ind; i < arrayList.length-1; i++) {
				arrayList[i]= arrayList[i+1];
			}	
		}
		
		if (size <= 0.25 * capacity) {
			resize();
		}
		return returnE;
	}

	@Override
	public boolean remove(Object o) {
		for (int i = 0; i < arrayList.length; i++) {
			if (arrayList[i].equals(o)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public E set(int index, E element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();

		}
		E value = arrayList[index];
		arrayList[index] = element;
		return value;
	}

	@Override
	public int size() {
		return size;

	}

	public void resize() {
		E[] newArray = null;

		if (size <= 0.25 * capacity) {
			newArray = (E[]) new Object[capacity/2];
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = arrayList[i];
			}
		} else if (size >= capacity) {
			newArray = (E[]) new Object[size * 2];
			for (int i = 0; i < arrayList.length; i++) {
				newArray[i] = arrayList[i];
			}
		}
		if (size >= 0.25 * capacity || size >= capacity) {
			this.arrayList = newArray;
			this.capacity = arrayList.length;
		}

	}

	public MyIterator<E> iterator() {
		return new MyIterator();
	}

	public class MyIterator<E> implements Iterator<E> {
		int indexIterator = 0;

		public MyIterator() {
		}

		@Override
		public boolean hasNext() {
			return indexIterator < size;
		}

		@Override
		public E next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}

			return (E) arrayList[indexIterator++];

		}
	}

}
