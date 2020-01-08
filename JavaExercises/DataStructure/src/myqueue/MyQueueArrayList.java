package myqueue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyQueueArrayList<E> implements Iterable<E> {
	private int head = -1;
	private int tail = -1;
	private int size ;
	private E[] elements = (E[]) new Object[10];
	int INITIAL_CAPACITY = 10;

	public void enqueue(E element) {

		elements[++tail] = element;
		size++;

		if (size >= elements.length) {
			int tempSize = size;
			resize(tempSize * 2);

		}

	}

	public E dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}
		E temp = elements[++head];
		tail--;
		size--;

		if (size <= 0.25 * elements.length && size >= INITIAL_CAPACITY) {
			int tempSize = size;
			resize(tempSize * 2);
		}

		return temp;

	}

	private void resize(int size) {
		E[] newArray = null;

		newArray = (E[]) new Object[size];
		for (int i = 0; i < elements.length; i++) {
			newArray[i] = elements[i];

		}

		this.elements = newArray;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
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
			if (elements[0] != null) {

				return true;
			}
			return false;
		}

		@Override
		public boolean hasNext() {
			if (indexIterator < size) {
				return elements[indexIterator] != null;
			}
			return indexIterator < size;
		}

		@Override
		public E next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			if (isData() && indexIterator == 0) {
				data = elements[0];
			}
			previousData = data;

			indexIterator++;
			if (hasNext()) {
				data = elements[indexIterator];
			}

			return previousData;
		}

	}
}