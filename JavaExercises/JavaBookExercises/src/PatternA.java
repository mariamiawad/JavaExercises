
public class PatternA {

	public PatternA() {
		// 
	}
public static void main(String[] args) {
	for (int row = 1; row < 7; row++) {
		for (int column = 1; column <=row; column++) {
			System.out.print(column + " ");
		}
		System.out.println();
	}
}
}
