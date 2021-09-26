package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MarkAndToys {
	public static int maximumToys(List<Integer> prices, int k) {
		// Write your code here
		Collections.sort(prices);
		long sum = 0;
		int count = 0;
		for (int i = 0; i < prices.size(); i++) {

			sum += prices.get(i);
			if (sum <= k) {
				count++;
			}
		}
		return count;

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		List<Integer> prices = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			prices.add(scanner.nextInt());
		}
		System.out.println(maximumToys(prices, k));
	}
}
