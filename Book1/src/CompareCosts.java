import java.util.Scanner;

public class CompareCosts {

	public CompareCosts() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter weight and price for package 1:");
		double weight1 = inputScanner.nextDouble();
		double price1 = inputScanner.nextDouble();
		System.out.println("Enter weight and price for package 2:");
		double weight2 = inputScanner.nextDouble();
		double price2 = inputScanner.nextDouble();
		double package1 = price1/weight1;
		double package2 = price2/weight2;
		if (package1 > package2) {
			System.out.println("Package 2 has a better price.");
		} else if (package2 > package1) {
			System.out.println("Package 1 has a better price.");

		}
		else if (package1==package2) {
			System.out.println("Two packages have the same price.");
			
		}
	}

}
