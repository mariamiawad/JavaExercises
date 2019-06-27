import java.util.Scanner;
public class ScissorRockPaper {
	public static void main ( String[] args){
		int random = (int)(Math.random()*3);
		Scanner input = new Scanner (System.in);
		System.out.println("scissor (0), rock (1), paper (2):");
		int result = input.nextInt();
		if (result <=2 && result >=0){
			if (result ==0 && random == 2 ){
				System.out.println("The computer is papper. You are scissor. You won");
			}
			else if (result == 0 && random == 1){
				System.out.println("The computer is rock. You are scissor. You loose");
			}
			else if (result == 1 && random == 0){
				System.out.println("The computer is scissor. You are rock. You win");
			}
			else if (result == 1 && random == 2){
				System.out.println("The computer is paper. You are rock. You loose");
			}
			else if (result == 2 && random == 0){
				System.out.println("The computer is scissor. You are paper. You loose");
			}
			else if (result == 2 && random == 1){
				System.out.println("The computer is rock. You are paper. You won");
			}
			else if (result == 0 && random == 0){
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			}
			else if (result == 1 && random == 1){
				System.out.println("The computer is rock. You are rock too. It is a draw");
			}
			else if (result == 2 && random == 2){
				System.out.println("The computer is paper. You are paper too. It is a draw");
			}
	}
		else {
			System.out.println("Invalid Number");
			System.exit(1);
		}
	}
}