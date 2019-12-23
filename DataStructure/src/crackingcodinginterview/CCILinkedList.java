package crackingcodinginterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

import arraylistlinkedlist.List;

import java.util.Set;

public class CCILinkedList {
	
	public <E> void removeDuplicates(LinkedList<E> list) {
		LinkedList<E> newList = new LinkedList<>();
		newList.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			if (!newList.contains(list.get(i))) {
				newList.add(list.get(i));
			}
		}
		list.clear();
		for (int i = 0; i < newList.size(); i++) {
			list.add(newList.get(i));
		}
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
