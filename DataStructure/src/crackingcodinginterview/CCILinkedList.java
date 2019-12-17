package crackingcodinginterview;

import java.util.LinkedList;

public class CCILinkedList {
	
	public <E> void removeDuplicates(LinkedList<E> list) {
		// TODO - Implement this method
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(7);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(10);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(8);
		list.add(5);
		list.add(9);
		System.out.println(list);
		
		CCILinkedList listUtils = new CCILinkedList();
		listUtils.removeDuplicates(list);
		System.out.println(list);
		
	}

}
