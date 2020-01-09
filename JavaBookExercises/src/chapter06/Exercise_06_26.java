package chapter06;

public class Exercise_06_26 {

	public Exercise_06_26() {
		// 
	}

	public static void main(String[] args) {
		int number = 0;
		int count = 0;
		int count2 = 0;
		while (count2 <= 100) {

			for (int i = 0; count2 <= 100; i++) {
				if (isPrime(i)) {
					String string = i + "";
					String string2 = "";
					if (string.length() > 1) {

						char[] character = new char[string.length()];
						for (int j = string.length() - 1, j2 = 0; j >= 0; j--, j2++) {
							character[j2] = string.charAt(j);
						}

						for (int j = 0; j < character.length; j++) {
							string2 += character[j];
						}
					}

					if (string.equals(string2) || string.length() == 1) {
						number = i;
						count++;
						System.out.print(number + " ");
						if (count % 10 == 0 && count > 0) {
							System.out.println();
						}
						count2++;
					}

				}
			}

		}
	}

	public static boolean isPrime(int number) {
		// Corner case
		if (number <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
