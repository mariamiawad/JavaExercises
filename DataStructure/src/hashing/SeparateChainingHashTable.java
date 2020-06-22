package hashing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class SeparateChainingHashTable<Key> {
	private int capacity;
	private LinkedList<ArrayList<Key>> table;
	private int ARRAY_SIZE = 5;

	public SeparateChainingHashTable(int capacity) {
		this.capacity = capacity;
		this.table = new LinkedList<>();
		for (int i = 0; i < capacity; i++) {
			table.add(new ArrayList<>(ARRAY_SIZE));
		}

	}

	public void put(Key key) {

		int i = hash(key);
		if (capacity <= table.size()) {
			resize(2 * capacity);
		}

		table.get(i).add(key);
	}

	public boolean contains(Key key) {
		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < table.get(i).size(); j++) {
				if (table.get(i).contains(key)) {
					return true;
				}
			}
		}
		return false;
	}

	public void remove(Key key) {
		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < table.get(i).size(); j++) {
				if (table.get(i).contains(key)) {
					table.get(i).remove(key);
					return;
				}
			}
		}

	}

	private void resize(int size) {
		LinkedList<ArrayList<Key>> temp = new LinkedList<>();
		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < table.get(i).size(); j++) {
				temp.add(table.get(i));
			}
			

		}

		this.capacity = temp.size();
		this.table = temp;
	}

	private int hash(Key key) {
		return (key.hashCode() & 0x7fffffff) % capacity;
	}

	// This method is for verification only
	// It should not be part of a real hash table API
	public void verifiyUniformDistribution() {
		int violations = 0;
		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < table.get(i).size(); j++) {
				if (table.get(i).get(j) == null || table.get(i).isEmpty() || table.get(i).size() < 3 || table.get(i).size() > 5) {
					violations++;
				}
			}
		}
		System.out.printf("You have %d violations in a hash table of size %d", violations, capacity);
		
	}

	public static void main(String[] args) {
		// TODO - You should experiment with changing the size and number of elements
		// and observe the performance
		// Better yet, refactor this into a test cases to make sure you run multiple
		// experiments at the same time
		SeparateChainingHashTable<Integer> hashTable = new SeparateChainingHashTable<>(100);

		Random random = new Random();

		for (int i = 0; i < 500; i++) {
			hashTable.put(random.nextInt());
		}
	}

}
