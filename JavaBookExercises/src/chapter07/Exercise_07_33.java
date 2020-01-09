package chapter07;
import java.util.Scanner;

public class Exercise_07_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();
		String[] name = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse",
				"sheep" };
		switch (year % 12) {
		case 0:
			System.out.println(name[0]);
			break;
		case 1:
			System.out.println(name[1]);
			break;
		case 2:
			System.out.println(name[2]);
			break;
		case 3:
			System.out.println(name[3]);
			break;
		case 4:
			System.out.println(name[4]);
			break;
		case 5:
			System.out.println(name[5]);
			break;
		case 6:
			System.out.println(name[6]);
			break;
		case 7:
			System.out.println(name[7]);
			break;
		case 8:
			System.out.println(name[8]);
			break;
		case 9:
			System.out.println(name[9]);
			break;
		case 10:
			System.out.println(name[10]);
			break;
		case 11:
			System.out.println(name[11]);
		}
	}
}