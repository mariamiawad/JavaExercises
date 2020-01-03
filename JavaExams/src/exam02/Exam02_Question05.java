package exam02;

import java.util.Arrays;
import java.util.Scanner;

public class Exam02_Question05 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int length = inputScanner.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = inputScanner.nextInt();
		}
		shakerSort(array);
		
	}

	private static void shakerSort(int[] array) {
		boolean flag = true;
		int length = array.length;
		int begin = 0;
		while (flag) {
			flag = false;
			for (int i = begin; i < length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					flag = true;
				}

			}
			System.out.println(Arrays.toString(array));
			if (!flag) {
				break;
			}
			flag = false;
			length--;
			for (int i = length - 1; i >= begin; i--) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					flag = true;
				}

			}
			System.out.println(Arrays.toString(array));
			begin++;

		}

		
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
