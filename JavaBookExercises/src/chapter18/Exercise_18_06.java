package chapter18;

public class Exercise_18_06 {

	public Exercise_18_06() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(sumSeries(i));
		}
	}

	public static double sumSeries(double i) {

		if (i == 1)
			return i / ( i + 1);
		return (i / ( i + 1)) + sumSeries(i - 1);
	}
}
