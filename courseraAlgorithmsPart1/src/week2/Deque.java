package week2;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdOut;

public class Deque<Item> implements Iterable<Item> {

	private class LinkedList implements Iterable<Item> {
		private Node head;
		private Node tail;
		private int size;

		private class Node {
			private Node previous;
			private Node next;
			private Item item;
		}

		public void addFirst(Item item) {
			if (item == null) {
				throw new IllegalArgumentException("item is null");
			}
			Node oldfirst = head;
			head = new Node();
			head.item = item;
			head.previous = null;
			head.next = oldfirst;
			if (isEmpty()) {
				tail = head;
			} else {
				oldfirst.previous = head;
			}
			size++;
		}

		private void addLast(Item item) {
			if (item == null) {
				throw new IllegalArgumentException("item is null");
			}
			Node oldlast = tail;
			tail = new Node();
			tail.item = item;
			tail.previous = oldlast;
			tail.next = null;
			// special cases for empty queue
			if (isEmpty()) {
				head = tail;
			} else {
				oldlast.next = tail;
			}
			size++;
		}

		public int size() {
			return size;
		}

		public boolean isEmpty() {
			return size == 0;
		}

		public Item removeFirst() {
			if (isEmpty()) {
				throw new NoSuchElementException("Deque is empty");
			}
			Node current = head;
			Item item = current.item;
			head = current.next;
			current.next = null;
			if (head != null) {
				head.previous = null;
			}
			size--;
			// special cases for empty queue
			if (isEmpty()) {
				tail = null;
			}
			return item;
		}

		private Item removeLast() {
			if (isEmpty()) {
				throw new NoSuchElementException("Deque is empty");
			}
			Node current = tail;
			Item item = current.item;
			tail = current.previous;
			current.previous = null;
			if (tail != null) {
				tail.next = null;
			}
			size--;
			// special cases for empty queue
			if (isEmpty()) {
				head = null;
			}
			return item;
		}

		@Override
		public Iterator<Item> iterator() {
			return new MyIterator();
		}

		private class MyIterator implements Iterator<Item> {
			int indexIterator = 0;
			Node node = head;
			Node prevNode;

			public MyIterator() {
			}

			@Override
			public boolean hasNext() {
				return indexIterator < size;
			}

			@Override
			public Item next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}

				prevNode = node;
				node = node.next;
				indexIterator++;
				return prevNode.item;
			}

		}

	}

	private LinkedList linkedList;

	// construct an empty deque
	public Deque() {
		linkedList = new LinkedList();
	}

	// is the deque empty?
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	// return the number of items on the deque
	public int size() {
		return linkedList.size();
	}

	// add the item to the front
	public void addFirst(Item item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		linkedList.addFirst(item);
	}

	// add the item to the back
	public void addLast(Item item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		linkedList.addLast(item);
	}

	// remove and return the item from the front
	public Item removeFirst() {
		if (linkedList.isEmpty()) {
			throw new NoSuchElementException();
		}
		return linkedList.removeFirst();
	}

	// remove and return the item from the back
	public Item removeLast() {
		if (linkedList.isEmpty()) {
			throw new NoSuchElementException();
		}
		return linkedList.removeLast();
	}

//	addFirst(), addLast(), removeFirst(),
//	removeLast(), isEmpty(), and size(). The probabilities of each
//	operation are (p1, p2, p3, p4, p5, p6), respectively.
	// unit testing (required)
	public static void main(String[] args) {
		Deque<Double> deque = new Deque<>();
		StdOut.println(deque.size());
		deque.addFirst(0.4);
		deque.addLast(0.4);
		StdOut.println(deque.removeFirst());
		StdOut.println(deque.removeLast());
		StdOut.println(deque.isEmpty());
		StdOut.println(deque.size());

	}

	@Override
	public Iterator<Item> iterator() {
		return linkedList.iterator();
	}

}
