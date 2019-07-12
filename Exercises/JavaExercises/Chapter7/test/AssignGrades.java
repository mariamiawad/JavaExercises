import java.util.*;
public class AssignGrades{
	public static void main( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = input.nextInt();
		System.out.println("Enter " +n + "scores");
		double [] scores = new double[n];
		for (int i =0;i<n;i++)
		{
			scores[i] = input.nextDouble();
		}
		double max=0;
		for (int i= 0; i<n;i++)
		{
			if(max<scores[i])
			{
				max=scores[i];
			}
		}
		char grade;
		for (int i =0; i<n; i++){
			if(scores[i]>=max-10)
			{
				grade ='A';
			}
			else if ( scores[i] >= max-20){
				grade='B';
			}
			else if ( scores[i] >= max-30){
				grade='C';
			}
			else if ( scores[i] >= max-40){
				grade='D';
			}
			else {
				grade='F';
			}
			System.out.println("Student " + i +" " + scores[i] + " is " + grade);
		}
		
	}
}