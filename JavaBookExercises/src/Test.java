public abstract class Test<E extends Object> {
	public static void main(String[] args) {
		int[] list = new int[7];
		list[0] = 1000;
		list[1] = 6;
		list[2] = (52);
		list[3] = (9);
		list[4] = (11);
		list[5] = (4);
		list[6] = 1;
		mergeSort(list, 0, list.length - 1);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	static void merge(int Arr[], int start, int mid, int end) {

		// create a temp array
		int temp[] = new int[end - start + 1];

		// crawlers for both intervals and for temp
		int i = start;
		int j = mid + 1;
		int k = 0;

		// traverse both arrays and in each iteration add smaller of both elements in
		// temp
		while (i <= mid && j <= end) {
			if (Arr[i] <= Arr[j]) {
				temp[k] = Arr[i];
				k += 1;
				i += 1;
			} else {
				temp[k] = Arr[j];
				k += 1;
				j += 1;
			}
		}

		// add elements left in the first interval
		while (i <= mid) {
			temp[k] = Arr[i];
			k += 1;
			i += 1;
		}

		// add elements left in the second interval
		while (j <= end) {
			temp[k] = Arr[j];
			k += 1;
			j += 1;
		}

		// copy temp to original interval
		for (i = start; i <= end; i += 1) {
			Arr[i] = temp[i - start];
		}
	}

	// Arr is an array of integer type
	// start and end are the starting and ending index of current interval of Arr

	static void mergeSort(int Arr[], int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(Arr, start, mid);
			mergeSort(Arr, mid + 1, end);
			merge(Arr, start, mid, end);
		}
	}

}