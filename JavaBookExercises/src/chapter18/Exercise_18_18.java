package chapter18;

import java.util.Scanner;

public class Exercise_18_18 {
	static int count = 0;

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();

		System.out.println("The moves are:");
		moveDisks(n, 'A', 'B', 'C');
		System.out.println(count);
	}

	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		count++;
		if (n == 1) {
			
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
		} else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
}
