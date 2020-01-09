import java.util.Scanner;

public class ComputeMeanAndStandardDeviation {

	public ComputeMeanAndStandardDeviation() {
		// 
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		double[] array = new double[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = inputScanner.nextDouble();
		}
		double mean = sum(array) / array.length;
		double sumSquare =Math.pow(sum(array), 2)/array.length;
		double deviation = sqrtSum(array)-sumSquare;
		deviation = deviation/(array.length-1);
		System.out.println(mean);
		System.out.println(Math.sqrt(deviation));

	}

	public static double sum(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static double sqrtSum(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += Math.pow(array[i], 2);
		}
		return sum;
	}
}
