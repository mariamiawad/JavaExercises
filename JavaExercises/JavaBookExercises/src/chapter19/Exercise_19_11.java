package chapter19;

import java.util.Random;

import chapter13.Exercise_13_17;

public class Exercise_19_11 extends Exercise_19_11_Generic<Exercise_13_17> {

	public static void main(String[] args) {
		Exercise_13_17[][] complexNumbers1 = new Exercise_13_17[3][3];
		Random random = new Random();
		for (int i = 0; i < complexNumbers1.length; i++) {
			for (int j = 0; j < complexNumbers1[i].length; j++) {

				complexNumbers1[i][j] = new Exercise_13_17(((random.nextInt(10)+1)*1.0), ((random.nextInt(10)+1)*1.0));
			}
		}
		
		Exercise_13_17[][] complexNumbers2 = new Exercise_13_17[3][3];
		for (int i = 0; i < complexNumbers2.length; i++) {
			for (int j = 0; j < complexNumbers2[i].length; j++) {

				complexNumbers2[i][j] = new Exercise_13_17(((random.nextInt(10)+1)*1.0), ((random.nextInt(10)+1)*1.0));
			}
		}
		Exercise_19_11 matrix1 = new Exercise_19_11();
		Exercise_19_11.printResult(complexNumbers1, complexNumbers2, matrix1.addMatrices(complexNumbers1, complexNumbers2), '+');
	}
	
	public static void printResult(
            Object[][] m1, Object[][] m2, Object[][] m3, char op) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++)
                System.out.print(" " + m1[i][j]);

            if (i == m1.length / 2)
                System.out.print("  " + op + "  ");
            else
                System.out.print("     ");

            for (int j = 0; j < m2.length; j++)
                System.out.print(" " + m2[i][j]);

            if (i == m1.length / 2)
                System.out.print("  =  ");
            else
                System.out.print("     ");

            for (int j = 0; j < m3.length; j++)
                System.out.print(m3[i][j] + " ");

            System.out.println();
        }
    }

	@Override
	protected Exercise_13_17 add(Exercise_13_17 a, Exercise_13_17 b) {

		return a.add(b);
	}

	@Override
	protected Exercise_13_17 subtract(Exercise_13_17 a, Exercise_13_17 b) {

		return a.subtract(b);
	}

	@Override
	protected Exercise_13_17 multiply(Exercise_13_17 a, Exercise_13_17 b) {

		return a.multiply(b);
	}

	@Override
	protected Exercise_13_17 divide(Exercise_13_17 a, Exercise_13_17 b) {

		return a.subtract(b);
	}

	@Override
	protected Exercise_13_17 zero() {

		return new Exercise_13_17(0);
	}

}
