package arraylistlinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements List<E>, Iterable<E> {
	private int INITIAL_CAPACITY = 10;
	static int capacity = 10;
	E[] arrayList = (E[]) new Object[capacity];;
	int size = 0;;

	@Override
	public void add(E e) {
		if (size >= capacity) {
			resize(capacity * 2);
		}
		arrayList[size] = e;
		size++;

	}

	@Override
	public void add(int index, E element) {

		if (index < 0|| (index >= size && size!=0)) {
			throw new IndexOutOfBoundsException();
		}
		if (size >= capacity) {
			resize(capacity * 2);
		}
		arrayList[index] = element;
		size++;

	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < arrayList.length && i < size; i++) {
			if (arrayList[i].equals(o)) {
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
		E[] newArray = (E[]) new Object[arrayList.length - 1];
		int ind = -1;
		E returnE = null;

		ind = index;
		returnE = arrayList[index];
		for (int i = index; i < size-1; i++) {
			arrayList[i] = arrayList[i + 1];

		}
		size--;

		if (size <= 0.25 * capacity) {
			resize(capacity / 2);
		}
		return returnE;
	}

	@Override
	public boolean remove(Object o) {
		for (int i = 0; i < arrayList.length; i++) {
			if (arrayList[i] != null) {
				if (arrayList[i].equals(o)) {
					remove(i);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public E set(int index, E element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();

		}
		// TODO - why return the old value?
		// because it's what it should return according to Java Arraylist

		E value = arrayList[index];
		arrayList[index] = element;
		return value;
	}

	@Override
	public int size() {
		return size;

	}

	private void resize(int size) {

		E[] newArray = (E[]) new Object[size];
		for (int i = 0; i < arrayList.length && i < newArray.length; i++) {
			newArray[i] = arrayList[i];
		}

		this.arrayList = newArray;
		this.capacity = arrayList.length;

	}

	public Iterator<E> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<E> {
		int indexIterator = 0;

		E data;
		E previousData;

		public MyIterator() {
		}

		private boolean isData() {
			if (arrayList[0] != null) {

				return true;
			}
			return false;
		}

		@Override
		public boolean hasNext() {
			if (indexIterator < size) {
				return arrayList[indexIterator] != null;
			}
			return indexIterator < size;
		}

		@Override
		public E next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			if (isData() && indexIterator == 0) {
				data = arrayList[0];
			}
			previousData = data;

			indexIterator++;
			if (hasNext()) {
				data = arrayList[indexIterator];
			}

			return previousData;
		}

	}

}
