import java.util.*;
public class WindChillTemp{
	public static void main ( String []  args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a temperature and a wind speed.");
		double temp = input.nextDouble();
		double wind = input.nextDouble();
		if ( temp <-58 || temp >41 || wind <2 ){
			System.out.println("Invalid number");
			System.exit(1);
		}
		else {
			double speed = 35.74 +0.6125*temp- 35.75 * (Math.pow(wind,0.16))+0.4275*temp *(Math.pow(wind,0.16));
			System.out.println(" The Temperature is " + speed);
		}
	}
}