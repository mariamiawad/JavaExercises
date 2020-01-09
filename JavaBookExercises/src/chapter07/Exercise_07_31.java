package chapter07;
import java.util.Scanner;

public class Exercise_07_31 {

	public Exercise_07_31() {
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter list1:");
		int length = inputScanner.nextInt();
		int[] list1 = new int[length];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = inputScanner.nextInt();
		}
		System.out.println("Enter list2: ");
		int lenth2 = inputScanner.nextInt();
		int[] list2 = new int[lenth2];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = inputScanner.nextInt();
		}
		int[] mergedList = merge(list1, list2);
		for (int i = 0; i < mergedList.length; i++) {
			System.out.print(mergedList[i] + " ");
		}
	}

	public static int[] merge(int[] list1, int[] list2) {
		int length = list1.length + list2.length;
		int[] mergedList = new int[length];
		int count = 1;
		int j = 0;
		for (int i = 0; i < mergedList.length; i++) {
			if (list1.length >= count) {
				mergedList[i] = list1[i];
				count++;
			} else {
				mergedList[i] = list2[j];
				j++;
			}

		}
		sortList(mergedList);
		return mergedList;

	}

	public static void sortList(int[] mergedList) {
		int temp;
		for (int i = 0; i < mergedList.length - 1; i++) {
			for (int j = 0; j < mergedList.length - 1; j++) {
				if (mergedList[j] > mergedList[j + 1]) { // use < for Descending order
					temp = mergedList[j + 1];
					mergedList[j + 1] = mergedList[j];
					mergedList[j] = temp;
				}
			}
		}
	}
}
