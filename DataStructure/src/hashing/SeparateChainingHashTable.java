package hashing;

import java.util.LinkedList;
import java.util.Random;

public class SeparateChainingHashTable<Key> {
	private int capacity;
	private LinkedList<Key>[] table;
	
	public SeparateChainingHashTable(int capacity) {
		this.capacity = capacity;
		this.table = (LinkedList<Key>[]) new Object [capacity];
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
	
	// This method is for verification only
	// It should not be part of a real hash table API
	public void verifiyUniformDistribution() {
		int violations = 0;
		for (LinkedList<Key> linkedList : table) {
			if (linkedList == null || linkedList.isEmpty() || linkedList.size() < 3 || linkedList.size() > 5) {
				violations++;
			}
		}
		System.out.printf("You have %d violations in a hash table of size %d", violations, capacity);
	}

	public static void main(String[] args) {
		// TODO - You should experiment with changing the size and number of elements and observe the performance
		// Better yet, refactor this into a test cases to make sure you run multiple experiments at the same time
		SeparateChainingHashTable<Integer> hashTable = new SeparateChainingHashTable<>(100);
		
		Random random = new Random();
		
		for (int i = 0; i < 500; i++) {
			hashTable.put(random.nextInt());
		}
	}

}
