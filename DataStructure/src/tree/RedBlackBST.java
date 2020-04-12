package tree;

public class RedBlackBST<Key extends Comparable<Key>> {
	Node root;
	private static final boolean RED = true;
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
		Node currentNode = root;
		while (currentNode != null) {
			int cmp = key.compareTo(currentNode.key);
			if (cmp < 0) {
				currentNode = currentNode.left;

			} else if (cmp > 0) {
				currentNode = currentNode.right;
			} else {
				return currentNode;
			}

		}
		return null;
	}

	public void insert(Key key) {
		root = insert(root, key);
	}

	private Node insert(Node node, Key key) {
		if (node == null) {
			return new Node(key);
		} else {
			int cmp = key.compareTo(node.key);
			if (cmp < 0) {
				node.left = insert(node.left, key);
			} else if (cmp > 0) {
				node.right = insert(node.right, key);
			} else {
				node.key = key;
			}
		}
		if (isRed(node.right) && !isRed(node.left)) {
			node = rotateLeft(node);

		}
		if (isRed(node.left) && isRed(node.left.left)) {
			node = rotateRight(node);

		}
		if (isRed(node.left) && isRed(node.right)) {
			flip(node);
		}

		return node;
	}

	public void delete(Key key) {
		// DO NOT IMPLEMENT THIS
	}

	private void flip(Node node) {
		node.color = RED;
		node.left.color = BLACK;
		node.right.color = BLACK;

	}

	private Node rotateLeft(Node node) {
		Node currentNode = node.right;
		if (node != null && node.right.color == RED) {

			node.right = currentNode.left;
			currentNode.left = node;
			currentNode.color = node.color;
			node.color = RED;
		}
		return currentNode;
	}

	private Node rotateRight(Node node) {
		Node currentNode = node.left;
		if (node != null && node.left.color == RED) {

			node.left = currentNode.right;
			currentNode.right = node;
			currentNode.color = node.color;
			node.color = RED;
		}
		return currentNode;
	}

	private boolean isRed(Node node) {
		if (node == null) {
			return false;
		}
		return node.color == RED;

	}

//	public static void main(String[] args) {
//		RedBlackBST<Character> tree = new RedBlackBST<Character>();
//		tree.insert('c');
//
//		assert tree.root != null;
//		assert tree.root.key == 'c';
//		assert tree.root.color == BLACK;
//
//		tree.insert('i');
//
//		assert tree.root.key == 'i';
//		assert tree.root.left.key == 'c';
//
//		assert tree.root.color == BLACK;
//		assert tree.root.left.color == RED;
//
//		assert tree.root.right == null;
//		assert tree.root.left.right == null;
//		assert tree.root.left.left == null;
//
//		tree.insert('v');
//
//		assert tree.root.key == 'v';
//		assert tree.root.left.key == 'i';
//		assert tree.root.left.left.key == 'c';
//
//		assert tree.root.color == BLACK;
//		assert tree.root.left.color == RED;
//		assert tree.root.left.left.color == RED;
//
//		assert tree.root.right == null;
//		assert tree.root.left.right == null;
//		assert tree.root.left.left.right == null;
//		assert tree.root.left.left.left == null;
//
//
//		tree.insert('m');
//
//		assert tree.root.key == 'i';
//		assert tree.root.right.key == 'v';
//		assert tree.root.left.key == 'c';
//		assert tree.root.right.left.key == 'm';
//
//		assert tree.root.color == BLACK;
//		assert tree.root.left.color == BLACK;
//		assert tree.root.right.color == BLACK;
//		assert tree.root.right.left.color == RED;
//
//		assert tree.root.left.left == null;
//		assert tree.root.left.right == null;
//		assert tree.root.right.left.left == null;
//		assert tree.root.right.left.right == null;
//		assert tree.root.right.right == null;
//	}
}
