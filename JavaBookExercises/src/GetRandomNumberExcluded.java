import java.util.Random;
import java.util.Scanner;

public class GetRandomNumberExcluded {

	public static int getRandom(int... numbers) {
		int range = 54 - 1 + 1;
		int randomNumber = 0;
		boolean flag = true;
		while (flag) {
			flag = false;
			randomNumber = (int) (Math.random() * range) + 1;
			for (int i = 0; i < numbers.length; i++) {
				if (randomNumber == numbers[i]) {
					flag= true;
					break;
				}
			}
			

		}
		return randomNumber;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter 10 numbers");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		int random = getRandom(numbers);
		System.out.println(random);
	}
}
