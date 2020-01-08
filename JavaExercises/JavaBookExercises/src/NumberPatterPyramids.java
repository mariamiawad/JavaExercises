
public class NumberPatterPyramids {

	public NumberPatterPyramids() {

	}

	public static void main(String[] args) {

		for (int row = 1; row <= 8; row++) {

			for (int column = 7; column >= row; column--) {
				System.out.print("    ");
			}

			for (int j = 0; j < row; j++) {
				System.out.printf("%4d", (int) Math.pow(2, j));
			}

			// Printing number decreamentally from i-2 to 0
			for (int j = row - 2; j >= 0; j--) {
				System.out.printf("%4d", (int) Math.pow(2, j));
			}

			System.out.println();
		}

	}

}
