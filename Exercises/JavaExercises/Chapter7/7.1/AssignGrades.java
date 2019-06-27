import java.util.*;
public class AssignGrades{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = input.nextInt();
		System.out.println("Enter "+ n + " scores:");
		double max= 0;
		double [] studentsGrade  = new double [n];
		for (int i=0; i<n;i++){
			studentsGrade[i] = input.nextDouble();
			if(max<studentsGrade[i]){
				max = studentsGrade[i];
			}
		}
		char grade;
		for (int i =0; i<studentsGrade.length ;i++){
			double min = studentsGrade[i];
			if (studentsGrade[i]>= max -10){
				grade = 'A';
			}
			else if (studentsGrade[i]>= max -20){
				grade = 'B';
			}
			else if (studentsGrade[i]>= max -30){
				grade = 'C';
			}
			else if (studentsGrade[i]>= max -40){
				grade = 'D';
			}
			else {
				grade ='F';
			}
			System.out.println("Student "+i+" score is " +studentsGrade[i]+ " "+grade);
		}
	}
	
}