import java.util.*;
import java.util.Map.Entry;

import javax.print.attribute.Size2DSyntax;
import javax.swing.RootPaneContainer;
import javax.swing.text.TabableView;
import org.w3c.dom.ls.LSException;

import java.io.*;

//class Node {
//    Node left;
//    Node right;
//    int data;
//    
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}

class TopView {

	/*
	 * 
	 * class Node int data; Node left; Node right;
	 */
	 
	
static Stack<Node> list = new Stack<Node>();
static Map<Node, Integer> map = new HashMap<Node, Integer>();
	public static void topView(Node root) {
	  	if(root == null)
    		return;
	  	 if(root.left!=null) {
			  getleft(root);
		  }
//	System.out.println(root.data);
		
	
		System.out.println((root.data));
//		while (root.left!=null) {
//			System.out.println(root.left.data);
//			
//		}
	  if (root.right!=null) {
			getRitght(root);
		}
	
//	  if (root.right!=null &&root.right.right!=null ) {
//			getMid(root.right);
//		}
	}
	
	public static void getRitght(Node root) {
		Queue<Node> lisNode = new LinkedList<Node>();
		while (root.right!=null) {

			root = root.right;
			lisNode.add(root);
			
			
			
		}
		while (!lisNode.isEmpty()) {
			System.out.println(lisNode.poll().data+" ");
			
		}
		
	}
	public static void getleft(Node root) {
		
		Stack<Node> lisNodes = new Stack<Node>();
		while (root.left!=null) {
			
			root = root.left;
			
			lisNodes.push(root);
//			getMid(root.left);
		}
		while (!lisNodes.isEmpty()) {
			System.out.println(lisNodes.pop().data);
			
		}
		
	}
	
//	public static void getMid(Node root) {
//if (root.left == null || root.left.right==null) {
//	return;
//}
//
//		Stack<Node> lisNodes = new Stack<Node>();
//		while (root.left!=null &&root.left.right!=null) {
//			root = root.left.right;
//			lisNodes.push(root);
//			
//			
//		}
//		while (!lisNodes.isEmpty()) {
//			System.out.println(lisNodes.pop().data);
//			
//		}
	
//			for (Entry<Node, Integer> entry : map.entrySet()) {
//				System.out.print(entry.getValue() + " ");
//				topView(entry.getKey().right);
//			
//		}
//		for (Entry<Node, Integer> entry : map.entrySet()) {
//			System.out.print(entry.getValue() + " ");
//			topView(entry.getKey().right);
//			
//			
//			}
		

		
//	  	}
//	  	if(!map.containsKey(root.right)) {
//	  	for (Entry<Node, Integer> entry : map.entrySet()) {
//			System.out.print(entry.getValue()+ " ");
//			topView(root.right);
//		  	
//		}}
	

//		 if(root.left!=null) {
//
//				list.add(root);
//				
//				topView(root.left);
////			 list.add(root.right);
//			}
//		
//		if ((root.right == null))  {
//			list.add(root);
//			for (Node node : list) {
//		
//				System.out.println(node.data + " ");
//			}
//			for (int i = list.size()-1; i > 0; i--) {
//				list.remove(i);
//			}
//			root = list.get(0);
//			
//			
//		}
//	
//		if(root.right!=null) {
//			list.add(root);
//			topView(root);
//			
//		}
//		

//		else if (root.right != null) {
//
//			list.add(root);
//			topView(root.right);
////			else if(root.right!=null) {
////				opView(root.right);
////			}
//		}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}

		scan.close();
		topView(root);
	}
}