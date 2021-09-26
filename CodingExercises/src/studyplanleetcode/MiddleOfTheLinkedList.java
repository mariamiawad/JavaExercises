package studyplanleetcode;

import studyplanleetcode.MiddleOfTheLinkedList.ListNode;

public class MiddleOfTheLinkedList {
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

	public static ListNode middleNode(ListNode head) {
		int size = 0;
		ListNode current = head;
		while (current != null) {
			size++;
			current = current.next;
		}
		ListNode node = new ListNode();
		int count = 0;

		count = size / 2;
		current = head;
		for (int i = 0; i < count; i++) {
			current = current.next;
		}
		return current;
	}
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		node.next.next.next.next.next = new ListNode(6);
		ListNode result1 = middleNode(node);
		ListNode result = result1;
		while (result!= null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
