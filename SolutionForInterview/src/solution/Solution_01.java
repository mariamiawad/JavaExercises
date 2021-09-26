package solution;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution_01 {
//	Write a function that takes in a non-empty array of distinct integers and an integer 
//	representing a target sum. If any two numbers in the input array sum up to the target
//	sum, the function should return them in an array, in any order. If no two numbers sum up to the target sum, the function should return an empty array.
//
//			Note that the target sum has to be obtained by summing two different integers in the array: You cannot add a single integer to itself in order to obtain the target sum.
//
//			You can assume that there will be at most one pair of numbers summing up to the target sum
//
//			Sample input 
//
//			    array = [3, 5, 4, 8, 11, 1, -1, 6]
//			    targetSum = 10
//			    
//			Sample output:
//
//			    [-1, 11] The numbers could be in reverse order.
	public static void main(String[] args) {
		int[] nums = { -2, 1, 2, 3, 5, 6, 8, 9 };
		getSumOfTwoNumbers(nums, 10);
		int[] nums2 = { -2, 1, 2, 3, 5, 6, 8, 9 };
		getPowers(nums2);
		int[] nums3 = { -13, -7,-4,0, 5,13 };
		getPowers(nums3);


	}

	public static void getSumOfTwoNumbers(int[] nums, int target) {
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				list.add(nums[i]);
				list.add(target - nums[i]);
			}
			map.put(nums[i], i);
		}
		System.out.println(list);

	}
//	4./************************************************************************************
//
//	Write a function that takes in a non-empty array of integers that are sorted in ascending
// *  order and returns a new array of the same length with the squares of the original integers also 
// *  sorted in ascending order.
// */
//
//	Sample Input
//
//	array = [-2, 1, 2, 3, 5, 6, 8, 9];
// [9,1,2,3,5,6,8,-2]
// 
// 4, 1, 9
	// 1,4
//	Sample output 
//
//	[ 1, 4 ,4, 9, 25, 36, 64, 81]
//	[4, 1,4, 9, 25, 36, 64, 81]
//	[81,64,36,25,9,4,1,4]
// i =nums.length-1;
	// j = i-1;
	// nums[i] = 4
	// nums [j]=1;
	// if(nums[i]>nums[j]
	// swap(nums[i], nums[j])
	// [81,64,36,25,9,4,4,1]

	// i--;
	// else j--;
	//
	// [4,64,36,25,9,4,1,81]

	public static void getPowers(int[] nums) {
//		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			int number =(int) Math.pow(nums[i], 2);
//			list.add(number);
//		}
//		Collections.sort(list);
//		System.out.println(list);
		int i = 0;
		int j = nums.length - 1;

		int[] array = new int[nums.length];
		for (int j2 = nums.length - 1, k = 0; j2 >= 0 && k < nums.length; j2--, k++) {
			array[k] = (int) Math.pow(nums[j2], 2);

			// [81, 64, 36, 25, 9, 4, 1, 4, 9]
			// [81, 64, 36, 25, 9, 9, 1, 4, 4]
			//

			//
			// [81, 64, 36, 25, 9, 4, 4, 1, 9]

			// [81, 64, 36, 25, 9, 4, 4, ]

			// 81, 64, 36, 25, 9, 9, 1, 1, 4, 4
			// 81, 64, 36, 25, 9, 4, 9, 1, 4, 1
			// 81, 64, 36, 25, 9, 4, 9, 1, 4, 1
			// 81, 64, 36, 25, 9, 4, 9, 4, 1, 1
			// 81, 64, 36, 25, 9, 4, 1, 9, 4, 1
			// 81, 64, 36, 25, 9, 4, 1, 9, 4, 1

			// 81, 64, 36, 25, 9, 4, 1, 1, 4, 9
			// 81, 64, 36, 25, 9, 9, 1, 1, 4, 4
			// 81, 64, 36, 25, 9, 9, 4, 1, 4, 1

		}
		//169, 25, 0, 16, 49, 169
		//169 25 0 16
		
		int lastNumber = 0;
		while (i<j) {
//			if (lastNumber < array[i] && i != 0) {
//				j--;
//				i--;
//
//			}
			if (array[i]< array[j]) {
				swap(array, i, j);
				i++;
				

			}
			if (array[i]>= array[j]) {
				swap(array, i, j);
				j--;
				
			
			}
			
			

			lastNumber = array[i];
//			i++;

		}
		for (int k = 0, j2 = array.length - 1; k < array.length; k++, j2--) {
			nums[k] = array[j2];
		}
		System.out.print(Arrays.toString(nums));

	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
