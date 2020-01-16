package crackingcodinginterview.utils;


public class LinkedListNode<T> {
	T item;
	LinkedListNode<T> next;
	@Override
	public String toString() {
		String string = next.item+"";
		return string;
	}

}
