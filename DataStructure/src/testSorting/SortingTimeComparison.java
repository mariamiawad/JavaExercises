package testSorting;

import java.util.Random;

import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.MergeSort;
import sorting.SelectionSort;
import sorting.ShellSort;

public class SortingTimeComparison {
	public static void main(String[] args) {
		// TODO - generate random integer arrays of sizes 10, 100, 1000, 10000, 100000,
		// 1000000
		// and sort them using each of the sorting methods we learned
		// make sure you generate random arrays before each new call
		// calculate the times and save them to an excel sheet.
		// use private methods accordingly

		/*-----------------------Insertion Sort ------------------------*/
		Random random = new Random();
		Integer[] array = new Integer[10];
		// 10
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);

		}
		System.out.println("Insertion sort for 10 elements " + insertionSortTimeCompariso(array));
		array = new Integer[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		System.out.println("Insertion sort for 100 elements " + insertionSortTimeCompariso(array));
		array = new Integer[1000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Insertion sort for 1000 elements " + insertionSortTimeCompariso(array));
		array = new Integer[10000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Insertion sort for 10000 elements " + insertionSortTimeCompariso(array));
		array = new Integer[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Insertion sort for 100000 elements " + insertionSortTimeCompariso(array));
//		array = new Integer[1000000];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = random.nextInt(1000);
//		}
//		System.out.println("Insertion sort for 1000000 elements " + insertionSortTimeCompariso(array));
		/*----------------------------------------End of Insertion sort---------------*/

		/*---------------------------------Selection Sort----------------*/
		array = new Integer[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);

		}
		System.out.println("Selection sort for 10 elements " + selectionSortTimeComparison(array));
		array = new Integer[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		System.out.println("Selection sort for 100 elements " + selectionSortTimeComparison(array));
		array = new Integer[1000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Selection sort for 1000 elements " + selectionSortTimeComparison(array));
		array = new Integer[10000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Selection sort for 10000 elements " + selectionSortTimeComparison(array));
		array = new Integer[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Selection sort for 100000 elements " + selectionSortTimeComparison(array));
//		array = new Integer[1000000];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = random.nextInt(1000);
//		}
//		System.out.println("Selection sort for 1000000 elements " + selectionSortTimeComparison(array));
		/*----------------------------------------End of Selection sort---------------*/

		/*---------------------------------Bubble Sort----------------*/
		array = new Integer[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);

		}
		System.out.println("Bubble sort for 10 elements " + bubbleSortTimeComparison(array));
		array = new Integer[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		System.out.println("Bubble sort for 100 elements " + bubbleSortTimeComparison(array));
		array = new Integer[1000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Bubble sort for 1000 elements " + bubbleSortTimeComparison(array));
		array = new Integer[10000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Bubble sort for 10000 elements " + bubbleSortTimeComparison(array));
		array = new Integer[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Bubble sort for 100000 elements " + bubbleSortTimeComparison(array));
//		array = new Integer[1000000];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = random.nextInt(1000);
//		}
//		System.out.println("Bubble sort for 1000000 elements " + bubbleSortTimeComparison(array));
		/*----------------------------------------End of Selection sort---------------*/

		/*---------------------------------Shell Sort----------------*/
		array = new Integer[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);

		}
		System.out.println("Shell sort for 10 elements " + shellSortTimeComparison(array));
		array = new Integer[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		System.out.println("Shell sort for 100 elements " + shellSortTimeComparison(array));
		array = new Integer[1000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Shell sort for 1000 elements " + shellSortTimeComparison(array));
		array = new Integer[10000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Shell sort for 10000 elements " + shellSortTimeComparison(array));
		array = new Integer[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Shell sort for 100000 elements " + shellSortTimeComparison(array));
//		array = new Integer[1000000];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = random.nextInt(1000);
//		}
//		System.out.println("Shell sort for 1000000 elements " + shellSortTimeComparison(array));
		/*----------------------------------------End of Shell sort---------------*/

		/*---------------------------------Merge Sort----------------*/
		array = new Integer[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);

		}
		System.out.println("Merge sort for 10 elements " + mergeSortTimeComparison(array));
		array = new Integer[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		System.out.println("Merge sort for 100 elements " + mergeSortTimeComparison(array));
		array = new Integer[1000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Merge sort for 1000 elements " + mergeSortTimeComparison(array));
		array = new Integer[10000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Merge sort for 10000 elements " + mergeSortTimeComparison(array));
		array = new Integer[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Merge sort for 100000 elements " + mergeSortTimeComparison(array));
		array = new Integer[1000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Merge sort for 1000000 elements " + mergeSortTimeComparison(array));
		/*----------------------------------------End of Merge sort---------------*/

	}

	private static double insertionSortTimeCompariso(Integer[] array) {

		InsertionSort<Integer> sort = new InsertionSort<>();
		long begin = System.currentTimeMillis();
		sort.insertionSort(array);
		long end = System.currentTimeMillis();
		long time = (end - begin);
		double difference = time / 1000.0;
		return difference;

	}

	private static double selectionSortTimeComparison(Integer[] array) {
		SelectionSort<Integer> sort = new SelectionSort<>();
		long begin = System.currentTimeMillis();
		sort.selectionSort(array);
		long end = System.currentTimeMillis();
		long time = (end - begin);
		double difference = time / 1000.0;
		return difference;
	}

	private static double bubbleSortTimeComparison(Integer[] array) {

		BubbleSort<Integer> sort = new BubbleSort<>();
		long begin = System.currentTimeMillis();
		sort.bubbleSort(array);
		long end = System.currentTimeMillis();
		long time = (end - begin);
		double difference = time / 1000.0;
		return difference;

	}

	private static double shellSortTimeComparison(Integer[] array) {

		ShellSort sort = new ShellSort();
		long begin = System.currentTimeMillis();
		sort.sort(array);
		long end = System.currentTimeMillis();
		long time = (end - begin);
		double difference = time / 1000.0;
		return difference;

	}

	private static double mergeSortTimeComparison(Integer[] array) {

		MergeSort sort = new MergeSort();
		long begin = System.currentTimeMillis();
		sort.sort(array);
		long end = System.currentTimeMillis();
		long time = (end - begin);
		double difference = time / 1000.0;
		return difference;

	}

}
