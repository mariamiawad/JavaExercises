package codejam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Vestigium {
	public static int[] vestigium(int[][] matrix) {
		int n = matrix.length;
		int r = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				set.add(matrix[i][j]);
			}
			if (set.size() != n) {
				r++;

			}
			set.clear();
		}
		int c = 0;
		int j = 0;
		int sum = 0;
		for (int row = 0; row < n; row++) {
			sum += matrix[row][row];
			j++;
		}
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				set.add(matrix[col][row]);
			}
			if (set.size() != n) {
				c++;
			}
			set.clear();
		}
		int[] m = new int[3];
		m[0] = sum;
		m[1] = r;
		m[2] = c;
		return m;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int caseNum = 1;
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[][] matrix = new int[n][n];
			for (int j = 0; j < matrix.length; j++) {
				for (int j2 = 0; j2 < matrix.length; j2++) {
					matrix[j][j2] = scanner.nextInt();
				}
				
			}
			int [ ] result = vestigium(matrix);
			System.out.println("Case #" +caseNum + ": " + result[0]+" "+  result[1]+" "+ result[2]);
			caseNum++;

			
		}
	}

}