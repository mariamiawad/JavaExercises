import java.util.*;
public class MilesToKilometersKiloMetersToMiles{
	public static void main ( String [] args ){
		int count = 0;
		int kiloToMile= 20;
		int milesToKilo= 1;
		double kilo =0;
		double miles =0;
		System.out.println("Kilometers      Miles   | Miles      Kilometers \n");
		while (count <10){
			kilo = milesToKilo*1.609;
			miles= kiloToMile/1.609;
			System.out.printf("%d         %10.3f    |    %d         %10.3f\n  " ,milesToKilo,kilo,kiloToMile, miles);
			milesToKilo++;
			kiloToMile+= 5;
			count++;
			
			
		}
		
	}
}
