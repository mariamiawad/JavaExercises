package crackingcodinginterview.chapter04;

public class CCI_04_02_MinimalTree {
	class Node {
		int key;
		Node left, right;

		Node(int key) {
			this.key = key;
		}
	}

	private static Node root;

	public void createTreeWithMinimalHeight(int[] array) {
		root = createTreeWithMinimalHeight(array, 0, array.length - 1);
	}

	private Node createTreeWithMinimalHeight(int[] array, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		Node node = new Node(array[mid]);
		node.left = createTreeWithMinimalHeight(array, start, mid - 1);
		node.right = createTreeWithMinimalHeight(array, mid + 1, end);
		return node;

	}

	public void preOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	public static void main(String[] args) {
		CCI_04_02_MinimalTree client = new CCI_04_02_MinimalTree();
		client.createTreeWithMinimalHeight(new int[] { 1, 3, 5, 6, 7, 9, 11, 16 });
		client.preOrderTraversal(root);

	}

}
