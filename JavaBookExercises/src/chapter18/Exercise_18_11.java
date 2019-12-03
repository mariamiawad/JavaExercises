package chapter18;

public class Exercise_18_11 {

	public Exercise_18_11() {
	}
	public static void main(String[] args) {
		System.out.println(sumDigits(234));
	}
	public static int sumDigits(long n) {
		if(n== 0) {
			return 0;
		}
		
		return (int) (n%10 + sumDigits(n/10));
	}

}
