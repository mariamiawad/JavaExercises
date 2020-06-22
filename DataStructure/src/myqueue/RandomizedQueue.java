package myqueue;

import java.util.NoSuchElementException;
import java.util.Random;

import arraylistlinkedlist.MyArrayList;

public class RandomizedQueue<E> {
	MyArrayList<E> queue;

	public RandomizedQueue() {

		this.queue = new MyArrayList<>();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public void add(E item) {
		queue.add(item);
	}

	public int size() {
		return queue.size();
	}

	public E remove() {
		Random random = new Random();
		if (queue.isEmpty()) {
			throw new NoSuchElementException();
		}
		int index = random.nextInt(queue.size());
		E finalElement = queue.get(queue.size() - 1);
		E temp = queue.get(index);
		queue.set(index, finalElement);
		queue.set(queue.size() - 1, temp);
		queue.remove(queue.size() - 1);
		return temp;

	}

}
