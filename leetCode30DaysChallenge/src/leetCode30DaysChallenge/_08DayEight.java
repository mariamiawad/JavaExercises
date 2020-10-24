package leetCode30DaysChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _08DayEight {

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

	static class Solution {
		private static ListNode insert(ListNode listNode, int data) {
			ListNode newListNode = new ListNode(data);
			newListNode.next = null;
			if (listNode == null) {
				listNode = newListNode;
			} else {
				ListNode lastListNode = listNode;
				while (lastListNode.next != null) {
					lastListNode = lastListNode.next;
				}
				lastListNode.next = newListNode;
			}
			return listNode;
		}

		public static ListNode middleNode(ListNode head) {
			int count = 0;
			ListNode current = head;
			while (current != null) {
				count++;
				current = current.next;
			}
			int i = 0;
			current = head;
			int middle = count / 2;
			ListNode ans = null;
				while (i < middle) {
					current = current.next;
					i++;
				}
				List<ListNode> list = new ArrayList<>();
//				if (middle % 2 != 0) {
//					current = current.next;
//				}
				
					
					while (current != null) {
						list.add(current);
						current = current.next;
					}
					for (int j = 0; j < list.size(); j++) {
						ans = insert(ans, list.get(j).val);
					}
				
				
			
			return ans;
		}
		
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ListNode listNode = null;
		for (int i = 0; i < n; i++) {
			listNode = Solution.insert(listNode, scanner.nextInt());
		}
		ListNode listNode2 = null;
		listNode2 = middleNode(listNode);
		while (listNode2!= null) {
			System.out.println(listNode2.val);
			listNode2 = listNode2.next;
		}
		scanner.close();
	}
	}
}
