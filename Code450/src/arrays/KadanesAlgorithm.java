package arrays;

import java.util.HashMap;
import java.util.Map;

public class KadanesAlgorithm {


static	long maxSubarraySum(int arr[], int n){
	        long max = Integer.MIN_VALUE;
	        long max_ending_here = 0; 
	        for (int i = 0; i < arr.length; i++) {
				max_ending_here += arr[i];
				if (max< max_ending_here) {
					max = max_ending_here;
				}
				if (max_ending_here <0) {
					max_ending_here=0;
				}
			}
	        return max;
	}

	public static void main(String[] args) {
		int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubarraySum(array, 9));
	}
}
