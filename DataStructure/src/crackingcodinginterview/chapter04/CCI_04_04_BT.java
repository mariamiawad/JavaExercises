package crackingcodinginterview.chapter04;

public class CCI_04_04_BT<Key extends Comparable<Key>> {
	
	private Node root;

	class Node {
		Key key;
		Node left;
		Node right;
		
		Node(Key key) {
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
		// TODO - Implement this
		return false;
	}

	public static void main(String[] args) {
		CCI_04_04_BT<Integer> tree = new CCI_04_04_BT<>(3);
		CCI_04_04_BT<Integer>.Node root = tree.getRoot();
		root.left = tree.new Node(6);
		root.left.left = tree.new Node(1);
		
		System.out.println(tree.isBalanced()); // should be false;
		
		 root.right = tree.new Node(5);
		
		
		System.out.println(tree.isBalanced()); // should be true
		
		// TODO - add more test cases in a separate file
	}

}
