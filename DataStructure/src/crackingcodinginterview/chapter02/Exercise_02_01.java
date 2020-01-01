package crackingcodinginterview.chapter02;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Exercise_02_01 {
	
	public <E> void removeDuplicates(LinkedList<E> list) {
		Set<E> set = new LinkedHashSet<>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		list.clear();
		for (E e : set) {
			list.add(e);
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
		
		Exercise_02_01 listUtils = new Exercise_02_01();
		listUtils.removeDuplicates(list);
		System.out.println(list);
		
	}

}
