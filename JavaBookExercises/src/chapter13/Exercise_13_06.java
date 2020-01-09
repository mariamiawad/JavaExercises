package chapter13;

public class Exercise_13_06 {

	public Exercise_13_06() {
		// 
	}

	public static void main(String[] args) {
		Exercise_13_06_ComparableCircle comparableCircle1 = new Exercise_13_06_ComparableCircle(2);
		Exercise_13_06_ComparableCircle comparableCircle2 = new Exercise_13_06_ComparableCircle(3);
		if (comparableCircle1.compareTo(comparableCircle2) == 1) {
			System.out.println("Circle1 is larger");
		} else if (comparableCircle1.compareTo(comparableCircle2) == -1) {
			System.out.println("Circle2 is larger");
		} else if (comparableCircle1.compareTo((comparableCircle2)) == 0) {
			System.out.println("Circle1 and circle2 are equal");
		}
	}

}
