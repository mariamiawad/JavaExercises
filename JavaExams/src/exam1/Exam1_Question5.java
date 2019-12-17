package exam1;

import java.util.Random;

public class Exam1_Question5 {
	public static void main(String[] args) {
		int NUMBER_OF_TRIALS = 10000000;
		int count = 0;
		Random random = new Random();
		for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
			int ones = 0;
			for (int j = 1; j < 7; j++) {

				int randomNumber = random.nextInt(6) + 1;
				if (randomNumber == 1) {
					ones++;
				}

			}
			if (ones >= 1) {
				count++;

			}
		}
		System.out.println(1.0 * count / NUMBER_OF_TRIALS);
		count = 0;
		for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
			int ones = 0;
			for (int j = 1; j < 13; j++) {

				int randomNumber = random.nextInt(6) + 1;
				if (randomNumber == 1) {
					ones++;
				}

			}
			if (ones >= 2) {
				count++;

			}
		}
		System.out.println(1.0 * count / NUMBER_OF_TRIALS);
	}

}
