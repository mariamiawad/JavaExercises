import java.math.BigInteger;

public class Exercise_13_16 {
	/** Main method */
	public static void main(String[] args) {
		args = new String[3];
		args[0] = "3/4";
		args[1] = "*";
		args[2] = "1/5";
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		Exercise_13_15 result = null;
		String string1 = args[0].toString();

		String string2 = args[2].toString();

		String[] number1 = string1.split("/");
		String numenator1 = number1[0];
		String denominator1 = number1[1];

		String[] number2 = string2.split("/");
		String numenator2 = number2[0];
		String denominator2 = number2[1];
		Exercise_13_15 numb1 = new Exercise_13_15(BigInteger.valueOf(Integer.parseInt(numenator1)),
				BigInteger.valueOf(Integer.parseInt(denominator1)));
		Exercise_13_15 numb2 = new Exercise_13_15(BigInteger.valueOf(Integer.parseInt(numenator2)),
				BigInteger.valueOf(Integer.parseInt(denominator2)));
		switch (args[1].charAt(0)) {
		case '+':
			result = numb1.add(numb2);
			break;
		case '-':
			result = numb1.subtract(numb2);
			break;
		case '*':
			result = numb1.multiply(numb2);
			break;
		case '/':
			result = numb1.divide(numb2);

		}

		// Display result
		System.out.println(numenator1 + '/' + denominator1 + ' ' + args[1] + numenator2 + "/" + denominator2 + " = "
				+ result.getNumerator() + "/" + result.getDenominator());
	}
}