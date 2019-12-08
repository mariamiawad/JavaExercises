package arraylistlinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

import arraylistlinkedlist.MyArrayList.MyIterator;

public class MyLinkedList<E> implements List<E> {

	Node head;
	Node tail;
	int size = 0;

	public class Node {
		E data;
		Node next;
		Node previous;

	}

	@Override
	public void add(E e) {
		add(size, e);
	}

	@Override
	public void add(int index, E element) {

		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		Node node = new Node();
		Node currentNode = head;
		Node currentNext;
		node.data = element;
		if (head == null) {
			head = node;
			tail = head;

		} else if (size == index) {
			node.previous = tail;
			tail.next = node;
			tail = node;
		} else if (index == 0) {
			currentNode.previous = node;
			node.next = currentNode;
			head = node;
		}

		else {

			int i = 0;
			while (i < index) {
				currentNode = currentNode.next;
				i++;
			}
			currentNext = currentNode.next;
			currentNode.next = node;
			node.previous = currentNode;
			node.next = currentNext;
			currentNext.previous = node;
		}
		size++;
	}

	@Override
	public boolean contains(Object o) {
		Node currentNode = head;
		for (int i = 0; i < size; i++) {
			if (o.equals(currentNode.data)) {
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
	}

	@Override
	public E get(int index) {

		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node n = head;
		E data = null;
		for (int i = 0; i <= index; i++) {
			if (i == index) {
				data = n.data;
				break;
			}
			n = n.next;
		}
		return data;
	}

	@Override
	public int indexOf(Object o) {
		int i = 0;
		Node n = head;
		while (i < size) {
			if (o.equals(n.data)) {
				return i;
			}
			i++;
			n = n.next;
		}
		return -1;

	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public E remove(int index) {
		Node currentNode = head;
		Node nextNode;
		Node removedNode = null;
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
//		if (size == 1  ) {
//			removedNode = head;
//			head.next = null;
//			head.previous = null;
//			head = null;
//		}
		if (index == 0) {
			removedNode = head;
			nextNode = head.next;
			head = nextNode;

		} else if (index == size - 1) {
			removedNode = tail;
			nextNode = tail.previous;
			nextNode.next = null;
			tail = nextNode;
		}

		else {
			for (int i = 0; i < index; i++) {
				if (i == index - 1) {
					removedNode = currentNode.next;
					nextNode = removedNode.next;
					currentNode.next = nextNode;
					nextNode.previous = currentNode;

				}
				currentNode = currentNode.next;

			}
		}
		size--;
		return removedNode.data;
	}

	@Override
	public boolean remove(Object o) {
		if (size == 0) {
			return false;
		}
		Node currentNode = head;
		for (int i = 0; i < size; i++) {
			if (o.equals(currentNode.data)) {
				remove(i);
				return true;
			}
			currentNode = currentNode.next;
		}

		return false;

	}

	@Override
	public E set(int index, E element) {
		Node n = head;
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = 0; i <= index; i++) {
			if (index == i) {
				n.data = element;
				break;
			}
			n = n.next;
		}
		return element;
	}

	@Override
	public int size() {
		return size;
	}

	// Inserts the specified element at the beginning of this list.
	public void addFirst(E e) {
		add(0, e);
	}

	// Appends the specified element to the end of this list.
	public void addLast(E e) {

		add(size, e);

	}

	// Returns the first element in this list.
	public E getFirst() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		return head.data;
	}

	// Returns the last element in this list.
	public E getLast() {
		if (tail == null) {
			throw new NoSuchElementException();
		}
		return tail.data;
	}

	// Removes and returns the first element from this list.
	public E removeFirst() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		return remove(0);
	}

	// Removes and returns the last element from this list.
	public E removeLast() {
		if (tail == null) {
			throw new NoSuchElementException();
		}

		return remove(size - 1);
	}

	public MyIterator iterator() {
		return new MyIterator();
	}

	public class MyIterator implements Iterator<E> {
		int indexIterator = 0;
		Node node = head;
		Node prevNode ;
		public MyIterator() {
		}

		@Override
		public boolean hasNext() {
			return indexIterator < size;
		}

		@Override
		public E next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			
			prevNode = node;
			node = node.next;
			indexIterator++;
			return prevNode.data;
		}

	}

}
