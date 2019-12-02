import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort2DArray {

	public static void main(String[] args) {

		int[][] m = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 },{20,30} };
		sort(m);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void sort(int m[][]) {
		int temp = 0;
		/*
		 * Arrays.sort(m, (a, b) -> Integer.compare(a[0], b[0])); Arrays.sort(m, (a, b)
		 * -> Integer.compare(b[0], a[0]));
		 */
		Collections.sort(Arrays.asList(m), new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				for (int i = 0; i < m.length; i++)
					if (a[i] != b[i])
						return a[i] - b[i];
				return a[m.length-1] - b[m.length-1];
			}
		});
	}
}
