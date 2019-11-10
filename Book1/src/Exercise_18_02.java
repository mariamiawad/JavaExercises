import java.util.Scanner;

public class Exercise_18_02 {

	public Exercise_18_02() {
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		int f0 = 0;
		int f1 = 1;
		int currentFib = 0;
		for (int i = 1; i < n; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}
		System.out.println(currentFib);
	}
}
