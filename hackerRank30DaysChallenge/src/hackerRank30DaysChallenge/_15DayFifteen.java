package hackerRank30DaysChallenge;
import java.io.*;
import java.util.*;

public class _15DayFifteen {
	
	static class Node {
		int data;
		Node next;
		Node(int d) {
	        data = d;
	        next = null;
	    }
	}

	static class Solution {

	    public  Node insert(Node head,int data) {
	        //Complete this method
	        if(head == null){
	            return new Node(data);
	        }
	        Node currentNode = head;
	        while(currentNode.next!=null){
	            currentNode = currentNode.next;
	        }
	        currentNode.next = new Node(data);
	        return head;

	    }

		public  void display(Node head) {
	        Node start = head;
	        while(start != null) {
	            System.out.print(start.data + " ");
	            start = start.next;
	        }
	    }

	}
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();
        Solution solution = new Solution();
        while(N-- > 0) {
            int ele = sc.nextInt();
            head = solution.insert(head,ele);
        }
        solution.display(head);
        sc.close();
    }
	
}
