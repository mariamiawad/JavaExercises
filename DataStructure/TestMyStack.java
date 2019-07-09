import java.util.*;
public class TestMyStack{
	public static void main(String[] args) {
		MyStackArrayList<Integer> stackArrayList = new MyStackArrayList<Integer>();
		System.out.println( "ArrayList size " +stackArrayList.size());
		System.out.println("ArrayList isEmpty "+stackArrayList.isEmpty());
		stackArrayList.push(Integer.valueOf(7));
		stackArrayList.push(Integer.valueOf(8));
		stackArrayList.push(Integer.valueOf(9));
		stackArrayList.push(Integer.valueOf(10));
		System.out.println( "ArrayList size " +stackArrayList.size());
		System.out.println("ArrayList isEmpty "+stackArrayList.isEmpty());
		System.out.println("ArrayList peek " +stackArrayList.peek());
		int size = stackArrayList.size();
		for(int i = 0;  i < size; i++){
			System.out.print("ArrayList " +stackArrayList.pop()+" ");
		}
		System.out.println();
		MyStackLinkedList<Integer> stackLinkedList = new MyStackLinkedList<Integer>();
		System.out.println("LinkedList isEmpty " + stackLinkedList.isEmpty());
		System.out.println("LinkedList size " + stackLinkedList.size());
		stackLinkedList.push(Integer.valueOf(7));
		stackLinkedList.push(Integer.valueOf(8));
		stackLinkedList.push(Integer.valueOf(9));
		stackLinkedList.push(Integer.valueOf(10));
		System.out.println( "LinkedList size " +stackLinkedList.size());
		System.out.println("LinkedList isEmpty "+stackLinkedList.isEmpty());
		System.out.println("LinkedList peek " +stackLinkedList.peek());
		size = stackLinkedList.size();
		for(int i = 0;  i < size; i++){
			System.out.print("LinkedList " +stackLinkedList.pop()+ " ");
		}
		System.out.println();

	}
}