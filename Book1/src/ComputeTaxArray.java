import java.util.Scanner;

class ComputeTaxArray {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter filing status
		System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), "
				+ "\n2-married separately, 3-head of household)\n" + "Enter the filing status: ");
		int status = input.nextInt();

		if (status < 0 || status > 3) {
			System.out.println("Error: invalid status");
			System.exit(1);
		}
		// Prompt the user to enter taxable income
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();

		double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
		int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 }, // Single filer
				{ 16700, 67900, 137050, 20885, 372950 }, // Married jointly or qualifying widow(er)
				{ 8350, 33950, 68525, 104425, 186475 }, // Married separately
				{ 11950, 45500, 117450, 190200, 372950 } // Head of household
		};

		// Compute tax
		double tax = 0;

		if (income <= brackets[status][0])
			tax = income * 0.10;
		else if (income <= brackets[status][1])
			tax = 8350 * 0.10 + (income - 8350) * 0.15;
		else if (income <= brackets[status][2])
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
		else if (income <= brackets[status][3])
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
		else if (income <= brackets[status][4])
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
					+ (income - 171550) * 0.33;
		else
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
					+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35;

		// Display the result
		System.out.println("Tax is " + (int) (tax * 100) / 100.0);
	}
}
