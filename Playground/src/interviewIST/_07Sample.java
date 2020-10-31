package interviewIST;

public class _07Sample {
	public static void main(String[] args) {
		_07Sample sample = new _07Sample();
		int [] nums = {1, 1, 1, 1, 1};
		System.err.println(sample.findTargetSumWays(nums, 3));
	}
	  public int findTargetSumWays(int[] nums, int S) {
	        int count = 0;
	        for(int i = 0; i< nums.length; i++){
	           int[] rev = nums.clone(); 
	            rev[i]= -rev[i];
	           int sum =  getSum(rev);
	            if(sum == S){
	                count++;
	            }
	        }
	        return count;
	    }
	    public int getSum(int [] nums){
	        int sum = 0;
	        for(int i = 0; i< nums.length; i++){
	            sum += nums[i];
	        }
	        return sum;
	    }
}
