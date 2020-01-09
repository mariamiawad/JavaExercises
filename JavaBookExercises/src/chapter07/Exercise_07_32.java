package chapter07;


import java.util.Scanner;

public class Exercise_07_32 {

	public Exercise_07_32() {

	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter list:");
		int length = inputScanner.nextInt();
		int [] list = new int[length];
		for (int i = 0; i < list.length; i++) {
			list[i]= inputScanner.nextInt();
		}
		partition(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
	}

	public static int partition(int[] list) {
		int pivot = list[0];
		int[] temp = new int[list.length];
		int j = 0;
		for (int i = 1; i < list.length; i++) {
			if (pivot >= list[i]) {
				temp[j] = list[i];
				j++;

			}
		}
		temp[j] = pivot;
		int index = j;
		j++;
		for (int i = 1; i < list.length; i++) {
			if (pivot <list[i]) {
				temp[j] = list[i];
				j++;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			list[i] = temp[i];
		}
		list = temp;

		return index;
	}
}
