package exam1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exam1_Question8 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100000; i++) {
			int count = 0;
			Set<Integer> set = new HashSet<Integer>();
			while (set.add(random.nextInt(365))) {
				count++;

			}
			list.add(count + 1);

		}
		double average = 0;
		for (int i = 0; i < list.size(); i++) {
			average += list.get(i);
		}
		average = average / list.size();
		System.out.println(average);
	}
}
