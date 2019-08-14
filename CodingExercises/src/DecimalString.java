import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DecimalString {

	public DecimalString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(1);

	}

	public static int getCombination(int x, int y, int sum) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= 9; i++) {
			int xx = x * i;

			for (int j = 0; j <= 9; j++) {

				if (xx + y * j == sum) {
					if (i > j) {
						return i;
					} else {
						return j;
					}
				}
			}
		}

	}

}
