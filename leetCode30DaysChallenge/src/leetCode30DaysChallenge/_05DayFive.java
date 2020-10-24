package leetCode30DaysChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _05DayFive {
	private static int [] array = null;
	static class Solution {
		public int maxProfit(int[] prices) {
			int profit = 0;
			for (int i = 1; i < prices.length; i++) {
				if(prices[i]>prices[i-1]) {
					profit+=prices[i]-prices[i-1];
				}
			}
			return profit;
		}
		

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(solution.maxProfit(prices));
	}
}
