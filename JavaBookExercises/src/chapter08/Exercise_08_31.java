package chapter08;
import java.util.Scanner;

public class Exercise_08_31 {

	public Exercise_08_31() {

	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		double[][] array = new double[4][2];
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = inputScanner.nextDouble();

			}
		}
		double[] results = getIntersectingPoint(array);
		if (results == null) {
			System.out.println("the two lines are parallel");
		}
		System.out.println("The intersecting point is at (" + results[0] + "," + results[1] + ")");
	}

	public static double[] getIntersectingPoint(double[][] points) {
		double x1 = points[0][0];
		double y1 = points[0][1];
		double x2 = points[1][0];
		double y2 = points[1][1];
		double x3 = points[2][0];
		double y3 = points[2][1];
		double x4 = points[3][0];
		double y4 = points[3][1];
		double a = y1 - y2;
		double b = -(x1 - x2);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double c = (y3 - y4);
		double d = -(x3 - x4);
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		double[] result = { x, y };
		return result;
	}

}
