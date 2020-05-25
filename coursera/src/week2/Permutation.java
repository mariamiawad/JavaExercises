package week2;


import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
	public static void main(String[] args) {
		RandomizedQueue<String> queue = new RandomizedQueue<>();
		while (!StdIn.isEmpty()) {
			queue.enqueue(StdIn.readString());
		}
		int i = 0;
		int k = Integer.parseInt(args[0]);
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext() && i < k) {
			StdOut.println(iterator.next());
			i++;
		}
	}

}
