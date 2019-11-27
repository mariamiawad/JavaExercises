import java.util.*;
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
		return top.data;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
}