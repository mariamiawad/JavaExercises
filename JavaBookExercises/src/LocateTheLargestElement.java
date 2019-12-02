import java.util.Scanner;

public class LocateTheLargestElement {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array:");
		int x = inputScanner.nextInt();
		int y = inputScanner.nextInt();
		double[][] a = new double[x][y];
		System.out.println("Enter the array:");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <y; j++) {
				a[i][j] = inputScanner.nextDouble();
			}
		}
		int[] locatotion = locateLargest(a);
		System.out.println("The location of the largest element is at ("+locatotion[0] + "," + locatotion[1]+")");

	}

	public static int[] locateLargest(double[][] a) {
		double max = 0;
		int[] location = new int[2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
					location[0] = i;
					location[1] = j;
				}
			}

		}
		return location;
	}
}
