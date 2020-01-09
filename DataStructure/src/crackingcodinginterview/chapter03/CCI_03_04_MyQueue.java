package crackingcodinginterview.chapter03;

import mystak.MyStackArrayList;

public class CCI_03_04_MyQueue<T> {
	MyStackArrayList<T> stack1 = new MyStackArrayList<>();
	MyStackArrayList<T> stack2 = new MyStackArrayList<>();
	
	public void enqueue(T item) {
		stack1.push(item);
		
	}
	
	public T dequeue() {
		int size = stack1.size();
		if (size == 0) {
			throw new NullPointerException();
		}
		for (int i = 0; i <size; i++) {
			T temp =stack1.pop();
			stack2.push(temp);
		}
		T item =  stack2.pop();
		size = stack2.size();
		for (int i = 0; i <size; i++) {
			stack1.push(stack2.pop());
		}
		return item;
	}
	
	public T peek() {
		int size = stack1.size();
		if (size == 0) {
			throw new NullPointerException();
		}
		for (int i = 0; i <size; i++) {
			stack2.push(stack1.pop());
		}
		T item = stack2.peek();
		size = stack2.size();
		for (int i = 0; i <size; i++) {
			stack1.push(stack2.pop());
		}
		return item;
	}
	
	public int size() {
		return stack1.size();
	}
	
	public boolean isEmpty() {
		return stack1.isEmpty();
	}

}
