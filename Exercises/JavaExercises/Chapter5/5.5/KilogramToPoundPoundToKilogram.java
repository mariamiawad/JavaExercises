import java.util.*;
public class KilogramToPoundPoundToKilogram{
	public static void main ( String [] args){
		int kiloToPound = 1;
		int poundToKilo = 20;
		int countKilo =0;
		int count=0;
		double kilo =0;
		double pound = 0;
		System.out.println("Kilograms      Pounds   | Pounds      Kilograms \n");
		while (count<199){
			pound = kiloToPound*2.2;
			kilo= poundToKilo/2.2;
			System.out.printf("%d         %10.3f    |    %d         %10.3f\n  " ,kiloToPound,pound,poundToKilo, kilo);
			poundToKilo +=5;
			kiloToPound+=2;
			count+=2;
			
		}
	}
}