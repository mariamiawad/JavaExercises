package crackingcodinginterview.chapter02;

import java.util.Iterator;

import arraylistlinkedlist.MyLinkedList;
import crackingcodinginterview.utils.LinkedListNode;
import crackingcodinginterview.utils.SinglyLinkedList;

public class CCI_02_02_KthToLast<T> {
	
	public LinkedListNode<T> getKthToLast(SinglyLinkedList<T> list, int k) {
		SinglyLinkedList<T> linkedList = new SinglyLinkedList<>();
		int size = list.getSize();
		size = size-k-1;
		return list.get(size);
		
		
		
		
	}
	
	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		list.insert(1);
		list.insert(3);
		list.insert(5);
		list.insert(7);
		
		CCI_02_02_KthToLast<Integer> client = new CCI_02_02_KthToLast<>();
		LinkedListNode<Integer> listNode =client.getKthToLast(list, 2);
		System.out.println(listNode.toString());	// should return 5
		
		
	}

}
