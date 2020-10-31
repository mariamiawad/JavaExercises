import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Try {

	public static void main(String[] args) throws FileNotFoundException {
		
		//set up two heaps: one supports extract_min, the other supports extract_max
		
		//create a new object and add a custom comparator that provides the "MinHeap" behaviour.
	    PriorityQueue<Integer> minheap=new PriorityQueue<Integer>(1,new Comparator<Integer>() {		//this is the 2nd-half, larger heap
	        @Override
	        public int compare(Integer o1, Integer o2) {
	            return o1-o2;
	        }
	    });
	    
	    //create a new object and add a custom comparator that provides the "MaxHeap" behaviour.
	    PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>(1,new Comparator<Integer>() {		//this is the 1st-half, smaller heap
	        @Override
	        public int compare(Integer o1, Integer o2) {
	            return o2-o1;
	        }
	    });
		
		
		//read integer from file one at a time
		Scanner scanner = new Scanner(System.in);			//test10000.txt
		
		
		int next_int;
		int iMedian;
		int sumMedian = 0;
		int i = 0;
		while(i<10000) {								
			next_int = scanner.nextInt();	
			
			//add new integer to one of the heaps
			//for the first entry, just add
			if (minheap.size() == 0 || maxheap.size() == 0) {
				maxheap.offer((Integer)next_int);
			}
			else {
			
			//if incoming integer is smaller than the max of maxheap(1st half), then add to maxheap
			if (next_int <= maxheap.peek()) {
				maxheap.offer((Integer)next_int);
			}
			//if incoming integer is larger than the min of minheap(2nd half), then add to minheap
			else if (next_int >= minheap.peek()) {
				minheap.offer((Integer)next_int);
			}
			//if incoming integer is btw max of maxheap and min of minheap, add to one with smaller size
			else {
				if (minheap.size() > maxheap.size()) {
					maxheap.offer((Integer)next_int);
				}
				//default is to minheap
				else {
					minheap.offer((Integer)next_int);
				}
			}
			
			}
			
			//rebalance sizes of minheap and maxheap
			while (Math.abs(maxheap.size()-minheap.size()) > 1) {
				if (maxheap.size() > minheap.size()) {
					minheap.add(maxheap.poll());
				}
				else {
					maxheap.add(minheap.poll());
				}
			}
			
			//System.out.println("maxheap has max: "+maxheap.peek());
			//System.out.println("minheap has min: "+minheap.peek());
			
			
			//calculate median
			if ((maxheap.size() + minheap.size()) / 2 == 0) {
				iMedian = maxheap.peek();
			}
			else {
				if (maxheap.size() >= minheap.size()) {
					iMedian = maxheap.peek();
				}
				else {
					iMedian = minheap.peek();
				}
			}
			
			//System.out.println("current median is: "+iMedian);
			//System.out.println("===============================");
			
			
			//add current median to sum
			sumMedian += iMedian;
			i++;
		}
		scanner.close();
		
		//report sum mod 10,000
		System.out.println("sum of 10,000 medians modulo 10,000 is: " + (sumMedian /* % 10_000 */));

	}

}