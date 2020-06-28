package codingLeetCode;

import java.util.Arrays;

public class TwoSum {
///https://leetcode.com/problems/two-sum/
	public static int[] twoSum(int[] nums, int target) {
		int sum = 0;
		boolean flag = false;
		int [] results = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				sum = nums[i]+ nums[j];
				if(sum == target) {
					results[0] = i;
					results[1] = j;
					 flag = true;
					 break;
				} 
				
			}
			if (flag) {
				break;
			}
		}
		return results;
	}
	public static void main(String[] args) {
		int [] nums = {2,5,5,11};
		System.out.println(Arrays.toString(twoSum(nums, 10)));
	}

}
