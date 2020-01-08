import java.util.Scanner;

public class PointOnLineSegment {

	public PointOnLineSegment() {
		// 
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter three points for p0, p1, and p2:");
		double x1 = inputScanner.nextDouble();
		double y1 = inputScanner.nextDouble();
		double x2 = inputScanner.nextDouble();
		double y2 = inputScanner.nextDouble();
		double x3 = inputScanner.nextDouble();
		double y3 = inputScanner.nextDouble();
		if ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1) == 0 && isBetween(x1, x2, x3, y1, y2, y3)) {
			System.out.println("(" + x3 + "," + y3 + ") is on the line segment from (" + x1 + "," + y1 + ")to (" + x2
					+ "," + y2 + ")");
		} else {
			System.out.println("(" + x3 + "," + y3 + ") is not on the line segment from (" + x1 + "," + y1 + ") to ("
					+ x2 + "," + y2 + ")");
		}
	}

	public static boolean isBetween(double x1, double x2, double x3, double y1, double y2, double y3) {
		return (((x3 < x2 && x3 > x1) || (x3 < x1 && x3 > x2)) && ((y3 < y2 && y3 > y1) || (y3 < y1 && y3 > y2)));
	}
}
