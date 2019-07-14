import java.util.Arrays;

public class MyArrayList<E> implements List<E> {
	E[] array;
	int size = 0;
	int capacity = 10;
	MyArrayList(){
		array = (E[])new Object[capacity];
	}
	

	@Override
	public void add(E e) {
		
		resize(size, capacity);
		array[size]= e;
		size++;
		

	}

	@Override
	public void add(int index, E element) {
		resize(size, capacity);
		E[] newArray = (E[])new Object[array.length + 1];
		if (index > capacity) {
			resize(index, capacity);
		}
		for (int i = 0; i <= index; i++) {
			if (index == i) {
				newArray[i] = element;
				i++;
				size++;
			}
			newArray[i] = array[i];
		}
		resize(size, capacity);
		this.array = newArray;

	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < array.length; i++) {
			if (o.equals(array[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public E get(int index) {
		if (index >= array.length) {
			throw new IndexOutOfBoundsException();
		}
		return array[index];
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < array.length; i++) {
			if (o.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E remove(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		E[] newArray = (E[])new Object[array.length];
		for (int i = index; i < size; i++) {
			if(index==i){
				array[i]=array[i+1];
				continue;
			}
			array[i]= array[i+1];
			
		}
		size--;
			
		// this.array = newArray;
		resize(size, capacity);
		return null;
	}

	@Override
	public boolean remove(Object o) {
		boolean trueFalse = false;
		// E[] newArray = array;
		// E temp ;
		int index=0;
		int originalSize= size;
		for (int i = 0; i < originalSize; i++) {
			
			if(o.equals(array[i])){
				index=i;
				remove(index);
				trueFalse=true;
			}

		}
		if(trueFalse==true){
			resize(size, capacity);
		}
		return trueFalse;
	}

	@Override
	public E set(int index, E element) {
		if (index >= size) {
			throw new IndexOutOfBoundsException();
		}
		array[index] = element;

		return null;
	}

	@Override
	public int size() {
		// TODO implement
		return size;
	}

	public void resize(int size, int capacity) {

		if (size >= capacity) {
			E[] newArray = (E[])new Object[size * 2];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			this.array = newArray;
			this.capacity = array.length;
		} else if (0.25 * size == capacity) {
			E[] newArray = (E[])new Object[size / 2];
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = array[i];
			}
			this.array = newArray;
			this.capacity = array.length;
		}
	}

}
