import java.util.*;



public class SumIntegers {
public static void main (String[] args){
	System.out.println("Enter a number between 0 and 1000:");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	int devisor = 10;
	int first = number%devisor;
	int second = number/devisor;
	int third = second%devisor;
	int fourth = second/devisor;
	int result = first+third+fourth;
	System.out.println("The sum of the digits " +result);
	
	
	
	
}
}