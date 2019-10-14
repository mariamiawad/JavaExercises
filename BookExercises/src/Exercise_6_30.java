import java.util.Random;

public class Exercise_6_30 {

	public Exercise_6_30() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(6) + 1;
		int m = random.nextInt(6) + 1;
		int sum = n + m;
		System.out.println("You rolled " + m + " + " + n + " = " + sum);
		if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("You lose");
		} else if (sum == 7 || sum == 11) {
			System.out.println("You win");
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
					break;
				} else if (sum2 == 7) {
					System.out.println("You lose");
					break;
				}
			}
		}
	}
}
