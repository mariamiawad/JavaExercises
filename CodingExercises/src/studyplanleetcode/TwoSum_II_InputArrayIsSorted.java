package studyplanleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum_II_InputArrayIsSorted {
	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				List<Integer> list = map.get(numbers[i]);
				list.add(i);
				map.put(numbers[i], list);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(numbers[i], list);
			}
		}
		int[] index = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			int diff = target - numbers[i];
			if (map.containsKey(diff)) {
				index[0] = i + 1;
				index[1] = map.get(diff).get(map.get(diff).size()-1) + 1;
				break;

			}
		}
		return index;
	}
	public static void main(String[] args) {
		int[] numbers = {0,0,3,4};
		System.out.println(Arrays.toString(twoSum(numbers, 0)));
	}
}
