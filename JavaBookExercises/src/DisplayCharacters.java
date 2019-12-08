import java.util.Scanner;

public class DisplayCharacters {

	public static void displayCharacters(char char1, char char2, int numberPerLine) {
		
		char [] s = new char[ (int)Math.abs(char1-char2)-1];
		for (int i = s.length, j = 0; i>0; i--, j++) {
			s [j] =(char)(Math.max(char1, char2)-i);
			
		}
		for (int i = 0; i < s.length; i++) {
			if(i%numberPerLine==0 && i>0) {
				System.out.println();
			}
			System.out.print(s[i] + " " );
		}
		// 
	}
	public static void main(String[] args) {
		Scanner inputScanner  = new Scanner(System.in);
		char char1 = inputScanner.next().charAt(0);
		char char2 = inputScanner.next().charAt(0);
		int numberPerLine = inputScanner.nextInt();
		displayCharacters(char1, char2, numberPerLine);
	}

}
