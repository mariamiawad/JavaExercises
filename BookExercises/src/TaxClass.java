public class TaxClass {
	public static final int  SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER =1;
	public static final int MARRIED_SEPARATELY =2;
	public static final int HEAD_OF_HOUSEHOLD =3;

	private int filingStatus;
	private int[][] brackets;

	private double[] rates;
	private double taxableIncome;

	public TaxClass() {

	}

	public TaxClass(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {

		this.brackets = brackets;
		this.filingStatus = filingStatus;

		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}

	public int[][] getBrackets() {
		return brackets;
	}

	public int getFilingStatus() {
		return filingStatus;
	}

	public double[] getRates() {
		return rates;
	}

	public double getTaxableIncome() {
		return taxableIncome;
	}

	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}

	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}

	public void setRates(double[] rates) {
		this.rates = rates;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	public double getTax() {
		return computeTax(getFilingStatus(), getTaxableIncome());
	}

	public static void main(String[] args) {
		int [][] brackets	= { { 8350, 33950, 82250, 171550, 372950 }, // Single filer
				{ 16700, 67900, 137050, 20885, 372950 }, // Married jointly or qualifying widow(er)
				{ 8350, 33950, 68525, 104425, 186475 }, // Married separately
				{ 11950, 45500, 117450, 190200, 372950 } // Head of household
		};
	double[] rates =  { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
		System.out.println(
				"Taxable Income   Single   Married Joint or Qualifying Widow(er)     Married Separate    Head Of a House ");
		for (double i = 50000; i <= 60000; i = i + 1000) {
			TaxClass taxClass = new TaxClass(TaxClass.SINGLE_FILER, brackets, rates, i);
			
			System.out.print(i + "            "
					+ taxClass.getTax() + "                  ");
			taxClass = new TaxClass(TaxClass.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER, brackets, rates, i);
			System.out.print(taxClass.getTax() + "                            ");
			taxClass = new TaxClass(TaxClass.MARRIED_SEPARATELY, brackets, rates, i);
			System.out.print(taxClass.getTax() + "          ");
			taxClass = new TaxClass(TaxClass.HEAD_OF_HOUSEHOLD, brackets, rates, i);
			System.out.print(taxClass.getTax());
			System.out.println();
		}
	}

	public static double computeTax(int status, double taxableIncome) {
		double tax = 0;
		if (status == 0) {
			if (taxableIncome <= 8350)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 33950)
				tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
			else if (taxableIncome <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
			else if (taxableIncome <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
			else if (taxableIncome <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (taxableIncome - 171550) * 0.33;
			else if (taxableIncome >= 372951)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
		} else if (status == 1) {
			if (taxableIncome <= 16700)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 67900)
				tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
			else if (taxableIncome <= 137050)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
			else if (taxableIncome <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
			else if (taxableIncome <= 372950)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 67900) * 0.28
						+ (taxableIncome - 208850) * 0.33;
			else if (taxableIncome >= 372951)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 67900) * 0.28
						+ (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
		}

		else if (status == 2) {
			if (taxableIncome <= 8350)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 33950)
				tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
			else if (taxableIncome <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
			else if (taxableIncome <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
			else if (taxableIncome <= 186475)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (taxableIncome - 104425) * 0.33;
			else if (taxableIncome >= 186476)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
		}

		else if (status == 3) {
			if (taxableIncome <= 11950)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 45500)
				tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
			else if (taxableIncome <= 117450)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
			else if (taxableIncome <= 190200)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
			else if (taxableIncome <= 372950)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
						+ (taxableIncome - 190200) * 0.33;
			else if (taxableIncome >= 372951)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
						+ (372950 - 190200) * 0.33 + (taxableIncome - 372951) * 0.35;
		}

		else {
			System.out.println("Error: invalid status");
			return 0;

		}
		return Math.round(tax);
	}

}