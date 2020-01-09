package chapter08;
import java.util.Scanner;

public class Exercise_08_21 {

	public Exercise_08_21() {
		// 
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the number of cities:");
		int numberOfCities = inputScanner.nextInt();
		double[][] xy = new double[numberOfCities][2];
		System.out.println("Enter the coordinates of the cities:");
		for (int i = 0; i < xy.length; i++) {
			for (int j = 0; j < xy[0].length; j++) {
				xy[i][j] = inputScanner.nextDouble();
			}
		}
		double[] index = shortestPath(xy);
//		int i = index[0][0];
//		int j = index[0][1];
//		int i2 = index[1][0];
//		int j2 = index[1][1];
		System.out.println("The central city is at(" + index[0] + "," + index[1] + ")");
		System.out.println("The total distance to all other cities is " + index[2]);
	}

	private static double[] shortestPath(double[][] xy) {
		double min = Double.MAX_VALUE;
		double[] index = new double[3];
		double x = 0;
		double y = 0;
		double nextY = 0;
		double nextX = 0;
		double distance = 0;
		double total = 0;
		for (int i = 0; i < xy.length - 1; i++) {
			for (int j = 0; j < xy[0].length - 1; j++) {
				x = xy[i][j];
				y = xy[i][j + 1];
				nextX = xy[i + 1][j];
				nextY = xy[i + 1][j + 1];
				distance = Math.sqrt(Math.pow((x - nextX), 2) + Math.pow((y - nextY), 2));
				if (min > distance) {
					min = distance;
					index[0] = Math.min(x, nextX);
					if (index[0] == x) {
						index[1] = y;
					} else {
						index[1] = nextY;
					}

				}
			}
		}
		for (int i = 0; i < xy.length; i++) {
			for (int j = 0; j < xy[0].length - 1; j++) {
				x = index[0];
				y = index[1];
				nextX = xy[i][j];
				nextY = xy[i][j + 1];
				total += Math.sqrt(Math.pow((x - nextX), 2) + Math.pow((y - nextY), 2));
			}
		}
		index[2] = total;
		return index;
	}
}
