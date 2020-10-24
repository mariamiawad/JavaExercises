package hackerRank30DaysChallenge;

import java.util.Stack;

public class _10DayTen {
	private static int integerToBinary(int n) {
		String binaryString = Integer.toBinaryString(n);
		return longestStreak(binaryString);
	}
	public static int longestStreak(String str) {

		// check length for empty string
		if (str.length() == 0)
		    return 0;
		else {
		    // initialize variables
		    String current = "";
		    String next = "";
		    boolean same = false;
		    int max = 1;
		    int count = 1;

		    // loop for iteration
		    for (int i = 0; i < str.length(); i++) {
		        // take current character using substring
		        current = str.substring(i, i + 1);

		        // compare to last character
		        if (next.equals(current)) {
		            same = true;
		        } else {
		            next = current;
		            same = false;
		            count = 1;
		        }

		        // if last character is same increase count and find maximum
		        if (same) {
		            count++;
		            if (count > max) {
		                max = count;
		            }
		        }
		    }
		    return max;
		}
	}

	public static void main(String[] args) {
		System.out.println(integerToBinary(439));
	}
}
