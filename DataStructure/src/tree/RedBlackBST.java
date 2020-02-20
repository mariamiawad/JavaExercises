package tree;

public class RedBlackBST<Key extends Comparable<Key>> {
	Node root;
	private static final boolean RED   = true;
    private static final boolean BLACK = false;

	class Node {
		Key key;
		Node left, right;
		boolean color;

		Node(Key key) {
			this.key = key;
		}
	}

	public Node search(Key key) {
		// TODO - Implement this method
		return root;
	}

	public void insert(Key key) {
		// TODO - Implement this method
	}

	public void delete(Key key) {
		// DO NOT IMPLEMENT THIS
	}

}
