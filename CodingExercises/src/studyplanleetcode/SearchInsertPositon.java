package studyplanleetcode;

import java.util.Arrays;

public class SearchInsertPositon {
	  public int searchInsert(int[] nums, int target) {
		  for (int i = 0; i < nums.length; i++) {
				if(target == nums[i]) {
					return i;
				}
		  }
	        int[] arr = Arrays.copyOf(nums,nums.length+1);
	        arr[arr.length-1] = target;
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length; i++) {
				if(target == arr[i]) {
					return i;
				}
			}
	        return -1;
	    }
}
