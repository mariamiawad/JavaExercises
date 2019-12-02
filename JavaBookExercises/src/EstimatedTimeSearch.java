import java.util.Arrays;
import java.util.Random;

public class EstimatedTimeSearch {

	public static void main(String[] args) {

		int[] list = new int[100000];
		Random random = new Random();
		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt();

		}
		int key = random.nextInt();
		long startTime = System.currentTimeMillis();
		linearSearch(list, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);
		startTime = System.currentTimeMillis();
		Arrays.sort(list);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println(executionTime);
	}

	/** The method for finding a key in the list */
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}

	/** Use binary search to find the key in the list */
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}

		return -low - 1; // Now high < low, key not found
	}
}
