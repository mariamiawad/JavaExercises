package codingLeetCode;

import java.math.BigDecimal;
import java.util.Scanner;
//https://leetcode.com/problems/add-two-numbers/submissions/
public class AddTwoNumbers {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	private static ListNode insert(ListNode list, int data) {
		// Create a new node with given data
		ListNode new_node = new ListNode(data);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list == null) {
			list = new_node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			ListNode last = list;
			while (last.next != null) {
				last = last.next;
			}

			// Insert the new_node at last node
			last.next = new_node;
		}

		// Return the list by head
		return list;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode node1 = getReversedList(l1);
		ListNode node2 = getReversedList(l2);
		String string = "";
		ListNode current = node1;
		while (current != null) {
			string += current.val + "";
			current = current.next;
		}
		BigDecimal number1 = new BigDecimal(string);
		current = node2;
		string = "";
		while (current != null) {
			string += current.val + "";
			current = current.next;
		}
		BigDecimal number2 = new BigDecimal(string);
		BigDecimal sum = number1.add(number2);
		String s = sum + "";
		string = "";
		ListNode node = new ListNode(Integer.parseInt(s.charAt(s.length() - 1) + ""));
		for (int i = s.length() - 2; i >= 0; i--) {
			node = insert(node, Integer.parseInt(s.charAt(i) + ""));
			string += s.charAt(i) + "";
		}

		return node;

	}

	private static ListNode getReversedList(ListNode node) {
		ListNode current = node;
		ListNode previous = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;

		}
		node = previous;
		return node;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ListNode l1 = new ListNode(9);

//		for (int i = 0; i < 2; i++) {
//			l1 = insert(l1,scanner.nextInt());
//		}
		ListNode l2 = new ListNode(1);
		for (int i = 0; i < 9; i++) {
			l2 = insert(l2, 9);
		}
		addTwoNumbers(l1, l2);
	}
}
