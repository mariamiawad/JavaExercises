package myqueue;
import java.util.Iterator;
import java.util.NoSuchElementException;

import arraylistlinkedlist.MyLinkedList;

public class MyQueueLinkedList<E> implements Iterable<E> {
	private MyLinkedList<E> linkedList = new MyLinkedList<>();
	
	public void enqueue(E element) {
		linkedList.add(element);
	}

	public E dequeue() {
		if (linkedList.isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		E data = linkedList.getFirst();
		linkedList.remove(0);
		return data;
	}

	public int size() {
		return linkedList.size();
	}

	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	public Iterator<E> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<E> {

		Iterator<E> iterator = linkedList.iterator();

		@Override
		public boolean hasNext() {
			return iterator.hasNext();
		}

		@Override
		public E next() {
			return iterator.next();
		}

	}
}