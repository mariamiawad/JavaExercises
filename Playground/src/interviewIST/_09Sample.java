package interviewIST;

public class _09Sample {
	int sum = 0;

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
	public boolean isLeaf(TreeNode root) {
		if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null) {
			return true;
		}
		return false;
	}
	public int sumOfLeftLeaves(TreeNode root) {
		int sum = 0;
		if (root != null) {
			if (isLeaf(root.left)) {
				sum += root.left.val;
			}
			else {
				sum += sumOfLeftLeaves(root.left);
			}
			sum += sumOfLeftLeaves(root.right);
			
		}
		return sum;
	}
	public static void main(String[] args) {
		 _09Sample sample = new _09Sample();
		 TreeNode root = new TreeNode(3);
		 root.left = new TreeNode(9);
		 root.right = new TreeNode(20);
		 root.right.left = new TreeNode(15);
		 root.right.right =  new TreeNode(7);
		 System.out.println(sample.sumOfLeftLeaves(root));
	}

	

}
