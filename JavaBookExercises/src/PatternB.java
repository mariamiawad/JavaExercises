
public class PatternB {

	public PatternB() {
		// 
	}
public static void main(String[] args) {

	for (int row = 6; row >0; row--) {
		for (int column = 1; column <=row; column++) {
			System.out.print(column + " ");
		}
		System.out.println();
	}

}
}
