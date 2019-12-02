package chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_11_16 {
	private static List<Integer> list = new ArrayList<Integer>();

	public Exercise_11_16() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		list.add(answer);
		int i = 0;
		while (number1 + number2 != answer) {

			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			if (list.contains(answer)) {
				System.out.println("You entered  this answer before");
				continue;
			}
			list.add(answer);

		}

		System.out.println("You got it!");
	}

}
