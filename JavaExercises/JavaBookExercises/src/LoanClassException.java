
public class LoanClassException extends IllegalArgumentException {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public LoanClassException() {
		this(2.5, 1, 1000);
	}

	public LoanClassException(double annualInterestRate, int numberOfYears, double loanAmount) {
		if(annualInterestRate <=0 || numberOfYears <=0 || loanAmount <=0) {
			throw new IllegalArgumentException();
		}
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
	public static void main(String[] args) {
		LoanClassException loanClassException = new LoanClassException(7,1,10000);
		System.out.println(loanClassException.getAnnualInterestRate());
		System.out.println(loanClassException.getLoanAmount());
		System.out.println(loanClassException.getNumberOfYears());
		System.out.println(loanClassException.getTotalPayment());
		System.out.println(loanClassException.getLoanDate());
		LoanClassException loan = new LoanClassException(0,1,2);
		
	}
}
