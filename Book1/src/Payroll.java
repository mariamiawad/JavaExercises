import java.util.Scanner;

public class Payroll {

	public Payroll() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter employee's name:");
		String name = inputScanner.next();
		System.out.println("Enter number of hours worked in a week");
		double hours = inputScanner.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double hourlyPayRate = inputScanner.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double fedralTaxRate = inputScanner.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double stateTaxRate = inputScanner.nextDouble();
		double grossPay = hourlyPayRate * hours;
		double fedralWithdowing = fedralTaxRate *grossPay;
		double stateWithdrowing = stateTaxRate * grossPay;
		double totalDeduction = stateWithdrowing + fedralWithdowing;
		double netPay = grossPay - totalDeduction;
		System.out.println("Employee Name: "+ name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate:" + hourlyPayRate);
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Deductions: ");
		System.out.println("Federal Withholding (" +fedralTaxRate*100+ "$) "+ fedralWithdowing);
		System.out.println("State Withholding (" +stateTaxRate*100+ "$) "+ stateWithdrowing);
		System.out.println("Total Deduction: $" + totalDeduction);
		System.out.println("Net Pay : $" + netPay);
	}
}
