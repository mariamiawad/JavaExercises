import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Exercise_7_21 {
	static Map<Integer, String> map = new HashMap<Integer, String>();
	static int[][] integer;

	public Exercise_7_21() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the number of balls to drop:");
		int numberOfBalls = inputScanner.nextInt();
		System.out.println("Enter the number of slots in the bean machine:");
		int numberOfSlots = inputScanner.nextInt();
		int[] slots = new int[numberOfSlots+1];

		for (int i = 0; i < numberOfBalls; i++) {
			// String string = inputScanner.next();
			String string = simulation(numberOfSlots);
			System.out.println(string);
			slots[readBallPath(string)]++;

		}
		System.out.println(Arrays.toString(slots));
		printBallPath(slots);
		;
	}

	public static String simulation(int numberOfBalls) {
		String string = "";
		Random random = new Random();
		int x = 0;
		for (int i = 0; i < numberOfBalls; i++) {
			x = random.nextInt(2);
			{
				if (x == 0) {
					string += "L";
				} else {
					string += "R";
				}
			}
		}
		return string;
	}

	public static int readBallPath(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'R') {
				count++;

			}
		}
		return count;

	}

	public static void printBallPath(int[] slots) {

		int max = 0;
		for (int i = 0; i < slots.length; i++) {

			if (max < slots[i]) {
				max = slots[i];
			}
		}
		for (int i = max; i > 0; i--) {
			for (int j = 0; j < slots.length; j++) {
				if (slots[j] == i) {
					System.out.print("0");

					slots[j]--;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
