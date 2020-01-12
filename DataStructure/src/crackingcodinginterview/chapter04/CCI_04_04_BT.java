package crackingcodinginterview.chapter04;

public class CCI_04_04_BT<Key extends Comparable<Key>> {

	private Node root;

	public class Node {
		Key key;
		public Node left;
		public Node right;

		public Node(Key key) {
			this.key = key;
		}
	}

	public CCI_04_04_BT(Key key) {
		this.root = new Node(key);
	}

	public Node getRoot() {
		return root;
	}

	public boolean isBalanced() {

		return isBalanced(root);
	}

	private int height(Node node) {
		if (node == null) {
			return 0;
		}
		return Math.max(height(node.left), height(node.right)) + 1;
	}

	private boolean isBalanced(Node node) {
		if (node == null) {
			return true;
		}

		return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
	}

	public static void main(String[] args) {
		CCI_04_04_BT<Integer> tree = new CCI_04_04_BT<>(3);
		CCI_04_04_BT<Integer>.Node root = tree.getRoot();
		root.left = tree.new Node(6);
		root.left.left = tree.new Node(1);

		System.out.println(tree.isBalanced()); // should be false;

		root.right = tree.new Node(5);

		System.out.println(tree.isBalanced()); // should be true

	}

}
