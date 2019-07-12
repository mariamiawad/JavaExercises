import java.util.*;
public class KilogramToPound{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		int kilo = 1;
		double pound = 0.0;
		while (count<=199){
			pound = kilo * 2.2;
			System.out.printf("Kilograms      Pounds \n %d         %10.1f\n" ,kilo,pound);
			kilo +=2;
			count+=2;
		}
	}
}