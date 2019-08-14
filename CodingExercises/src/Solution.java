

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static class MyQueue <E>{
	       
        Stack<E> stack1 = new Stack<E>();
        Stack<E> stack2 = new Stack<E>();
       public void enqueue(E element){
           E data = element;
           stack1.push(data);
           if(stack2.isEmpty()) {
     		   stack2.push(data);
     	   }
    	   
    	   
        	
           
       }
       public E dequeue() {
    	  stack2 = new Stack<>();
    	   while(!stack1.isEmpty()) {
    		   stack2.push(stack1.pop());
    	   }
    	   return stack2.pop();
    	   
    	
       }
       public E peek() {
    	
    	   
           return stack2.peek();
           
       }
   }
    public static void main(String[] args) {
        
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
