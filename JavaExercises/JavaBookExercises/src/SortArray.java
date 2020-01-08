import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(inputScanner.nextInt());
		}
		sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {

			for (int j = list.size() - 1; j > i; j--) {
				if (list.get(i) > list.get(j)) {

					int tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);

				}

			}

		}
	}
}
