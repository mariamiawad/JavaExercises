package mystak;
import java.util.Iterator;
import java.util.NoSuchElementException;

import arraylistlinkedlist.MyLinkedList.Node;

public class MyStackLinkedList<E>{
	Node top; 
	int size;
	class Node{
		E data;
		Node next;
	}
	public void push (E element){
		Node node = new Node();
		node.data = element;
		node.next = top;
		top = node;
		size++;
	}
	public E pop(){
		Node temp = top;
		top = top.next;
		size--;
		
		return temp.data;
	}
	public E peek (){
		if(top == null) {
			throw new NoSuchElementException("Stack is empty");
		}
		return top.data;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public MyIterator MyIreator() {
		return MyIreator();
		
	}
	public MyIterator iterator() {
		return new MyIterator();
	}


	public class MyIterator implements Iterator<E> {
		int indexIterator = 0;
		Node node = top;
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