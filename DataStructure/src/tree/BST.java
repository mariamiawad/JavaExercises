package tree;

public class BST<Key extends Comparable<Key>> {
	
	class Node {
		Key key;
		Node left, right;
		
		Node(Key key) {
			this.key = key;
		}
	}
	
	public Node search(Key key) {
		// TODO - Implement this method
		return null;
	}
	
	public void insert(Key key) {
		// TODO - Implement this method
		
	}
	
	public void delete(Key key) {
		// TODO - Implement this method
		
	}
	
	public Iterable<Key> inorder() {
		// TODO - Implement this method
		return null;
	}
	
	public Iterable<Key> preorder() {
		// TODO - Implement this method
		return null;
	}
	
	public Iterable<Key> postorder() {
		// TODO - Implement this method
		return null;
	}	

}
