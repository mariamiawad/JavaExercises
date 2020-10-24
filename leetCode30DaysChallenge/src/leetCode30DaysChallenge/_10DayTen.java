package leetCode30DaysChallenge;

import java.util.ArrayList;
import java.util.List;

public class _10DayTen {
	private List<Integer> stack = new ArrayList<>();
	int size =0;
	class MinStack {

	    /** initialize your data structure here. */
	    public MinStack() {
	        
	    }
	    
	    public void push(int x) {
	        stack.add(x);
	        size++;
	    }
	    
	    public void pop() {
	        stack.remove(size-1);
	        size--;
	        
	    }
	    
	    public int top() {
	       return stack.get(size-1);
	    }
	    
	    public int getMin() {
	    	
	    	int min = Integer.MAX_VALUE;
	        for (int i = 0; i < stack.size(); i++) {
				if (min > stack.get(i)) {
					min = stack.get(i);
				}
			}
	        return min;
	    }
	}

}
