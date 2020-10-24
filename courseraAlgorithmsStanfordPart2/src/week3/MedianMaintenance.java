package week3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MedianMaintenance {
	static Queue<Integer> minHeap = new PriorityQueue<Integer>();
	static Queue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
	static int size = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 10000; i++) {
			int n = scanner.nextInt();
			if (size == 0) {
				maxHeap.add(n);
			} else if (size % 2 == 0) {
				if (n > minHeap.peek()) {
					maxHeap.add(minHeap.remove());
					minHeap.add(n);
				} else {
					maxHeap.add(n);
				}

			} else {
				if (n < maxHeap.peek()) {
					minHeap.add(maxHeap.remove());
					maxHeap.add(n);
				} else {
					minHeap.add(n);
				}
			}
			size++;
			sum += getMedian();
		}
		System.out.println(sum % 10000);

	}

	static int getMedian() {
		return maxHeap.peek();
	}
}
