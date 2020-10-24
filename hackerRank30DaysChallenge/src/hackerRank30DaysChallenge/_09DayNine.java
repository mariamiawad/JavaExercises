package hackerRank30DaysChallenge;

public class _09DayNine {
	static int factorial(int n) {

		if (n <= 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
