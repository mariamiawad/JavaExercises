import java.util.Random;
import java.util.Scanner;

public class NewScissorRockPaper {

	public NewScissorRockPaper() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		int wonComputer = 0;
		int wonPlayer = 0;
		while (wonPlayer < 2 && wonComputer < 2) {
			System.out.println("scissor (0), rock (1), paper (2):");
			int player = inputScanner.nextInt();
			Random random = new Random();
			int computer = random.nextInt(3);
			if (player == 0 && computer == 2) {
				System.out.println("The computer is paper. You are scissor. You won");
				wonPlayer++;
			} else if (player == 2 && computer == 0) {
				System.out.println("The computer is scissor. You are paper. Computer Won");
				wonComputer++;
			} else if (player == 1 && computer == 0) {
				System.out.println("The computer is scissor. You are rock. You won");
				wonPlayer++;
			} else if (player == 0 && computer == 1) {
				System.out.println("The computer is rock. You are scissor. Computer won");
				wonComputer++;
			} else if (player == 1 && computer == 2) {
				System.out.println("The computer is paper. You are rock. Computer won");
				wonComputer++;
			} else if (player == 2 && computer == 1) {
				System.out.println("The computer is rock. You are paper. You won");
				wonPlayer++;
			} else if (computer == 0 && player == 0) {
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			} else if (computer == 1 && player == 1) {
				System.out.println("The computer is rock. You are rock too. It is a draw");

			} else if (computer == 2 && player == 2) {
				System.out.println("The computer is paper. You are paper too. It is a draw");

			}

		}
	}
}
