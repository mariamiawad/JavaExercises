import java.util.*;
public class DecimalToHex{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15):");
		int decimal = input.nextInt();
		if (decimal < 0 || decimal > 15) {
			System.out.println(decimal + " is an invalid input");
			System.exit(1);
		}
 
		System.out.println("The hex value is "+ Integer.toHexString(decimal).toUpperCase());
 
	}
}