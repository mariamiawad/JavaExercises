import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise_07_30 {

	public Exercise_07_30() {
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int length = inputScanner.nextInt();
		int [] values = new int [length];
		System.out.println("Enter the values");
		for (int i = 0; i < length; i++) {
			values[i] = inputScanner.nextInt();
		}
		if (isConsecutiveFour(values)) {
			System.out.println("The list has consecutive fours");
		}
		else {
			System.out.println("The list has no consecutive fours");
		}
	}

	public static boolean isConsecutiveFour(int[] values) {
		int value = values[0];
		boolean flag = true;
		int count = 0;
		for (int i = 1; i < values.length; i++) {
			if (Math.abs(values[i] - value) == 0) {
				flag = true;
				count++;
			}
			value = values[i];
			if (count == 3) {
				return true;
			}
		}
		return false;
	}
}
