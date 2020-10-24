package week2;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {
	private Item[] arrayList;
	private int size;
	private int initialCapacity = 8;
	private int capacity = 0;


	// construct an empty randomized queue
	public RandomizedQueue() {
		arrayList = (Item[]) new Object[initialCapacity];
		size = 0;
		capacity = 8;
	}

	private void resize(int newSize) {

		Item[] newArray = (Item[]) new Object[newSize];
		for (int i = 0; i < arrayList.length && i < newArray.length; i++) {
			newArray[i] = arrayList[i];
		}

		this.arrayList = newArray;
		capacity = arrayList.length;

	}

	// is the randomized queue empty?
	public boolean isEmpty() {
		return size == 0;
	}

	// return the number of items on the randomized queue
	public int size() {
		return size;
	}

	// add the item
	public void enqueue(Item item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		if (size >= arrayList.length) {
			resize(arrayList.length * 2);
		}
		arrayList[size++] = item;
	}

	// remove and return a random item
	public Item dequeue() {
		if (size == 0) {
			throw new NoSuchElementException();
		}

		int index = StdRandom.uniform(size);
		Item finalElement = arrayList[size - 1];
		Item temp = arrayList[index];
		arrayList[index] = finalElement;
		arrayList[size - 1] = temp;
		arrayList[size - 1] = null;
		if (size <= 0.25 * capacity) {
			resize(arrayList.length / 2);
		}
		size--;
		return temp;

	}

	// return a random item (but do not remove it)
	public Item sample() {
		if (size == 0) {
			throw new NoSuchElementException();
		}
		int index = StdRandom.uniform(size());
//		Item finalElement = arrayList.get(size() - 1);
		Item temp = arrayList[index];
//		arrayList.set(index, finalElement);
//		arrayList.set(size() - 1, temp);
		return temp;
	}

	// return an independent iterator over items in random order
	public Iterator<Item> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<Item> {
		private int[] random;
		private int current;

		public MyIterator() {
			this.random = new int[size];
			for (int i = 0; i < size; i++) {
				random[i] = i;
			}
			StdRandom.shuffle(random);
			current = 0;
		}

		@Override
		public boolean hasNext() {
			return current < random.length;
		}

		@Override
		public Item next() {
			if (!hasNext())
				throw new NoSuchElementException("There is no more items!");
			return arrayList[random[current++]];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Remove operator is unsupported!");
		}
	}

	// unit testing (required)
	public static void main(String[] args) {
		RandomizedQueue<Integer> deque = new RandomizedQueue<>();
		StdOut.println(deque.size());
		deque.enqueue(0);
		deque.enqueue(1);

		StdOut.println(deque.dequeue());
		StdOut.println(deque.dequeue());
	}

}