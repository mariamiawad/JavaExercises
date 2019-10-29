import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMMachine {

	public ATMMachine() {
		// TODO Auto-generated constructor stub
	}

	static int choice = 0;

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		Scanner inputScanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter an id: ");
			int id = inputScanner.nextInt();
			do {

				if (list.contains(id)) {
					AccountClass accountClass = new AccountClass(id, 100);
					System.out.println("Main menu");
					System.out.println("1: check balance");
					System.out.println("2: withdraw");
					System.out.println("3: deposit");
					System.out.println("4: exit");
					System.out.println("Enter a choice:");
					choice = inputScanner.nextInt();
					if (choice == 1) {
						System.out.println(accountClass.getBalance());
						continue;
					}
					if (choice == 2) {
						System.out.println("Enter an amount to withdraw:");
						double amount = inputScanner.nextDouble();
						accountClass.withdraw(amount);
						
						continue;
					}
					if (choice == 3) {
						System.out.println("Enter an amount to deposit:");
						double amount = inputScanner.nextDouble();
						accountClass.deposit(amount);
						
						continue;
					}
				}
			} while (choice != 4);
		}
	}
}
