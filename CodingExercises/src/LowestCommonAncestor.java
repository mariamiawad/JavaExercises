import java.awt.image.DataBufferDouble;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

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

public class LowestCommonAncestor {

	/*
	 * class Node int data; Node left; Node right;
	 */

	public static Node lca(Node root, int v1, int v2) {
        Node temNode = root;
        if((v1 <= root.data && v2>root.data)|| (v2<= root.data && v1>root.data)) {
            return root;
        }
        else if((root.data>v1 && v1>v2) || (root.data >v2 && v2>v1)) {
            if(v1>v2) {
            temNode = getLeft(root, v1);
            }
            else {
                temNode = getLeft(root, v2);
            }
            
        }
        else if((root.data < v1 && v1>v2 )||(root.data < v2 && v2>v1)){
            if(v1>v2) {
                temNode = getRight(root, v1);
            }
            else {
                temNode = getRight(root, v2);
            }
        }
        return temNode;
    }
    
    
    

    public static Node getLeft(Node root, int v1) {
        Node temNode = root;
        while (temNode.left != null) {
            if (temNode.data == v1) {
                return temNode;
            }
            temNode = temNode.left;
            if (temNode.data<v1) {
            break;
                
            }
        }
        
        return temNode;
    }

    public static Node getRight(Node root, int v1) {
        Node temNode = root;
        while (temNode.right != null) {
            if (temNode.right.data == v1) {
                return temNode;
            }
            
            temNode = temNode.right;
            if(temNode.data > v1) {
                break;
            }
        }
        return temNode;
    }

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
		int v1 = scan.nextInt();
		int v2 = scan.nextInt();
		scan.close();
		Node ans = lca(root, v1, v2);
		System.out.println(ans.data);
	}

}