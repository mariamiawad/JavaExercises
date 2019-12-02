import java.util.Arrays;
import java.util.Scanner;

public class OrderThreeCities {

	public OrderThreeCities() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	String [] stringCities = new String[3];
	System.out.println("Enter first city:");
	String first = inputScanner.next();
	System.out.println("Enter second city:");
	String second = inputScanner.next();
	System.out.println("Enter third city:");
	String third = inputScanner.next();
	stringCities[0]= first.toUpperCase();
	stringCities[1]= second.toUpperCase();
	stringCities[2] = third.toUpperCase();
	Arrays.sort(stringCities);
	for (int i = 0; i < stringCities.length; i++) {
		if(first.toUpperCase().equals(stringCities[i])) {
			System.out.print(first+" ");
		}
		else if(second.toUpperCase().equals(stringCities[i])) {
			System.out.print(second+" ");
		}
		else if(third.toUpperCase().equals(stringCities[i])) {
			System.out.print(third+" ");
}
	}
	
}
}
