package leetCode30DaysChallenge;

public class _11DayEleven {

	// Definition for a binary tree node.
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	static class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root);
		}

	    int diameter(TreeNode root) 
	    { 
	        if (root == null) 
	            return 0; 
	        int lheight = height(root.left); 
	        int rheight = height(root.right); 
	  
	        int ldiameter = diameter(root.left); 
	        int rdiameter = diameter(root.right); 
	  
	        return Math.max(lheight + rheight, 
	                        Math.max(ldiameter, rdiameter)); 
	  
	    } 
	    static int height(TreeNode node) 
	    { 
	        if (node == null) 
	            return 0; 
	  
	        return (1 + Math.max(height(node.left), height(node.right))); 
	    } 
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(3);
		treeNode.left.left = new TreeNode(4);
		treeNode.left.right = new TreeNode(5);
		System.out.println(solution.diameterOfBinaryTree(treeNode));
	}
}
