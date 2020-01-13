package testtree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import crackingcodinginterview.chapter04.CCI_04_04_BT;
import crackingcodinginterview.chapter04.CCI_04_04_BT.Node;

public class TestIsBalancedTree {

	@Test
	public void testIsBalanced_ReturnFalse() {
		CCI_04_04_BT<Integer> tree = new CCI_04_04_BT<>(3);
		Node root = tree.getRoot();
		root.left = tree.new Node(6);
		root.left.left = tree.new Node(1);
		assertEquals(tree.isBalanced(), false);

	}

	@Test
	public void testIsBalanced_ReturnTrue() {
		CCI_04_04_BT<Integer> tree = new CCI_04_04_BT<>(3);
		Node root = tree.getRoot();
		root.left = tree.new Node(6);
		root.left.left = tree.new Node(1);
		root.right = tree.new Node(5);
		assertEquals(tree.isBalanced(), true);

	}

	@Test
	public void testIsBalancedOfTree_ReturnTrue() {
		CCI_04_04_BT<Integer> tree = new CCI_04_04_BT<>(3);
		Node root = tree.getRoot();
		root.left = tree.new Node(30);
		root.left.left = tree.new Node(25);
		root.left.right = tree.new Node(40);
		root.right = tree.new Node(60);
		root.right.left = tree.new Node(55);
		root.right.right = tree.new Node(70);
		root.right.right.right = tree.new Node(100);
		assertEquals(tree.isBalanced(), true);

	}

	@Test
	public void testIsBalancedOfBinarySearchTree_ReturnTrue() {
		CCI_04_04_BT<Integer> tree = new CCI_04_04_BT<>(50);
		Node root = tree.getRoot();
		root.left = tree.new Node(30);
		root.left.left = tree.new Node(25);
		root.left.right = tree.new Node(40);
		root.right = tree.new Node(60);
		root.right.left = tree.new Node(55);
		root.right.right = tree.new Node(70);
		root.right.right.right = tree.new Node(100);
		assertEquals(tree.isBalanced(), true);

	}

	@Test
	public void testIsBalancedOfBinarySearchTree_ReturnFalse() {
		CCI_04_04_BT<Integer> tree = new CCI_04_04_BT<>(1);
		Node root = tree.getRoot();
		root.left = tree.new Node(2);
		root.right = tree.new Node(3);
		root.left.left = tree.new Node(4);
		root.left.right = tree.new Node(5);
		root.left.left.left = tree.new Node(8);
		assertEquals(false, tree.isBalanced());

	}
}
