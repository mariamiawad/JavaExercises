package crackingcodinginterview.chapter03;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class CCI_03_01_ThreeInOneStack<T> {
	private int capacity = 10;
	private int INITIAL_CAPACITY = 10;
	private T[] array = (T[]) (new Object[INITIAL_CAPACITY]);
	private Map<Integer, List<Integer>> map = new HashMap<>();
	private List<Integer> list;
	int size = 0;

	public void push(int stackNum, T item) {
		if (stackNum < 0) {
			throw new IllegalArgumentException();
		}

		
		if (!map.containsKey(stackNum)) {
			list = new ArrayList<>();
			list.add(size);
			map.put(stackNum, list);
		} else {
			list = map.get(stackNum);
			list.add(size);
			map.put(stackNum, list);
		}
		if (list.size() >= capacity || size >= capacity) {
			resize(capacity * 2);
		}
		array[size] = item;
		size++;

	}

	public T pop(int stackNum) {
		if (isEmpty(stackNum)) {
			throw new EmptyStackException();

		}

		List<Integer> integers = map.get(stackNum);
		
		Integer index = integers.get(integers.size() - 1);
		T x = array[index];
		integers.remove(index);
		array[index] = null;
		size--;
		
		return x;
	}

	public T peek(int stackNum) {
		if (isEmpty(stackNum)) {
			throw new EmptyStackException();

		}
		List<Integer> integers = map.get(stackNum);
		Integer integer = integers.get(integers.size() - 1);
		T x = array[integer];
		return x;
	}

	public int size(int stackNum) {
		List<Integer> integers = map.get(stackNum);
		Integer integer = integers.size();
		return integer.intValue();
	}

	public boolean isEmpty(int stackNum) {

		return size(stackNum) == 0;
	}

	private void resize(int size) {

		T[] newArray = (T[]) new Object[size];
		for (int i = 0; i < array.length && i < newArray.length; i++) {
			newArray[i] = array[i];
		}

		this.array = newArray;
		this.capacity = array.length;

	}

	public static void main(String[] args) {
		CCI_03_01_ThreeInOneStack<Integer> cci_03_01_ThreeInOneStack = new CCI_03_01_ThreeInOneStack<>();

		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 3; j++) {
				cci_03_01_ThreeInOneStack.push(i, ThreadLocalRandom.current().nextInt(0, 5));
			}
		}
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(cci_03_01_ThreeInOneStack.peek(i));
				System.out.println(cci_03_01_ThreeInOneStack.pop(i));
			}
		}

	}

}
