import java.util.Scanner;

public class AlSaied3 {
	static final double MILEAGE_REIMBURSEMENT = 0.58;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your full name:");
		String name = scanner.nextLine();
		System.out.print("Please enter the location of your meeting:");
		String location = scanner.nextLine();
		System.out.print("Please enter the miles travelled for the meeting:");
		double numberOfMiles = scanner.nextDouble();
		System.out.print("Please enter the amount paid for the hotel:");
		double costOfTheHotel = scanner.nextDouble();
		print(costOfTheHotel, numberOfMiles, name, location);
	}
	public static void asterisks() {
		for (int i = 0; i < 40; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 40; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static double calculateTheMileageAmountReimbursed(double numberOfMiles) {
		return  MILEAGE_REIMBURSEMENT * numberOfMiles;
		
	}
	public static double  calculateTheTotalAmountReimbursed( double costOfTheHotel, double numberOfMiles ) {
		return calculateTheMileageAmountReimbursed(numberOfMiles) + costOfTheHotel;
	}
	public static void print(double costOfTheHotel , double numberOfMiles, String name, String location) {
		asterisks();
		System.out.println("Travel reimbursement for"+ name+" for travel to "+ location +".");
		System.out.println("Mileage Amount Reimbursed = $"+calculateTheMileageAmountReimbursed(numberOfMiles));
		System.out.println("Hotel Amount Reimbursed = $"+costOfTheHotel);
		System.out.println("Total Amount Reimbursed= $"+calculateTheTotalAmountReimbursed(costOfTheHotel, numberOfMiles));
	}
}
