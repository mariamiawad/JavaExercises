
public class PatternC {

	public PatternC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		for (int row = 1; row < 7; row++) {

			for (int column = 6; column > row; column--) {
				System.out.print(row+ "  ");
			}
			for (int i = row; i > 0; i--) {

				System.out.print(i);
				for (int j = 0; j < 1; j++) {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}
}