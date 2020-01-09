package chapter18;
import java.util.Scanner;

public class Exercise_18_03 {

	public Exercise_18_03() {

	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int m = inputScanner.nextInt();
		int n = inputScanner.nextInt();
		System.out.println("the GCD of " + m + " and " + n + " is " + getGCD(m, n));
	}

	public static int getGCD(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			return getGCD(n, m % n);
		}
	}

}
