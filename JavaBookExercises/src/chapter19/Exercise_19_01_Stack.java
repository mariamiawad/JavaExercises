package chapter19;

public class Exercise_19_01_Stack<E> {
	
	private E[] list;
	public Exercise_19_01_Stack() {
		list = (E[]) new Object[10];
	}
	private int size = 0;

	public int getSize() {
		return size;
	}

	public E peek() {
		return list[size-1];
	}

	public void push(E o) {
		
		if (list.length <= size) {
			E[]list2 = (E[]) new Object[size * 2];
			for (int i = 0; i < list.length; i++) {
				list2[i] = list2[i];

			}
			list = list2;
		
		}
		
		list[size] =o;
		size++;

	}

	public E pop() {
		E o = list[size - 1];
		list[size - 1] = null;
		size--;
		return o;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

}
