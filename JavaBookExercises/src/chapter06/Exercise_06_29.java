package chapter06;

public class Exercise_06_29 {

	public Exercise_06_29() {
		// 
	}

	public static void main(String[] args) {
		int i2 =3;
		for (int i = 2; i < 1000-2; i++) {
			if(isPrime(i) && isTwin(i)){
				System.out.println("("+i+","+ (i+2)+")");
			}
		}
	}
	public static boolean isTwin(int number) {
		if(isPrime(number+2)) {
			return true;
		}
		return false;
	}
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= Math.ceil(Math.sqrt(number)); divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}

		return true;
	}
}
