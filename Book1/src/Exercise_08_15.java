import java.util.Scanner;

public class Exercise_08_15 {

	public Exercise_08_15() {
		
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter five points:");
		double [][] points = new double [5][2];
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = inputScanner.nextDouble();
			}
		}
		if (sameLine(points)) {
			System.out.println("The five points are on the same line");
		}
		else {
			System.out.println("The five points are not on the same line");
		}
	}
	public static boolean sameLine(double[][] points) {
		boolean flag = false;
		for (int i = 1; i < points.length-1; i++) {
			
			for (int j = 1; j < points[i].length; j++) {
				double x0 = points[i-1][j-1];
				double y0 = points[i-1][j];
				double x1 = points[i][j-1];
				double y1 = points[i][j];
				double x2 = points[i+1][j-1];
				double y2 = points[i+1][j];
				if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
			if (!flag) {
				break;
			}
			
		}
		return flag;
	}
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0);
	}
}
