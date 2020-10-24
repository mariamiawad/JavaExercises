package hackerRank30DaysChallenge;

import java.net.Socket;

public class _02DayTwo {
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip = meal_cost * tip_percent / 100.0;
		double tax = meal_cost * tax_percent / 100.0;
		double totalCost = meal_cost + tip + tax;

		System.out.println(Math.round(totalCost));

	}

	public static void main(String[] args) {
		solve(10.25, 17, 5);
	}
}
