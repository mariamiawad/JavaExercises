package tree;

import java.util.ArrayList;
import java.util.Iterator;

public class BST<Key extends Comparable<Key>> implements Iterable<Key> {
	private Node root = null;
	ArrayList<Key> list;
	class Node {
		Key key;
		Node left, right;
		Node(Key key) {
			this.key = key;
		}
	}

	public Node search(Key key) {
		Node node = search(root, key);
		return node;
	}

	private Node search(Node node, Key key) {
		Node current = root;
		if (root.key == null || root.key.compareTo(key) == 0) {
			return root;
		} else if (current.key.compareTo(key) > 0) {
			return search(node.left, key);
		}

		return search(node.right, key);

	}

	public void insert(Key key) {
		insert(root, key);
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
		delete(root, key);
	}

	private Node delete(Node root,Key key) {
		if (root == null) {
			return root;
		}
		else if (key.compareTo(root.key)< 0) {
			root.left = delete(root.left, key);
		}
		else if (key.compareTo(root.key)>0) {
			root.right = delete(root.right, key);
		}
		else {
			if (root.left == null) {
				return root.right;
			}
			else if (root.right == null) {
				return root.left;
			}
			root = minValue(root.right);
			root.right = delete(root, key);
		}
		return root;
	}

	public Iterable<Key> inorder() {
		list = inorder(root);
		return list;
	}

	private ArrayList<Key> inorder(Node root) {
		list = new ArrayList<>();
		inorder(root.left);
		list.add(root.key);
		inorder(root.right);
		return list;

	}

	

	public Iterable<Key> preorder() {
		list = preorder(root);
		return list;
	}
	private ArrayList<Key> preorder(Node root) {
		list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		list.add(root.key);
		preorder(root.left);
		preorder(root.right);
		return list;

	}

	public Iterable<Key> postorder() {
		list = postorder(root);
		return list;
	}
	private ArrayList<Key> postorder(Node root) {
		list = new ArrayList<>();
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
