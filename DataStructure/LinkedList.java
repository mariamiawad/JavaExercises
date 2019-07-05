import java.rmi.NoSuchObjectException;

public class LinkedList<E> implements List<E> {

	Node head;
	Node tail;
	int size;

	public class Node {
		E data;
		Node next;
		Node previous;

	}

	@Override
	public void add(E e) {
		Node n = new Node();
		n.data = e;
		if (size == 0) {
			head = n;
			tail = head;
		} else {
			n.next = head;
			head.previous = n;
			head = n;

		}
		size++;

	}

	@Override
	public void add(int index, E element) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		} else if (index == size || index == 0) {
			add(element);
		}

		else {
			Node addedNode = new Node();
			addedNode.data = element;
			int i = 0;
			Node currentNode = head;
			Node currentNext;
			while (i <= index) {
				currentNode = currentNode.next;
				i++;
			}
			currentNext = currentNode.next;
			if (currentNext == null) {
				currentNode.next = addedNode;
				addedNode.previous = currentNode;
				size++;
			} else {
				addedNode.next = currentNext;
				addedNode.previous = currentNode;
				currentNode.next = addedNode;
				currentNext.previous = addedNode;
				size++;
			}
		}
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
		Node n = new Node();
		n = head;
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = 0; i <= index; i++) {
			if (i == index) {
				return n.data;
			}
			n = n.next;
		}
		return null;
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
		Node removedNode;
		if (index >= size ||  index < 0) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			removedNode = head;
			nextNode = head.next;
			nextNode.previous = null;

		} 
		else {
			for (int i = 0; i <= index; i++) {
				removedNode = currentNode.next;
				nextNode = removedNode.next;
				if (i == index) {
					currentNode.next = nextNode;
					nextNode.previous = currentNode;
					
				}
				currentNode = currentNode.next;
			}
		}

		return null;
	}

	@Override
	public boolean remove(Object o) {
		if (size == 0) {
			return false;
		}
		Node currentNode = head;
		Node nextNode;
		Node removedNode;
		for (int i = 0; i < size; i++) {
			removedNode = currentNode.next;
			nextNode = removedNode.next;
			if (o.equals(currentNode.data)) {
				currentNode.next = nextNode;
				nextNode.previous = currentNode;
				return true;
			}
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
		}
		return null;
	}

	@Override
	public int size() {
		// TODO Implement
		return size;
	}

	// Inserts the specified element at the beginning of this list.
	void addFirst(E e) {
		add(0, e);
	}

	// Appends the specified element to the end of this list.
	void addLast(E e) {

		add(size, e);

	}

	// Returns the first element in this list.
	E getFirst() {
		return head.data;
	}

	// Returns the last element in this list.
	E getLast() {
		return tail.data;
	}

	// Removes and returns the first element from this list.
	E removeFirst() {
		remove(0);
		return null;
	}

	// Removes and returns the last element from this list.
	E removeLast() {
		int index = 0;
		Node currentNode = head;
		for(int i = 0; i < size; i++){
			currentNode = currentNode.next;
			index=i;
		}
		remove(index);

		return null;
	}

}
