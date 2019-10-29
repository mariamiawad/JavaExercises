import java.util.Scanner;

public class PointPosition {

	public PointPosition() {
		// TODO Auto-generated constructor stub
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
	if ((x2 - x1)*(y3 - y1) - (x3 - x1)*(y2 - y1)>0) {
		System.out.println("("+x3+","+ y3+") is on the left side of the line from (" +x1+","+y1+") to (" +x2+","+y2+")");
	}
	else if ((x2 - x1)*(y3 - y1) - (x3 - x1)*(y2 - y1)==0) {
		System.out.println("("+x3+","+ y3+") is one the line from (" +x1+","+y1+")to (" +x2+","+y2+")");
	}
	else if ((x2 - x1)*(y3 - y1) - (x3 - x1)*(y2 - y1)<0) {
		System.out.println("("+x3+","+ y3+") is one the right side of the line from (" +x1+","+y1+") to (" +x2+","+y2+")");
	}
}
}
