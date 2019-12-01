import java.util.Iterator;
import java.util.NoSuchElementException;

import arraylistlinkedlist.MyLinkedList;

public class MyQueueLinkedList<E> {
	private MyLinkedList<E> linkedList = new MyLinkedList<>();
	
	public void enqueue(E element) {
		linkedList.add(element);
	}

	public E dequeue() {
		if (linkedList.isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		E data = linkedList.getFirst();
		linkedList.remove(data);
		return data;
	}

	public int size() {
		return linkedList.size();
	}

	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	public MyIterator iterator() {
		return new MyIterator();
	}

	public class MyIterator implements Iterator<E> {

		MyLinkedList<E>.MyIterator iterator = linkedList.iterator();

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