import java.util.ArrayList;

public class PerfectNumber {

	public PerfectNumber() {
		// 
	}

	public static void main(String[] args) {

		for (int i = 2; i <= 10000; i++) {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList = gcd(i);
			if (!arrayList.isEmpty()) {
				int n = 0;
				for (int j = 0; j < arrayList.size(); j++) {
					n += arrayList.get(j);

				}
				if (n == i) {
					System.out.println(i + " is a perfect number");
				}

			}

		}
	}

	public static ArrayList<Integer> gcd(int number) {
		int j = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {

				arrayList.add(i);
			}

		}
		return arrayList;
	}

}
