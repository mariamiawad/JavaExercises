package exam02;
import java.util.Scanner;

public class Exam02_Question01 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int length = inputScanner.nextInt();
		int[] x = new int[length];
		int[] y = new int[length];
		int cellToVisit = length * length;
		boolean[][] visitedCells = new boolean[length][length];
		for (int i = 0; i < length; i++) {
			x[i] = length / 2;
			y[i] = length / 2;
		}
		visitedCells[length / 2][length / 2] = true;
		cellToVisit--;
		int steps = 0;
		while (cellToVisit > 0) {
			steps++;
			for (int i = 0; i < length; i++) {

				double n = Math.random();
				if (n<= 0.25) {
					x[i]++;

				} else if (n<=0.50) {
					x[i]--;
				} else if (n<=0.75) {
					y[i]++;
				} else if (n<=1.0) {
					y[i]--;
				}
				if (x[i] < length && y[i] < length && x[i] >= 0 && y[i] >= 0 && !visitedCells[x[i]][y[i]]) {
					cellToVisit--;
					visitedCells[x[i]][y[i]] = true;
				}
			}

		}
		System.out.println(steps);

	}
}
