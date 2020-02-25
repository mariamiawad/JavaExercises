import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'solve' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER h 2. INTEGER_ARRAY wallPoints 3. INTEGER_ARRAY lengths
	 */

	public static int solve(int h, List<Integer> wallPoints, List<Integer> lengths) {
		List<Double> list = new ArrayList<>();
		int max = 0;
		double percentage = 25;

		for (int i = 0; i < wallPoints.size() && i < lengths.size(); i++) {
			int x = lengths.get(i);
			double result = wallPoints.get(i) - ((x * percentage) / 100)-h;

			list.add(result);
		}

		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = (int) Math.ceil(list.get(i));
			}
		}
		return max;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		List<Integer> wallPoints = new ArrayList<>();
		List<Integer> lengths = new ArrayList<>();
		int h = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			wallPoints.add(scanner.nextInt());
		}
		for (int i = 0; i < n; i++) {
			lengths.add(scanner.nextInt());
		}
		int answer = Result.solve(h, wallPoints, lengths);
		System.out.println(answer);

	}
}
