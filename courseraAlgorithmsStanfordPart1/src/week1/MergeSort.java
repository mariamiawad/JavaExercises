package week1;

public class MergeSort {
	public static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for (int i = 0; i < n1; i++) {
			left[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arr[m + 1 + j];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;

		}
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	public static void sort(int[] arr, int l, int r) {
		if (r > l) {
			int middle = (l + r) / 2;
			sort(arr, l, middle);
			sort(arr, middle + 1, r);
			merge(arr, l, middle, r);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}
