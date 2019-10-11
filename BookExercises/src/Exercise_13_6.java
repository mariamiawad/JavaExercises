
public class Exercise_13_6 {

	public Exercise_13_6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Exercise_13_6_ComparableCircle comparableCircle1 = new Exercise_13_6_ComparableCircle(2);
		Exercise_13_6_ComparableCircle comparableCircle2 = new Exercise_13_6_ComparableCircle(3);
		if (comparableCircle1.compareTo(comparableCircle2) == 1) {
			System.out.println("Circle1 is larger");
		} else if (comparableCircle1.compareTo(comparableCircle2) == -1) {
			System.out.println("Circle2 is larger");
		} else if (comparableCircle1.compareTo((comparableCircle2)) == 0) {
			System.out.println("Circle1 and circle2 are equal");
		}
	}

}
