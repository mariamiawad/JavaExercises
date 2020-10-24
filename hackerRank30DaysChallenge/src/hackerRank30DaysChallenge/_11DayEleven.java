package hackerRank30DaysChallenge;

import java.util.Scanner;

public class _11DayEleven {
	public static class Solution {
		private static int maxHourGlass(int[][] arr) {
			if (arr.length < 3 || arr[0].length < 3) {
		        return -1; 
			}
			int max = Integer.MIN_VALUE;
			int n = arr.length / 2;
			int m = n / 2;
			for (int i = 0; i < arr.length - 2; i++) {
				for (int j = 0; j < arr.length - 2; j++) {
					int sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + (arr[i + 1][j + 1])
							+ (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
					max = Math.max(sum, max);
				}
			}
			return max;
		}

		private static final Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) {
			int[][] arr = new int[6][6];

			for (int i = 0; i < 6; i++) {
				String[] arrRowItems = scanner.nextLine().split(" ");
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				for (int j = 0; j < 6; j++) {
					int arrItem = Integer.parseInt(arrRowItems[j]);
					arr[i][j] = arrItem;
				}
			}
			System.out.println(maxHourGlass(arr));

			scanner.close();
		}
	}
}
