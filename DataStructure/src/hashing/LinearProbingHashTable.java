package hashing;

import java.util.Random;

public class LinearProbingHashTable<Key> {
	private int capacity;
	private Key[] table;
	
	public LinearProbingHashTable(int capacity) {
		this.capacity = capacity;
		this.table = (Key[]) new Object [capacity];
	}
	
	public void put(Key key) {
		// TODO - Implement this method;
	}
	
	public boolean contains(Key key) {
		// TODO - Implement this method
		return false;
	}
	
	public void remove(Key key) {
		// TODO - Implement this method
	}

	public static void main(String[] args) {
		// TODO - You should experiment with changing the size and number of elements and observe the performance
		// Better yet, refactor this into a test cases to make sure you run multiple experiments at the same time
		LinearProbingHashTable<Integer> hashTable = new LinearProbingHashTable<>(1000);
		
		Random random = new Random();
		
		for (int i = 0; i < 500; i++) {
			hashTable.put(random.nextInt());
		}
	}

}
