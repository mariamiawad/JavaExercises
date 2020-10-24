package leetCode30DaysChallenge;

public class _15DayFifteen {
	class Solution {
	    public int[] productExceptSelf(int[] nums) {
	        int [] product = new int[nums.length];
	        product[0] = 1;
	        for(int i =1; i < nums.length; i++){
	            product[i] = product[i-1]*nums[i-1];
	        }
	    int r = 1;
	    for(int i = nums.length-1;  i>=0; i--){
	        product[i] = product[i]*r;
	        r*= nums[i];
	    }
	    return  product;
	    }
	}
}
