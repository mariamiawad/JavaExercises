package studyplanleetcode;

import java.math.BigInteger;

public class RotatingArray {
	public static int[] rotate(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			for (int j = nums.length-2; j >=0; j--) {
				int n = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = n;

			}
			
			
			
		}
		return nums;

	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		System.out.println(rotate(nums,3));
	}

}
