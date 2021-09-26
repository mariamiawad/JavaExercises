package demo;

public class SingleLinkedList<E> {
	class Node {
		E element;
		Node next;

		public Node(E element) {
			this.element = element;
		}
	}

	Node head;
	int size = 0;

	
	public void add(E e) {
		add(size, e);

	}

	
	public void add(int index, E element) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		Node node = new Node(element);
		Node current = head;
		if (head == null) {
			head = node;
		} else if (size == index) {
			while (current.next != null) {
				current = current.next;

			}
			Node temp = current;
			current.next = node;
			node = temp;

		} else {
			int i = 0;
			while (i < index) {
				current = current.next;
				i++;
			}
			Node temp = current;
			current.next = node;
			node = temp;

		}
		size++;
	}

	
	public boolean contains(Object o) {
		Node current = head;
		while (current != null) {
			if (current.element.equals(o)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	
	public E get(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		int i = 0;
		Node current = head;
		while (i < index) {
			current = current.next;
		}
		return current.next.element;
	}

	
	public int indexOf(Object o) {
		if (o == null) {
			return -1;
		}
		int i = 0;
		Node current = head;
		while (current != null) {
			if (current.element.equals(o)) {
				return i;
			}
			i++;
			current = current.next;
		}
		return 0;
	}

	
	public boolean isEmpty() {

		return size == 0;
	}

	
	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}

		int i = 0;
		Node current = head;
		while (i < index) {
			current = current.next;
			i++;
		}
		E data = current.element;
		if (current.next != null) {
			current.next = current.next.next;
		}
		else {
			current = null;
		}
		size--;
		return data;

	}

	
	public boolean remove(Object o) {
		Node current = head;
		while (current != null) {
			if (current.element.equals(o)) {
				current = current.next;
				size--;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	
	public E set(int index, E element) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node current = head;
		for (int i = 0; i <= index; i++) {
			if (index == i) {
				current.element = element;
				break;
			}
			current = current.next;
		}
		return element;
	}

	
	public int size() {
		return size;
	}

}
