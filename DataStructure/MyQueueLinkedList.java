import java.util.*;

public class MyQueueLinkedList<E> {
	Node head;
	Node tail;
	int size;

	class Node {
		E data;
		Node next;
		Node previous;
	}

	public void enqueue(E element) {
		Node node = new Node();
		node.data = element;
		if (size == 0) {
			head = node;
			tail = head;
			
		} else {
			node.next = tail;
			node.previous = null;
			tail.previous = node;
			tail = node;
		}
		size++;
	}

	public E dequeue() {
		Node temp = head;
		if(head.previous == null){
			size--;
			return temp.data;


		}
		head = head.previous;
		head.next = null;
		size--;
		return temp.data;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}