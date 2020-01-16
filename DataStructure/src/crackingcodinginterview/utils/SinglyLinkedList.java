package crackingcodinginterview.utils;

public class SinglyLinkedList<T> {

	private static int size;
	LinkedListNode<T> head;

	public void insert(T item) {
		LinkedListNode<T> listNode = new LinkedListNode<>();

		LinkedListNode<T> currentNode = head;
		if (head == null) {
			head = listNode;
			head.item = item;
			head.next = null;

		}

		else {
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = new LinkedListNode<T>();
			currentNode.next.item = item;

		}
		size++;

	}

	public static int getSize() {
		return size;
	}

	public void delete(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		int x = 0;
		LinkedListNode<T> previousNode = null;
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		LinkedListNode<T> currentNode = head;
		if (index == 0 && currentNode != null) {
			head = currentNode.next;

		}

		while (currentNode != null) {
			if (x == index) {
				previousNode.next = currentNode.next;
				break;
			} else {
				previousNode = currentNode;
				currentNode = currentNode.next;
				x++;

			}
		}
		size--;

	}

	public LinkedListNode<T> get(int index) {
		int x = 0;
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		LinkedListNode<T> currentNode = head;
		while (currentNode != null) {
			if (x == index) {

				return currentNode;
			}
			currentNode = currentNode.next;
			x++;
		}
		return currentNode;
	}

	@Override
	public String toString() {
		String string = "";
		LinkedListNode<T> currentNode = head;
		for (int i = 0; i < size; i++) {
			string += currentNode.item + " ";
			currentNode = currentNode.next;
		}
		return string;
	}

}
