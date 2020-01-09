package chapter19;
import java.util.ArrayList;
import java.util.Random;

public class Exercise_19_09 {

	public Exercise_19_09() {
		// 
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(6);
		list.add(7);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(0);
		sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static <E extends Comparable<E>>
	void sort(ArrayList<E> list) {
		E temp = null;
		for (int i = 1; i < list.size(); i++) {
			for (int j = i; j >0 ; j--) {
				if(list.get(j).compareTo(list.get(j-1))<0) {
					temp = list.get(j);
					list.set(j, list.get(j-1));
					list.set(j-1, temp);
					
				}
			}
			
		}
	}
}
