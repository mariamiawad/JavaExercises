import java.util.Random;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		// Generate a lottery number
		Random random = new Random();

		// Prompt the user to enter a guess
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		String guess = inputScanner.next();
		String lottery = "";
		int r = random.nextInt(10);
		while (true) {
			int x = random.nextInt(10);
			if (x != r) {
				lottery = x + "" + r;
				break;

			}
		}
		System.out.println("The lottery number is " + lottery);

		// Check the guess
		if (guess.equalsIgnoreCase(lottery))
			System.out.println("Exact match: you win $10,000");
		else if (lottery.charAt(1) == guess.charAt(0) && lottery.charAt(0) == guess.charAt(1))
			System.out.println("Match all digits: you win $3,000");
		else if (lottery.charAt(0) == guess.charAt(0) || lottery.charAt(1) == guess.charAt(1)
				|| lottery.charAt(0) == guess.charAt(1) || lottery.charAt(1) == guess.charAt(0))
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
	}
}
