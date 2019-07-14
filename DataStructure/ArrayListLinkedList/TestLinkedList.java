import java.util.*;
public class TestLinkedList {
	public static void main(String [] args){
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(32);
		linkedList.add(33);
		linkedList.add(34);
		linkedList.add(3, 1);
		for(int i = 0; i < linkedList.size; i++){
			System.out.println(linkedList.get(i));
		}
		Integer x = 33; 
		linkedList.remove(x);
		for(int i = 0; i < linkedList.size; i++){
			System.out.println(linkedList.get(i));
		}
		linkedList.add(33);
		linkedList.remove(0);
		for(int i = 0; i < linkedList.size; i++){
			System.out.print(linkedList.get(i) + " ");
		}
		System.out.println();
		linkedList.set(0, 4);
		for(int i = 0; i < linkedList.size; i++){
			System.out.print(linkedList.get(i) + " ");
		}

	}
}