package crackingcodinginterview.chapter02;

import crackingcodinginterview.utils.LinkedListNode;
import crackingcodinginterview.utils.SinglyLinkedList;

public class CCI_02_02_KthToLast<T> {
	
	public LinkedListNode<T> getKthToLast(SinglyLinkedList<T> list, int k) {
		// TODO - Implement this
		return null;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		list.insert(1);
		list.insert(3);
		list.insert(5);
		list.insert(7);
		
		CCI_02_02_KthToLast<Integer> client = new CCI_02_02_KthToLast<>();
		System.out.println(client.getKthToLast(list, 2));	// should return 5
		
		
	}

}
