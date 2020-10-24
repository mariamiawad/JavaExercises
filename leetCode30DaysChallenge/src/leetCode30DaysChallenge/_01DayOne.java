package leetCode30DaysChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


//https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3283/


public class _01DayOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		System.out.print(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int num = 0;
		Map<Integer, Integer> set = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (set.containsKey(nums[i])) {
				set.put(nums[i], set.get(nums[i]+1));
			}
			else {
				set.put(nums[i], 1);
			}
			
		}
		for (Entry<Integer, Integer> entry : set.entrySet()) {
			if (entry.getValue().equals(Integer.valueOf(1))) {
				num = entry.getKey();
				
			}
			
		}
		return num;
	}
	
}
