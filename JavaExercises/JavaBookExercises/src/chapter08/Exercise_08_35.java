package chapter08;
import java.util.Scanner;

public class Exercise_08_35 {

	public Exercise_08_35() {
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the number of rows in the matrix:");
		int n = inputScanner.nextInt();
		int [][] m = new int [n][n];
		System.out.println("Enter the matrix row by row:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]= inputScanner.nextInt();
			}
		}
		
		int [] z = findLargestBlock(m);
		if(z[0]!=-1) {
			System.out.println("The maximum square submatrix is at (" + z[0] + "," + z[1] + ") with size " + z[2] );
		}
		else {
			System.out.println("There is no square submatrix");
		}
	}
	public static int[] findLargestBlock(int[][] m) {
		int n[] = {-1,-1,-1};
		boolean flag = true;
		for (int i = 1; i < m.length; i++) {
			for (int j = 1; j < m[i].length; j++) {
				if(m[i-1][j-1] == 1 && m[i-1][j]==1) {
					if(m[i][j-1]==1 && m[i][j]==1) {
						n[0]=i-1;
						n[1]=j -1;
						flag = false;
						break;
					}
				}
				if (!flag) {
					break;
				}
			}
		}
		if(n[0]!=-1 && n[1]!=-1) {
			n[2]= findCount(m, n);
		}
		return n;
	}
	public static int findCount(int[][] m, int[]n) {
		int n1 = n[0];
		int count = 1;
		for (int i = n1+1; i < m.length; i++) {
			if(m[i][i] == 1) {
				count++;
			}
		}
		return count;
	}
	

}
