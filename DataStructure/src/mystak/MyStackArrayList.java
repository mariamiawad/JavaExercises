package mystak;

import java.util.Iterator;
import java.util.NoSuchElementException;

import arraylistlinkedlist.MyArrayList;
import arraylistlinkedlist.MyArrayList.MyIterator;

public class MyStackArrayList<E> {
	private MyArrayList<E> list = new MyArrayList<>();

	public void push(E element) {
		list.add(element);
	}

	public E pop() {
		E data = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return data;
	}

	public E peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		}
		E data = list.get(list.size() - 1);
		return data;
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public MyIterator MyIreator() {
		return MyIreator();

	}

	public MyIterator iterator() {
		MyIterator iterator = list.iterator();
		return iterator;
	}
	
}