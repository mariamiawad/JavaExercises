import java.util.Scanner;

public class TicTocTOE {

	public TicTocTOE() {
		// TODO Auto-generated constructor stub
	}

	static char[][] character = new char[3][3];
	static char currentPlayerMark = 'X';

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		for (int i = 0; i < character.length; i++) {
			for (int j = 0; j < character.length; j++) {
				character[i][j] = '-';
			}
		}

//		for (int i = 0; i < 9 && !checkWinner(); i++) {
			
//			printBoard();
//			int row = 0;
//			int column = 0;
//			System.out.println("Enter a row (0, 1, or 2) for player " + "" + currentPlayerMark);
//			row = inputScanner.nextInt();
//			System.out.println("Enter a column (0, 1, or 2) for player " + "" + currentPlayerMark);
//			column = inputScanner.nextInt();
//			if (checkAvailability(row, column)) {
				
//
//			if (character[row][column] == '-' && currentPlayerMark == 'X') {
//				character[row][column] = 'X';
//			} else if (character[row][column] == '-' && currentPlayerMark == 'O') {
//				character[row][column] = 'O';
//			}
//			changePlayer();

//		}
//			else {
//				System.out.println("Invalid Input");
//				break;
//			}
		if (!isFull() && checkWinner() && currentPlayerMark == 'O') {
			System.out.println("X wins");
		} else if (!isFull() && checkWinner() && currentPlayerMark == 'X') {
			System.out.println("O  wins");
		} else if (isFull()) {
			System.out.println("it's a tie");
		}
		}
//	}

	private static void printBoard() {

		for (int i = 0; i < 3; i++) {
			System.out.print("|   ");
			for (int j = 0; j < 3; j++) {
				System.out.print(character[i][j] + "   |   ");
			}
			System.out.println();
			System.out.println("-------------------------");
		}

	}

	public static boolean checkWinner() {
		for (int i = 0; i < character.length; i++) {
			if (checkRowCol(character[i][0], character[i][1], character[i][2])) {
				return true;
			} else if (checkRowCol(character[0][i], character[1][i], character[2][i])) {
				return true;
			} else if (checkRowCol(character[0][0], character[1][1], character[2][2])
					|| checkRowCol(character[0][2], character[1][1], character[2][0])) {
				return true;
			} else if (checkRowCol(character[0][0], character[1][1], character[2][2])) {
				return true;
			}

		}

		return false;
	}

	private static boolean checkRowCol(char c1, char c2, char c3) {
		return ((c1 != '-') && (c1 == c2) && (c2 == c3));
	}

	public static boolean isFull() {
		boolean flag = true;
		for (int i = 0; i < character.length; i++) {
			for (int j = 0; j < character.length; j++) {
				if (character[i][j] != '-') {
					flag = false;
				} else {
					flag = true;
				}

			}
		}
		return flag;

	}

	public static boolean checkAvailability(int row, int column) {
		{
			if ((row >= 0) && (row < 3)) {
				if ((column >= 0) && (column < 3)) {
					if (character[row][column] == '-') {
						
						return true;
					}
				}
			}
		}
		return false;

	}

	public static void changePlayer() {
		if (currentPlayerMark == 'X') {
			currentPlayerMark = 'O';
		} else {
			currentPlayerMark = 'X';
		}

	}
}
