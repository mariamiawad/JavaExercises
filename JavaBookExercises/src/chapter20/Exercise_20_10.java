package chapter20;

import java.util.Collection;
import java.util.PriorityQueue;

public class Exercise_20_10 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("George");
		queue.add("Jim");
		queue.add("John");
		queue.add("Blake");
		queue.add("Kevin");
		queue.add("Michael");
		Collection<String> queue2 = new PriorityQueue<>();
		queue2.add("George");
		queue2.add("Katie");
		queue2.add("Kevin");
		queue2.add("Michelle");
		queue2.add("Ryan");
		PriorityQueue<String> collection = new PriorityQueue<>(queue);
		collection.addAll(queue2);
		System.out.println("Union = "+collection);
		collection =new PriorityQueue<>(queue);
		collection.retainAll(queue2);
		System.out.println("intersection ="+collection);
		collection = new PriorityQueue<>(queue);
		collection.removeAll(queue2);
		System.out.print("difference = "+collection );
		collection = new PriorityQueue<>(queue2);
		collection.removeAll(queue);
		System.out.println(collection);
	}
}
