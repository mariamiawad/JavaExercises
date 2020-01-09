package chapter06;
import java.util.Random;

public class Exercise_06_32 {

	public Exercise_06_32() {
		// 
	}

	public static void main(String[] args) {
		Random random = new Random();
		int i = 0;
		int count = 0;
		while (i < 10000) {
			int n = random.nextInt(6) + 1;
			int m = random.nextInt(6) + 1;
			int sum = n + m;
			System.out.println("You rolled " + m + " + " + n + " = " + sum);
			if (sum == 2 || sum == 3 || sum == 12) {
				System.out.println("You lose");
			} else if (sum == 7 || sum == 11) {
				System.out.println("You win");
				count++;
			}

			else {
				int sum2 = 0;
				while (true) {
					n = random.nextInt(6) + 1;
					m = random.nextInt(6) + 1;
					sum2 = n + m;
					System.out.println("You rolled " + m + " + " + n + " = " + sum2);
					if (sum2 == sum) {
						System.out.println("You win");
						count++;
						break;
					} else if (sum2 == 7) {
						System.out.println("You lose");
						break;
					}
				}
			}
			i++;
		}
		System.out.println(count);
	}
}
