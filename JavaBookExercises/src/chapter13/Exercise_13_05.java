package chapter13;

public class Exercise_13_05 {

	public Exercise_13_05() {
		// 
	}

	public static void main(String[] args) {
		Exercise_13_05_GeometricObject circle1 = new Exercise_13_05_Circle(4);
		Exercise_13_05_GeometricObject circle2 = new Exercise_13_05_Circle(3.5);
		Exercise_13_05_GeometricObject rectangle1 = new Exercise_13_05_Rectangle(3, 7);
		Exercise_13_05_GeometricObject rectangle2 = new Exercise_13_05_Rectangle(5, 7);
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("Circle1 is larger");
		} else if (circle1.compareTo(circle2) == -1) {
			System.out.println("Circle2 is larger");
		} else if (circle1.compareTo(circle2) == 0) {
			System.out.println("Circle1 and circle2 are equal");
		}
		if (rectangle1.compareTo(rectangle2) == 1) {
			System.out.println("rectangle1 is larger");
		} else if (rectangle1.compareTo(rectangle2) == -1) {
			System.out.println("rectangle2 is larger");
		} else if (rectangle1.compareTo(rectangle2) == 0) {
			System.out.println("rectangle1 and rectangle2 are equal");
		}
	}

}
