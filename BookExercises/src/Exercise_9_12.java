import java.util.Scanner;

public class Exercise_9_12 {

	public Exercise_9_12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter (x1,y1), (x2y2), (x3,y3) and (x4,y4)");
		double x1 = inputScanner.nextDouble();
		double y1 = inputScanner.nextDouble();
		double x2 = inputScanner.nextDouble();
		double y2 = inputScanner.nextDouble();
		double x3 = inputScanner.nextDouble();
		double y3 = inputScanner.nextDouble();
		double x4 = inputScanner.nextDouble();
		double y4 = inputScanner.nextDouble();
		LinearEquationClass linearEquationClass = getIntersectingPoint(x1, y1, x2, y2, x3, y3, x4, y4);
		if (linearEquationClass.isSolvable()) {
			System.out.println("The intersecting point is at (" + linearEquationClass.getX() + ", "
					+ linearEquationClass.getY() + ")");
		} else {
			System.out.println("The two lines are parallel");
		}

	}

	public static LinearEquationClass getIntersectingPoint(double x1, double y1, double x2, double y2, double x3,
			double y3, double x4, double y4) {
		double a = (y1 - y2);
		double b = (-x1 + x2);
		double c = (y3 - y4);
		double d = (-x3 + x4);
		double e = -y1 * (x1 - x2) + (y1 - y2) * x1;
		double f = -y3 * (x3 - x4) + (y3 - y4) * x3;

		return new LinearEquationClass(a, b, c, d, e, f);
	}
}