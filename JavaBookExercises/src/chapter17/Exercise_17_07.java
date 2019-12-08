package chapter17;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Exercise_17_07 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Exercise_17_07() {
		this(2.5, 1, 1000);
	}

	/**
	 * Construct a loan with specified annual interest rate, number of years, and
	 * loan amount
	 */
	public Exercise_17_07(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("Exercise_17_07.dat");

		try (FileOutputStream fileOutputStream = new FileOutputStream(file);
				ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);) {
			Exercise_17_07 loan1 = new Exercise_17_07(4, 5, 100);
			Exercise_17_07 loan2 = new Exercise_17_07(4, 5, 101);
			Exercise_17_07 loan3 = new Exercise_17_07(4, 5, 102);
			Exercise_17_07 loan4 = new Exercise_17_07(4, 5, 103);
			Exercise_17_07 loan5 = new Exercise_17_07(4, 5, 104);
			outputStream.writeObject(loan1);
			outputStream.writeObject(loan2);
			outputStream.writeObject(loan3);
			outputStream.writeObject(loan4);
			outputStream.writeObject(loan5);

		} catch (IOException e) {
	
			e.printStackTrace();
		}
		try (FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);) {
			while (true) {
				Exercise_17_07 loan = (Exercise_17_07) inputStream.readObject();
				System.out.println(loan.getLoanAmount());
			}

		} catch (EOFException e) {
			System.out.println("File ended");

		}
	}
}
