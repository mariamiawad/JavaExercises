import java.util.Random;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public static void bubbleSort(int array[]) {
		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - i - 1; j++)
				if (array[j] > array[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}

	public static void main(String[] args) {
		int[] array = new int[10];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt() + 1;
		}
		System.out.println("Unsorted Array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		bubbleSort(array);
		System.out.println("Sorted Array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
