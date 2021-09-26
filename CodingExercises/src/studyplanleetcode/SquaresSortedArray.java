package studyplanleetcode;

import java.util.Arrays;

public class SquaresSortedArray {
	 public static int[] sortedSquares(int[] nums) {
	        for(int i =0; i< nums.length; i++){
	            nums[i] =(int) Math.pow(nums[i],2);
	        }
	        Arrays.sort(nums);
	        return nums;
	    }
	 public static void main(String[] args) {
		 int[] nums = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(nums)));
		
	}
}
