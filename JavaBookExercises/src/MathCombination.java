
public class MathCombination {

	public MathCombination() {
		// 
	}

	public static void main(String[] args) {
		String s = "";
		int count = 0;
		for (int i = 1; i < 8; i++) {
			for (int j = 2; j < 8; j++) {
				if (j != i && !s.contains(j + " " + i)) {
					s += i + " " + j + " \n";
					count++;
				}
			}
		}
		System.out.println(s);
		System.out.println(count);
	}
}
