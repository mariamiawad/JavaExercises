import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DecimalToBinaryLoop {

	public DecimalToBinaryLoop() {
		// 
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		int decimal = inputScanner.nextInt();
		int remainder = 0;
		String string = "";
		int result = decimal;
		while(result>0) {

			remainder = result%2;
			result = result/2;
			string += remainder +"";
			
		}
		String resultString = "";
		for (int i = string.length()-1; i >=0; i--) {
			resultString += string.charAt(i)+"";
		}
		
		System.out.println(resultString);
	}
	

}
