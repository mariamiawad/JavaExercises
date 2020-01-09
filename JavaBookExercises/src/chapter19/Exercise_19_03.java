package chapter19;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Exercise_19_03<E> {

	public Exercise_19_03() {
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		ArrayList<Integer>list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(inputScanner.nextInt());
		}
		list = removeDuplicates(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
		Set<E>  set = new HashSet<>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		ArrayList<E> result = new ArrayList<>();
		for (E e : set) {
			result.add(e);
		}
		return result;
	}
}
