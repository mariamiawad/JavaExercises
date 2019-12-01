package arraylistlinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

import arraylistlinkedlist.MyLinkedList.MyIterator;
import arraylistlinkedlist.MyLinkedList.Node;

public class MyArrayList<E> implements List<E> {
	private int INITIAL_CAPACITY = 10;
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
		if (size >= capacity ) {
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
		E[] newArray = (E[]) new Object[arrayList.length - 1];
		int ind = -1;
		E returnE = null;
		for (int i = 0; i < index; i++) {
			newArray[i] = arrayList[i];
		}

		ind = index;
		returnE = arrayList[index];
		size--;

		if (ind > -1) {
			for (int i = ind; i < newArray.length; i++) {
				newArray[i] = arrayList[i + 1];
			}
			this.arrayList = newArray;
		}

		if (size <= 0.25 * capacity) {
			resize();
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
		E value = arrayList[index];
		arrayList[index] = element;
		return value;
	}

	@Override
	public int size() {
		return size;

	}

	private void resize() {
		E[] newArray = null;

		if (size <= 0.25 * capacity && capacity > INITIAL_CAPACITY) {
			newArray = (E[]) new Object[capacity / 2];
			for (int i = 0; i < arrayList.length&& i<newArray.length; i++) {
				newArray[i] = arrayList[i];
			}
		} else if (size >= capacity) {
			newArray = (E[]) new Object[size * 2];
			for (int i = 0; i < arrayList.length; i++) {
				newArray[i] = arrayList[i];
			}
		}
		if ((size <= 0.25 * capacity &&capacity > INITIAL_CAPACITY   ) || size >= capacity) {
			this.arrayList = newArray;
			if(capacity > INITIAL_CAPACITY  || size <= capacity)
			this.capacity = arrayList.length;
		}

	}

	public MyIterator iterator() {
		return new MyIterator();
	}

	public class MyIterator implements Iterator<E> {
		int indexIterator = 0;
		E data = arrayList[0];
		E previousData;

		public MyIterator() {
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

			previousData = data;

			indexIterator++;
			if (hasNext()) {
				data = arrayList[indexIterator];
			}

			return previousData;
		}

	}

}
