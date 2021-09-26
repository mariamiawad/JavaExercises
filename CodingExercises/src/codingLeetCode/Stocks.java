package codingLeetCode;

public class Stocks {
	public static int maxProfit(int[] prices) {
		int sum = 0;
		int buy = 0;
		int sell = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] < prices[j]) {
					buy = prices[j];
				}
				else if (buy > prices[j]) {
					sell = prices[j];
				}

			}
			sum += sell - buy;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int i = maxProfit(prices);
		System.out.println(i);
	}
}
