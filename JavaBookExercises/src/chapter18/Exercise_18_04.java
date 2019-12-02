package chapter18;

public class Exercise_18_04 {

	public Exercise_18_04() {

	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(sumSeries(i));
		}
	}

	public static double sumSeries(double i) {

		if (i == 1)
			return 1;
		return (1/i +sumSeries(i - 1)) ;
	}

}
