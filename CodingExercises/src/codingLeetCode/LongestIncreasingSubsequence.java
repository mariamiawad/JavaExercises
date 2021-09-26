package codingLeetCode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import jdk.dynalink.support.AbstractRelinkableCallSite;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = scanner.nextInt();
//		}
		lengthOfLIS(nums);
	}

	public static int lengthOfLIS(int[] nums) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(nums[0]);
		boolean firstLoop = true;
		for (int i = 1; i < nums.length - 1; i++) {
			if (firstLoop && list.get(0) > nums[i]) {
				list.remove(0);
				firstLoop = false;
			}
			if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
				list.add(nums[i]);
			}
			java.util.Set<Integer> set  = new HashSet<Integer>();
			Iterator<Integer> iterator = set.iterator();
			while (iterator.hasNext()) {
				Integer integer = (Integer) iterator.next();
				
			}
			
			

		}
		if (list.get(list.size() - 1) < nums[nums.length - 1]) {
			list.add(nums[nums.length - 1]);
		}

		return list.size();
	}

	private static int getSmallestElement(int[] nums) {
		int x = nums[0];
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (x > nums[i]) {
				x = nums[i];
				index = i;
			}
		}
		return index;

	}

	private static int getBiggestElemen(int[] nums, int smallestIndex) {
		int x = nums[smallestIndex];
		int index = 0;
		for (int i = smallestIndex + 1; i < nums.length; i++) {
			if (x <= nums[i]) {
				x = nums[i];
				index = i;
			}
		}
		return index;

	}
}
