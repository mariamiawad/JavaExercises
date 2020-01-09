package chapter19;

import java.util.ArrayList;
import java.util.Random;

public class Exercise_19_10 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 1; i < 11; i++) {
			list.add(random.nextInt(120));
		}
		System.out.println(max(list));
	}
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max.compareTo(list.get(i))<0) {
				max = list.get(i);				
			}
		}
		return max;
	}
}
