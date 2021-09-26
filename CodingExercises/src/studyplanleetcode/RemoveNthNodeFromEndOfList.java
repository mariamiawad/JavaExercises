package studyplanleetcode;

import jdk.internal.org.jline.terminal.Size;
import studyplanleetcode.MiddleOfTheLinkedList.ListNode;

public class RemoveNthNodeFromEndOfList {
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

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode currentListNode = head;
		int size = 0;

		while (currentListNode != null) {
			size++;
			currentListNode = currentListNode.next;
		}
		if (head == null) {
			return null;
		}

		currentListNode = head;
		int count = size - n;
		if (count == 0) {
			return currentListNode.next;
		}
		while (count > 1) {
			currentListNode = currentListNode.next;
			count--;
		}
		if (currentListNode.next == null) {
			return null;
		}
		currentListNode.next = currentListNode.next.next;

		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		ListNode nodes = removeNthFromEnd(head, 2);
		ListNode result = nodes;
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

}
