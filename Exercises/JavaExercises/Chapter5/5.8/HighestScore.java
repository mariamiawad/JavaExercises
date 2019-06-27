import java.util.*;
public class HighestScore{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int number = input.nextInt();
		double highestScore =0;
		String studentHighestName= " ";
		System.out.println("Enter each student’s name and score");
		while (number >0){
			String name = input.next();
			double score = input.nextDouble();
			if (highestScore<score){
				highestScore =score ;
				studentHighestName =name;
			}
			number--;
			
			
		}
		System.out.println("The name of the student with the highest score is "+studentHighestName);
		
	}
}