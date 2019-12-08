import java.util.Scanner;

public class GCD {

	public GCD() {
		// 
	}
public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	int n = inputScanner.nextInt();
	int [] array = new int [n];
	for (int i = 0; i < array.length; i++) {
		array[i]= inputScanner.nextInt();
	}
	int result = array[0];
	for (int i = 1; i < array.length-1; i++) {
		result = gcd(array[i], result);
	}
	System.out.println(result);
}
private static int gcd(int a, int b) {
	if(b==0) {
		return a;
	}
	return gcd(b, a%b);
	
}
}
