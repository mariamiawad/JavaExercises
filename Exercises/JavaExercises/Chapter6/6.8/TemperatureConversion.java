import java.util.*;
public class TemperatureConversion{
	public static void main(String [] args){
		String s = "";
		s+="Celsius     Fahrenheit \n";
		for(double i=40; i>=31;i--){
			s+=i+"          " +celsiusToFahrenheit(i)+"\n";
		}
		s+="Fahrenheit        Celsius\n";
		for(double i=120; i>=30;i=i-10){
			s+= i+"        "+fahrenheitToCelsius(i)+"\n";
		}
		System.out.println(s);
		
	}
	public static double celsiusToFahrenheit(double celsius){
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	public static double fahrenheitToCelsius(double fahrenheit){
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}
}