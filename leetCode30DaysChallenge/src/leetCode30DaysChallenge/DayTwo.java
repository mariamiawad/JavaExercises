package leetCode30DaysChallenge;

import java.util.HashSet;
import java.util.Set;

public class DayTwo {
	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while (set.add(n)) {
			int sum = 0;
			while (n > 0) {
				sum += Math.pow((n % 10), 2);
				n = n / 10;
			}
			n = sum;

		}
		return n == 1;

	}

	public static void main(String[] args) {
		System.out.println(isHappy(4));
	}
}
