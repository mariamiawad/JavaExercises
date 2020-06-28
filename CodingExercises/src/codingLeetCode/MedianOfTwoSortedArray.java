package codingLeetCode;

import java.util.Arrays;
//https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/
public class MedianOfTwoSortedArray {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int size = nums1.length + nums2.length;
		int[] nums = new int[size];
		int k = nums1.length ;
		for (int i = 0; i < nums1.length; i++) {
			nums[i] = nums1[i];

		}
		int j = 0;
		for (int i = k; i < size && j < nums2.length; i++) {
			nums[i] = nums2[j];
			j++;
		}

		Arrays.sort(nums);
		double m = 0;
		if (size % 2 == 0) {
			m = (nums[size / 2] + nums[(size / 2) + 1]) / 2.0;
		} else {
			m = nums[size/2];

		}
		return m;
	}
	public static void main(String[] args) {
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
