package codingLeetCode;

import java.util.ArrayList;

import codingLeetCode.AddTwoNumbers.ListNode;

public class MergeKSortedLists {
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

		if (list == null) {
			list = new_node;
		} else {
			ListNode last = list;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new_node;
		}

		return list;
	}

	public static ListNode mergeKLists(ListNode[] lists) {

		sort(lists);
		ListNode currentListNode = null;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < lists.length; i++) {
			currentListNode = lists[i];
		while (currentListNode!=null) {
			list.add(currentListNode.val);
			currentListNode = currentListNode.next;
		}
			
		}
		ListNode nodes = null;
		for (int i = 0; i < list.size(); i++) {
			nodes = insert(nodes, list.get(i));
		}
		return nodes;
	}

	public static void sort(ListNode[] array) {
		int n = array.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}
		for (int i = n - 1; i >= 0; i--) {
			swap(array, 0, i);
			heapify(array, i, 0);
		}

	}

	private static void heapify(ListNode[] array, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && array[l].val > (array[i].val)) {
			largest = l;
		}
		if (r < n && array[r].val > (array[largest].val)) {
			largest = r;
		}
		if (largest != i) {
			swap(array, i, largest);
			heapify(array, n, largest);
		}
	}

	private static void swap(ListNode[] array, int i, int j) {
		int temp = array[i].val;
		array[i].val = array[j].val;
		array[j].val = temp;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(4);
		list.next.next = new ListNode(5);
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);
		ListNode list3 = new ListNode(2);
		list3.next = new ListNode(6);
		ListNode[] lists = new ListNode[3];
		lists[0] = list;
		lists[1] = list2;
		lists[2] = list3;
		System.out.println(mergeKLists(lists));
	}
}
