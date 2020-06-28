package leetCode30DaysChallenge;


public class DayThree {
	public static int maxSubArray(int[] nums) {
			return maxSubArray(nums, 0, nums.length-1);
		
	}
	public static int maxSubArray(int[] nums, int l , int h) {
		if(l==h) {
			return nums[l];
		}
		int m = (l+h)/2;
		return Math.max((Math.max(maxSubArray(nums, l,m), maxSubArray(nums, m+1, h))),maxSubArraySum(nums, l, m, h));
				
	}
	private static int maxSubArraySum(int [] nums, int l, int m, int h) {
		int sum = 0;
		int left = Integer.MIN_VALUE;
		for (int i = m; i >= l; i--) {
			sum += nums[i];
			if (sum>left) {
				left = sum;
			}
		}
		sum = 0;
		int right = Integer.MIN_VALUE;
		for (int i = m+1; i <= h; i++) {
			sum += nums[i];
			if (sum > right) {
				right = sum;
			}
		}
		return Math.max(left+right, Math.max(left, right));
	}
	public static void main(String[] args) {
		int[] nums = { 8,-19,5,-4,20 };
		System.out.println(maxSubArray(nums));
	}
}
