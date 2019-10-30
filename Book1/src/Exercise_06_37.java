import java.util.Scanner;

public class Exercise_06_37 {

	public Exercise_06_37() {
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int number = inputScanner.nextInt();
		int width = inputScanner.nextInt();
		System.out.println(format(number, width));
	}
	public static String format(int number, int width) {
		String string = number +"";
		String string2 = "";
		for (int i = 0; i < width- string.length(); i++) {
			string2 += "0";
		}
		string2+= string;
		return string2;
	}
}
