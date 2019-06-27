import java.util.*;
public class TowHighestScore{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of Students " );
		int number = input.nextInt();
		System.out.println("Enter number of Name and Score " );
		String name = " ";
		String firstName = " " ;
		String secondName = " ";
		double score = 0;
		double firstScore = 0;
		double secondScore=0;
		double temp=0;
		String tempName=" ";
		while (number>0){
			name = input.next();
			score = input.nextDouble();
			if (firstScore<score){
				firstScore = score;
				firstName= name;
			}
			for (int i =0;i<number+1; i++){
			if (secondScore<firstScore){
				temp=firstScore;
				firstScore= secondScore;
				secondScore = temp;
				tempName= firstName;
				firstName = secondName;
				secondName = tempName;
			}
		}
			number--;
		}
		temp = firstScore ;
		firstScore =secondScore;
		secondScore=temp;
		tempName= firstName;
		firstName=secondName;
		secondName= tempName;
		System.out.println("the student with the highest score is " +firstName+" and the student with the second highest score is "+ secondName);
	}
}