package myqueue;
import java.util.*;

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
}