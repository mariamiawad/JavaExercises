package leetCode30DaysChallenge;

import java.util.ArrayList;
import java.util.List;

public class DaySeven {
	public static int countElements(int[]array) {
		int count = 0;
		List<Integer> list =new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		for (int i = 0; i < list.size() && i< array.length; i++) {
			if (list.contains(array[i]+1)) {
				count++;
			}
		}
		return count;

	}
public static void main(String[] args) {
	int [] array = {1,2,3};
	System.out.println(countElements(array));
}
}
