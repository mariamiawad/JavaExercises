package chapter10;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_10_15 {

	public Exercise_10_15() {
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter five points ");
		double[][] points = new double[5][2];
		for (int i = 0; i < points.length; i++) {
			points[i][0] = inputScanner.nextDouble();
			points[i][1] = inputScanner.nextDouble();
		}
		Exercise_10_13 rectangle2D = getRectangle(points);
		System.out.println("The bounding rectangle's center :(" + rectangle2D.getX() + "," + rectangle2D.getY() + ")"
				+ "width = " + rectangle2D.getWidth() + " height = " + rectangle2D.getHeight());
	}

	public static Exercise_10_13 getRectangle(double[][] points) {
		Exercise_10_13 rectangle2D = new Exercise_10_13();
		double xMax = points[0][0];
		double yMax = points[0][1];
		for (int i = 0; i < points.length; i++) {
			if (xMax < points[i][0] && yMax < points[i][1]) {
				xMax = points[i][0];
				yMax = points[i][1];
			}
		}
		double xMin = points[0][0];
		double yMin = points[0][1];
		for (int i = 0; i < points.length; i++) {
			if (xMin > points[i][0] && yMin < points[i][1]) {
				xMin = points[i][0];
				yMin = points[i][1];
			}
		}
		double x = (xMax + xMin) / 2;
		double y = (yMax + yMin) / 2;
		rectangle2D.setX(x);
		rectangle2D.setY(y);
		double height = Math.sqrt(Math.pow((xMin - xMin), 2) + (Math.pow((yMin - yMax), 2)));
		rectangle2D.setHeight(height);
		double width = Math.sqrt(Math.pow((xMin - xMax), 2) + (Math.pow((yMax - yMax), 2)));
		rectangle2D.setWidth(width);
		return rectangle2D;
	}
}
