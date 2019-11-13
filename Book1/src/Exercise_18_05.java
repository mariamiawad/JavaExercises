
public class Exercise_18_05 {

	public Exercise_18_05() {

	}

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(sumSeries(i));
		}
	}

	public static double sumSeries(double i) {

		if (i == 1)
			return i / (2 * i + 1);
		return (i / (2 * i + 1)) + sumSeries(i - 1);
	}
}
