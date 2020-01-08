
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class RunningMedian {

	static Comparator<Integer> maxHeapComparator = new Comparator<Integer>() {

		@Override
		public int compare(Integer arg0, Integer arg1) {

			if ((arg0).compareTo(arg1)>0) {
				return 1;
			}
			else if (arg0.compareTo(arg1)<0) {
				return -1;
			}
			return 0;
		}
	};
	static Comparator<Integer> minHeapComparator = new Comparator<Integer>() {

		@Override
		public int compare(Integer arg0, Integer arg1) {

			if (arg0.compareTo(arg1)<0) {
				return 1;
			}
			else if (arg0.compareTo(arg1)>0) {
				return -1;
			}
			return 0;
		}
	};
	static PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(minHeapComparator);
	static PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>(maxHeapComparator);

	
	private static void getMedian(int array) {
		if(maxQueue.isEmpty()&& minQueue.isEmpty()) {
			maxQueue.add(array);
		}
		else if(array>= maxQueue.peek()){
			minQueue.add(array);

		}
		else if (minQueue.isEmpty()) {
			minQueue.add(maxQueue.peek());
			maxQueue.remove(maxQueue.peek());
			maxQueue.add(array);

		}
		else {
			maxQueue.add(array);
		}

		if(Math.abs(minQueue.size() -maxQueue.size())>1) {
			if(minQueue.size()> maxQueue.size()) {
				maxQueue.add(minQueue.peek());
				minQueue.remove();
			}
			else {
				minQueue.add(maxQueue.peek());
				maxQueue.remove();
			}
		}
		if(!((maxQueue.size() + minQueue.size())%2==0)) {
			if(maxQueue.size() > minQueue.size())
				System.out.println(maxQueue.peek()*1.0);
			else 
				System.out.println(minQueue.peek()*1.0);
		}
		else  { 

			System.out.println((maxQueue.peek()+ Double.parseDouble(minQueue.peek().toString()))/2.0);
		}

		


	}

	

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			int aItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			a[i] = aItem;

			getMedian(a[i]);


		}
		scanner.close();
	}
}
