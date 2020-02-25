
public class AlSaied2 {
	static final double MILEAGE_REIMBURSEMENT = 0.58;

	public static void main(String[] args) {

		double numberOfMiles = 115;
		double costOfTheHotel = 123;
		double mileageAmountReimbursed = MILEAGE_REIMBURSEMENT * numberOfMiles;
		double hotelAmountReimbursed = costOfTheHotel;
		double totalAmountReimbursed = mileageAmountReimbursed + hotelAmountReimbursed;
		for (int i = 0; i < 40; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 40; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("Mileage Amount Reimbursed = $" + mileageAmountReimbursed);
		System.out.println("Hotel Amount Reimbursed = $" + hotelAmountReimbursed);
		System.out.println("Total Amount Reimbursed = $" + totalAmountReimbursed);
	}
}
