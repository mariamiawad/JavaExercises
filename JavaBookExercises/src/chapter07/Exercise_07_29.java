package chapter07;
import java.util.Random;

public class Exercise_07_29 {

	public Exercise_07_29() {
	}

	public static void main(String[] args) {
		int sum = 0;
		while (sum!=24) {
			int[] cards = generateCards();
			sum = sum(cards);
			if (sum == 24) {
				sum = sum(cards);
				for (int i = 0; i < cards.length; i++) {
					System.out.print(cards[i] + " ");	
				}
			}
		}
	}
			
	private static int[] generateCards() {
		Random random = new Random();
		int[] cards = new int[4];
		for (int i = 0; i < 4; i++) {
			cards[i] = random.nextInt(13)+1;
		}
		return cards;
	}

	private static int sum(int[] cards) {
		int sum = 0;
		for (int i = 0; i < cards.length; i++) {
			sum+= cards[i];
		}
		return sum;
	}
}
