import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class EqualStacks {

	static int equalStacks(int[] h1, int[] h2, int[] h3) {

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < h1.length; i++) {
			sum1 += h1[i];
		}
		for (int i = 0; i < h2.length; i++) {
			sum2 += h2[i];
		}
		for (int i = 0; i < h3.length; i++) {
			sum3 += h3[i];
		}
		int head1 = 0;
		int head2 = 0;
		int head3 = 0;
		while (true) {
			if (head1 == h1.length || head2 == h2.length || head3 == h3.length) {
				return 0;
			}
			if (sum1 == sum2 && sum2 == sum3) {
				return sum1;
			}
			if (sum1 >= sum2 && sum1 >= sum3) {
				sum1 -= h1[head1++];
			}
			else if (sum2 >= sum3) {
				sum2 -= h2[head2++];
			}
			else if (sum3 >= sum2 && sum3 >= sum1) {
				sum3 -= h3[head3++];
			}
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] n1N2N3 = scanner.nextLine().split(" ");

		int n1 = Integer.parseInt(n1N2N3[0].trim());

		int n2 = Integer.parseInt(n1N2N3[1].trim());

		int n3 = Integer.parseInt(n1N2N3[2].trim());

		int[] h1 = new int[n1];

		String[] h1Items = scanner.nextLine().split(" ");

		for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
			int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
			h1[h1Itr] = h1Item;
		}

		int[] h2 = new int[n2];

		String[] h2Items = scanner.nextLine().split(" ");

		for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
			int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
			h2[h2Itr] = h2Item;
		}

		int[] h3 = new int[n3];

		String[] h3Items = scanner.nextLine().split(" ");

		for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
			int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
			h3[h3Itr] = h3Item;
		}

		int result = equalStacks(h1, h2, h3);
		System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();
	}
}
