package hackerRank30DaysChallenge;

import java.util.Scanner;

public class _14DayFourteen {
	class Difference {
		private int[] elements;
		public int maximumDifference;

		public Difference(int[] elements) {
			this.elements = elements;
		}

		// Add your code here
		public void computeDifference() {
			maximumDifference = Integer.MIN_VALUE;
			int absolute = 0;
			for (int i = 0; i < elements.length; i++) {
				for (int j = i + 1; j < elements.length; j++) {
					absolute = Math.max(elements[i], elements[j]) - Math.min(elements[i], elements[j]);
					if (maximumDifference < absolute) {
						maximumDifference = absolute;
					}
				}
			}
		}
	} // End of Difference class

	public class Solution {

		public void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			sc.close();

			Difference difference = new Difference(a);

			difference.computeDifference();

			System.out.print(difference.maximumDifference);
		}
	}
}
