import java.util.*;
public class MeterFeetConversion{
	public static void main( String [] args){
		System.out.println("Foot     Meter");
		for (double i =1; i<=10;i++){
			double meter = footToMeter(i);
			System.out.println(i+"    "+meter);
		}
		System.out.println("Meter     Foot");
		for (double i =20; i<=65;i+=5){
			double foot = meterToFoot(i);
			System.out.println(i+"    "+foot);
		}
	}
	public static double footToMeter(double foot){
		double meter = 0.305 * foot;
		return meter;
	}
	public static double meterToFoot(double meter){
		double foot = 3.279 * meter;
		return foot;
	}
}