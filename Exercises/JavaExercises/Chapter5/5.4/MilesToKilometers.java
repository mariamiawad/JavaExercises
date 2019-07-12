import java.util.*;
public class MilesToKilometers{
	public static void main (String [] args){
		int miles = 1;
		int count = 0;
		double kilometer = 0.0;
		while(count<10){
			kilometer = miles * 1.609;
			System.out.printf("Miles      Kilometers \n %d         %10.3f\n" ,miles,kilometer);
			miles++;
			count++;
		}
	}
}