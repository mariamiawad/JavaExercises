import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecimalString {
	static Map<String, String> map = new HashMap<String, String>();

	public DecimalString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		int m = 0;
		int[][] array = new int[10][10];
		String s = string.charAt(0) + "";

		int sum = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = i; j < array.length; j++) {

				for (int j2 = 1; j2 < string.length(); j2++) {

					String ss = string.charAt(j2) + "";
					if (Integer.parseInt(ss) < Integer.parseInt(s)) {
						sum = Integer.parseInt(ss) + 10 - Integer.parseInt(s);
					} else {
						sum = Integer.parseInt(ss);
					}
					m += getCombination(i, j, sum);
					s = string.charAt(j2) + "";
				}
				if (m < 0) {
					array[i][j] = -1;
					array[j][i] = -1;
					m = 0;
					continue;

				}
				array[i][j] = m + 1 - string.length();
				array[j][i] = m + 1 - string.length();
				m = 0;

				sum = 0;
			}

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}

	public static int getCombination(int x, int y, int sum) {
		String xysum = x + "_" + y + "_" + sum;
		if (map.containsKey(xysum)) {
			String a_b = map.get(xysum);
			int combination = Integer.parseInt(a_b);
			return combination;

		}

		int min = Integer.MAX_VALUE;
		if (x != 0 || y != 0) {

			for (int i = 0; i <= 9; i++) {
				if (min < i) {
					break;
				}
				for (int j = 0; j <= 9; j++) {
					if (min < j) {
						break;
					}
					if ((i * x + y * j) % 10 == sum % 10) {
						if (min > i + j) {
							min = i + j;
						}
					}

				}

			}
		}

		else if (x == 0 && y == 0) {
			min = -1;
		}
		if (min == Integer.MAX_VALUE) {
			min = -1;
		}
		map.put(xysum, min + "");
		return min;
	}

}
