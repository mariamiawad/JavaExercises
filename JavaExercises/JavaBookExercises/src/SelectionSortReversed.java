import java.util.Scanner;

public class SelectionSortReversed {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		double[] list = new double [10];
		for (int i = 0; i < list.length; i++) {
			list[i]= inputScanner.nextDouble();
		}
		selectionSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
	}
	/** The method for sorting the numbers */
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}
