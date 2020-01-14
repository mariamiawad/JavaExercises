package heap;

import java.util.NoSuchElementException;

public class MaxPQ<Key extends Comparable<Key>> {

	public Key[] pq; // items on priority queue
	private int n = 0; // number of items
	private int INITIAL_CAPACITY = 10;

	public MaxPQ() {

	}

	public void insert(Key key) {

		if (n == 0) {
			pq = (Key[]) new Comparable[INITIAL_CAPACITY];

		}
		if (n + 1 >= pq.length) {
			resize(pq.length * 2);
		}

		pq[n + 1] = key;
		n++;
		swim(n);

	}

	public Key delMax() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		Key key = pq[1];
		swap(1, n);
		n--;
		sink(1);
		pq[n + 1] = null;
		if (n + 1 <= 0.25 * pq.length && n >= INITIAL_CAPACITY) {
			resize((pq.length / 2));
		}
		return key;

	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int size() {
		return n;
	}

	private void swim(int k) {

		while (k > 1 && (pq[k / 2].compareTo(pq[k]) < 0)) {
			swap(k, k / 2);
			k = k / 2;
		}
	}

	private void sink(int k) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && (pq[j].compareTo(pq[j + 1]) < 0)) {
				j++;
			}
			if (!(pq[k].compareTo(pq[j]) < 0)) {
				break;
			}
			swap(k, j);
			k = j;

		}
	}

	private void resize(int size) {

		Key[] newArray = (Key[]) new Comparable[size];
		for (int i = 1; i < pq.length && i < newArray.length; i++) {
			newArray[i] = pq[i];
		}

		this.pq = newArray;

	}

	private void swap(int parent, int child) {
		Key temp = pq[parent];
		pq[parent] = pq[child];
		pq[child] = temp;
	}

}
