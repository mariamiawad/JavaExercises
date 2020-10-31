/**
 * https://www.youtube.com/watch?v=7lbwfkCfNQ4&ab_channel=KeepOnCoding
 */

package days;

import java.util.ArrayList;
import java.util.List;

import helper.Period;


public class DayThree {

	public static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		Node tree1 = new Node(5, new Node(3, new Node(1, null, null), null),
				new Node(7, new Node(6, null, null), null));
		Node tree2 = new Node(3, new Node(1, null, null),
				new Node(6, new Node(5, null, null), new Node(7, null, null)));
		DayThree dayThree = new DayThree();
		System.out.println(dayThree.helper(tree1, tree2));
	}

	public boolean helper(Node tree1, Node tree2) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		inorderTraversal(tree1, list1);
		// traverse all the nodes in the binary search tree
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		inorderTraversal(tree2, list2);
		
		// put all nodes in inorder traversal in an arrayList
		// compare the two arraysList
		if (list1.size()!=list2.size()) {
			return false;
		}
		for (int i = 0; i < list1.size() ; i++) {
			if (list1.get(i)!= list2.get(i)) {
				return false;
			}
		}
		return true;

	}

	private void inorderTraversal(Node tree, List<Integer>list) {
		if (tree == null) {
			return ;
		}
		inorderTraversal(tree.left, list);
		list.add(tree.value);
		inorderTraversal(tree.right, list);
		
	}
	
	// https://www.youtube.com/watch?v=3Q_oYDQ2whs&ab_channel=Cl%C3%A9mentMihailescu
	public List<Period> findFreeSlot(List<Period> calendar1, List<Period> calendar2, Period limit1, Period limit2, int duration) {
		return null;
	}

}
