package chapter19;


public abstract class Exercise_19_11_Generic<E extends Object> {

	protected abstract E add(E a, E b);

	protected abstract E subtract(E a, E b);

	protected abstract E multiply(E a, E b);

	protected abstract E divide(E a, E b);

	protected abstract E zero();

	public E[][] addMatrices(E[][] matrix1, E[][] matrix2) {
		if (matrix1.length != matrix2.length) {
			System.out.print("Matrices don't have the same length");
			System.exit(1);

		}
		E[][] result = (E[][]) new Object[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				result[i][j] = add(matrix1[i][j], matrix2[i][j]);
			}
		}
		return result;

	}

	public E[][] multiplyMatrices(E[][] matrix1, E[][] matrix2) {
		if (matrix1.length != matrix2.length) {
			System.out.print("Matrices don't have the same length");
			System.exit(1);

		}
		E[][] result = (E[][]) new Object[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				result[i][j] = zero();
				for (int k = 0; k < matrix1[0].length; k++) {
					result[i][j] = add(result[i][j], multiply(matrix1[i][k], matrix2[k][j]));
				}
			}
		}
		return result;

	}
}
