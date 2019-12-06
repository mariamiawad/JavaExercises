package myqueue;
import java.util.*;

import arraylistlinkedlist.MyArrayList.MyIterator;

public class MyQueueArrayList<E> {
	private int head;
	private int tail;
	private int size;
	private E[] elements = (E[]) new Object[10];
	int INITIAL_CAPACITY = 10;

	public void enqueue(E element) {

		elements[tail] = element;
		tail++;
		size++;

		if (size >= elements.length) {
			resize();

		}

	}

	public E dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}
		E temp = elements[head];
		head++;
		size--;

		if (size <= 0.25 * elements.length) {
			resize();
		}

		return temp;

	}

	private void resize() {
		E[] newArray = null;

		if (size <= 0.25 * elements.length && elements.length > INITIAL_CAPACITY) {
			newArray = (E[]) new Object[elements.length / 2];
			for (int i = 0; i < elements.length && i < newArray.length; i++) {
				newArray[i] = elements[head++];

			}
			head = 0;
		} else if (size >= elements.length) {
			newArray = (E[]) new Object[size * 2];
			for (int i = 0; i < elements.length; i++) {
				newArray[i] = elements[i];
			}
		}
		if ((size <= 0.25 * elements.length && elements.length > INITIAL_CAPACITY) || size >= elements.length) {
			this.elements = newArray;
		}

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}
	public MyIterator iterator() {
		return new MyIterator();
	}

	public class MyIterator implements Iterator<E> {
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