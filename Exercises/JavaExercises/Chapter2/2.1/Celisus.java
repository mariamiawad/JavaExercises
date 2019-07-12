import java.util.*;



public class Celisus {
public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter tempreature in celisus:");
	double celisus = input.nextDouble();
	double fahrenheit = (9.0 / 5.0) * celisus + 32;
	System.out.println("Fahrenheit = " + fahrenheit);
	
}
}