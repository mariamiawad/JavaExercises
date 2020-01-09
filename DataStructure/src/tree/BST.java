package tree;

import java.util.ArrayList;
import java.util.Iterator;

public class BST<Key extends Comparable<Key>> implements Iterable<Key> {
	Node root;
	ArrayList<Key> list;

	class Node {
		Key key;
		Node left, right;

		Node(Key key) {
			this.key = key;
		}
	}

	public Node search(Key key) {
		Node node = search(this.root, key);
		return node;
	}

	private Node search(Node node, Key key) {
		if (this.root.key == null || this.root.key.compareTo(key) == 0) {
			return this.root;
		} else if (this.root.key.compareTo(key) > 0) {
			return search(this.root.left, key);
		}

		return search(this.root.right, key);

	}

	public void insert(Key key) {
		this.root = insert(this.root, key);
	}

	private Node insert(Node root, Key key) {
		if (root == null) {
			root = new Node(key);
		}
		if (key.compareTo(root.key) < 0) {
			root.left = insert(root.left, key);
		} else if (key.compareTo(root.key) > 0) {
			root.right = insert(root.right, key);
		}
		return root;

	}

	public void delete(Key key) {
		this.root = delete(root, key);
	}

	private Node delete(Node root, Key key) {
		if (root == null) {
			return root;
		
		} else if (key.compareTo(root.key) < 0) {
			root.left = delete(root.left, key);
		} else if (key.compareTo(root.key) > 0) {
			root.right = delete(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			root = minValue(root.right);
			root.right = delete(root, key);
		}
		return root;
	}

	public Iterable<Key> inorder() {

		list = new ArrayList<>();
		list = inorder(this.root);
		return list;
	}

	private ArrayList<Key> inorder(Node root) {
		if (root== null) {
			return list;
		}
		if (root.left != null) {
			inorder(root.left);
		}
		list.add(root.key);
		if (root.right != null) {
			inorder(root.right);
		}

		return list;

	}

	public Iterable<Key> preorder() {
		list = new ArrayList<>();
		list = preorder(this.root);
		return list;
	}

	private ArrayList<Key> preorder(Node root) {
		if (root == null) {
			return list;
		}
		list.add(root.key);
		preorder(root.left);
		preorder(root.right);
		return list;

	}

	public Iterable<Key> postorder() {
		list = new ArrayList<>();
		list = postorder(this.root);
		return list;
	}

	private ArrayList<Key> postorder(Node root) {

		if (root == null) {
			return list;
		}
		postorder(root.left);
		postorder(root.right);
		list.add(root.key);
		return list;

	}

	private Node minValue(Node root) {

		if (root.left != null) {
			return minValue(root.left);
		}

		return root;
	}

	@Override
	public Iterator<Key> iterator() {
		return list.iterator();
	}

}
