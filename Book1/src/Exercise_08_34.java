import java.util.Scanner;

public class Exercise_08_34 {

	public Exercise_08_34() {
		
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter 6 points:");
		double [][] points = new double [6][2];
		for (int i = 0; i < points.length; i++) {
			points[i][0] = inputScanner.nextDouble();
			points[i][1]= inputScanner.nextDouble();
		}
		double[] result = getRightmostLowestPoint(points);
		System.out.println("The rightmost lowest point is (" + result[0] + "," + result[1]+")");
	}
	public static double[] getRightmostLowestPoint(double[][] points) {
		double min = Double.MAX_VALUE;
		double max = 0;
		double [] result = new double [2];
		for (int row = 0; row < points.length; row++) {
				if(min>=points[row][1] && max <= points[row][0]) {
					result[0] = points[row][0];
					result[1] = points[row][1];
				}
				min = points[row][1];
				max = points [row][0];
			
		}
		return result;
	}
}
