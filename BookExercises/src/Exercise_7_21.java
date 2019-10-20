import java.util.Arrays;
import java.util.Collections;
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
		Integer[] slots = new Integer[numberOfSlots];

		for (int i = 0; i <numberOfBalls; i++) {
//			String string = inputScanner.nextLine();
			 String string = simulation(numberOfSlots);
			System.out.println(string);
			slots[i] = readBallPath(string);

		}
		printBallPath(slots, numberOfBalls);
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

	public static void printBallPath(Integer[] slots, int numberOfBalls) {

		int max = 0;
		for (int i = 0; i < slots.length; i++) {
			if (slots[i]== null ){
				slots[i]=0;
			}
			if (max < slots[i].intValue()) {
				max = slots[i];
			}
		} /*
			 * // Arrays.sort(slots); int count = 0; int temp = max; for (int i = 0; i <
			 * max; i++) { for (int j = 0; j < slots.length; j++) {
			 * 
			 * if (temp == slots[j]) { count++; for (int j2 = max-temp; j2 < temp ; j2++) {
			 * System.out.print(' ');
			 * 
			 * continue; } if (count>=temp) { for (int j2 = 1; j2 < temp; j2++) {
			 * System.out.print(' '); } System.out.print('0');
			 * 
			 * 
			 * while(temp>0) { System.out.print('0'); temp--; }
			 * 
			 * } if (temp == max && count + 1 < max) {
			 * 
			 * System.out.println(); }
			 * 
			 * } // else { // System.out.print(' '); // }
			 * 
			 * } // if (temp == max) { // System.out.println(); // } temp--; }
			 */
		String emptySlotsString = "";
		for (int i = 0; i < slots.length; i++) {
			emptySlotsString += " ";
		}
		Arrays.sort(slots, Collections.reverseOrder());
		//Sort the list
//		Collections.sort(numbersList, Collections.reverseOrder());
//		Arrays.sort(slots);
//		Collections.reverse(Arrays.asList(slots));
		int temp = max;
		int x = 1;
		String output ="";
		for (int i = max; i > 0; i--) {
//			 output = "";
			for (int j = 0; j < slots.length-1; j++) {
				if (slots[j] == temp && temp == max&& slots[j+1] == max) {
					
					while (slots[j]>0) {
						output += " ";
						slots[j]--;
						
					}
					output += "0";

					x++;
				} 
				/*
				 * else { output += " "; }
				 */
				else if(slots[j]==temp) {
					{
						output += "0";
						
					}
				}
				if(x<max) {
					output +="\n";
				}
				
			}
			
			temp--;
			
			
		}
		if (!output.isEmpty()) {
			System.out.println(output);
		}
	}

	public static boolean isEmpty(int[] slots, int i) {

		if (slots[i] > 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isRowEmpty(int[] slots, int rowNum) {

		for (int slot : slots) {
			if (slot == rowNum) {
				return false;
			}
		}

		return true;
	}
}
