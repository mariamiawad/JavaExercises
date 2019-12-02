package mystak;
import java.util.Iterator;
import java.util.NoSuchElementException;

import arraylistlinkedlist.MyArrayList;
public class MyStackArrayList<E>{
	private MyArrayList<E> list = new MyArrayList<>();
	public void push(E element){
		list.add(element);
	}
	public E pop(){
		E data = list.get(list.size()-1);
		list.remove(list.size()-1);
		return data;
	}
	public E peek(){
		if(isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		}
		E data = list.get(list.size()-1);
		return data;
	}
	public int size(){
		return list.size();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public MyIterator MyIreator() {
		return MyIreator();
		
	}
	public MyIterator iterator() {
		return new MyIterator();
	}

	public class MyIterator implements Iterator<E> {
		int indexIterator = 0;
		E data ;
		E previousData;

		public MyIterator() {
		}

		@Override
		public boolean hasNext() {
			if (indexIterator < list.size()) {
				return list.get(indexIterator) != null;
			}
			return indexIterator < list.size();
		}

		@Override
		public E next() {
			
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			if (list.size()>0&& indexIterator == 0) {
				data = list.get(0);
			}
			previousData = data;

			indexIterator++;
			if (hasNext()) {
				data = list.get(indexIterator);
			}

			return previousData;
		}

	}

}